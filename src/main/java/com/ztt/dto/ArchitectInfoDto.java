package com.ztt.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhoutaotao on 3/16/15.
 */
public class ArchitectInfoDto implements Serializable, Cloneable  {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Long architectId;

    private String desc1;

    private String desc2;

    private String desc3;

    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArchitectId() {
        return architectId;
    }

    public void setArchitectId(Long architectId) {
        this.architectId = architectId;
    }

    public String getDesc1() {
        return desc1;
    }

    public void setDesc1(String desc1) {
        this.desc1 = desc1;
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }

    public String getDesc3() {
        return desc3;
    }

    public void setDesc3(String desc3) {
        this.desc3 = desc3;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
