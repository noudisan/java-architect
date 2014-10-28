package com.ztt.mybatisinterceptor;

import com.ztt.query.DefaultPagableAndSortableCriteria;
import org.apache.ibatis.executor.statement.PreparedStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Properties;


public class PagingationAndSortInterceptor implements Interceptor {


    public Object intercept(Invocation invocation) throws Throwable {
        return invocation.proceed();
    }

    public Object plugin(Object target) {
        Type[] interfaces = target.getClass().getGenericInterfaces();
        for (Type i : interfaces) {
            if (i.equals(StatementHandler.class)) {
                StatementHandler statementHandler = (StatementHandler) target;
                Field statementField = ReflectionUtils.findField(statementHandler.getClass(), "delegate");
                ReflectionUtils.makeAccessible(statementField);
                Object fieldInstance = ReflectionUtils.getField(statementField, statementHandler);

                Field mappedStatementField = ReflectionUtils.findField(fieldInstance.getClass(), "mappedStatement");
                ReflectionUtils.makeAccessible(mappedStatementField);

                MappedStatement mappedStatement = (MappedStatement) ReflectionUtils.getField(mappedStatementField, fieldInstance);

                if (mappedStatement.getSqlCommandType() == SqlCommandType.SELECT && fieldInstance.getClass().equals(PreparedStatementHandler.class)) {
                    PreparedStatementHandler preparedStatementHandler = (PreparedStatementHandler) fieldInstance;
                    BoundSql boundSql = preparedStatementHandler.getBoundSql();
                    if (boundSql.getParameterObject() != null &&
                            (boundSql.getParameterObject().getClass().getSuperclass().equals(DefaultPagableAndSortableCriteria.class)
                            || boundSql.getParameterObject().getClass().getSuperclass().equals(BaseSearch.class)
                            )) {
                        String additionalSql = null;
                        if (boundSql.getParameterObject().getClass().getSuperclass().equals(DefaultPagableAndSortableCriteria.class)) {
                            DefaultPagableAndSortableCriteria pagableAndSortableCriteria = (DefaultPagableAndSortableCriteria) boundSql.getParameterObject();
                            additionalSql = pagableAndSortableCriteria.getSqlString();
                        } else if (boundSql.getParameterObject().getClass().getSuperclass().equals(BaseSearch.class)) {
                            BaseSearch baseSearch = (BaseSearch) boundSql.getParameterObject();
                            additionalSql = baseSearch.getSqlString();
                        }

                        String sql = boundSql.getSql() + additionalSql;
                        Field sqlField = ReflectionUtils.findField(BoundSql.class, "sql");
                        ReflectionUtils.makeAccessible(sqlField);
                        ReflectionUtils.setField(sqlField, boundSql, sql);
                    }
                    return target;
                }
            }
        }
        return target;
    }

    public void setProperties(Properties properties) {

    }
}

