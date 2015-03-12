package com.ztt.dto;

import java.io.Serializable;

/**
 * Created by zhoutaotao on 3/6/15.
 */
public class ImageDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String url;
    private String title;
    private String desc;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
