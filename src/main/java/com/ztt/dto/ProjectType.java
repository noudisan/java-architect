package com.ztt.dto;


public enum ProjectType {
    sybg("商业办公"),jzgh("居住规划"),jgsj("景观设计"),whjy("文化教育"),zydc("资源地产");

    private String name;

    private ProjectType(String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println(ProjectType.jgsj.toString());
    }
}
