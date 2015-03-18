package com.base.dto;

import com.base.query.DefaultPagableAndSortableCriteria;

import java.io.Serializable;

/**
 * Created by zhoutaotao on 2014/10/29.
 */
public class ArchitectSearchDto  extends DefaultPagableAndSortableCriteria implements Serializable, Cloneable  {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
