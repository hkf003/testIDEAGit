package com.atguigu.bean;

public class Person {
    private String pName;
    private String pPhone;
    private String gogo;
    private Integer age;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpPhone() {
        return pPhone;
    }

    public void setpPhone(String pPhone) {
        this.pPhone = pPhone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pName='" + pName + '\'' +
                ", pPhone='" + pPhone + '\'' +
                '}';
    }
}
