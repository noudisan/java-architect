package com.ztt.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhoutaotao on 2014-11-14.
 */
public class ArchitectDetailDto implements Serializable, Cloneable  {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String imagePath;
    private String remarks;
    private Date createDate;
    private String status;//是否有效 默认为1
    private Long architectId;
    private Integer sort;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getArchitectId() {
        return architectId;
    }

    public void setArchitectId(Long architectId) {
        this.architectId = architectId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
