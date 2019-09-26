package com.base.dto;



import com.base.query.DefaultPagableAndSortableCriteria;

import java.io.Serializable;
import java.util.Date;

public class ExportFileDto extends DefaultPagableAndSortableCriteria implements Serializable, Cloneable {
    //GENERATE
    public enum GenerateStatus {
        GENERATE_ING, GENERATE_SUCCESS, GENERATE_FAILED
    }

    private Long id;
    private String fileName;//文件名称
    private String filePath;//文件绝对路径
    private Date startDate;//开始时间
    private Date endDate;//结束时间
    private GenerateStatus status;//状态 下载中...下载完成...下载失败....
    private String message;//错误信息，现在失败信息存入
    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public GenerateStatus getStatus() {
        return status;
    }

    public void setStatus(GenerateStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
