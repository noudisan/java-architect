package com.ztt.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class ArchitectDto implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String imagePath;
    private String remarks;
    private String type;
    private Date createDate;
    private String status;//是否有效 默认为1

    private List<ArchitectDetailDto> architectDetailDtoList;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ArchitectDetailDto> getArchitectDetailDtoList() {
        return architectDetailDtoList;
    }

    public void setArchitectDetailDtoList(List<ArchitectDetailDto> architectDetailDtoList) {
        this.architectDetailDtoList = architectDetailDtoList;
    }
}
