package com.example.demo.domain;

import java.util.List;

public class Member {
    
    private String name;
    private Integer aInteger;
    private List<String> hobbyList;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getaInteger() {
        return aInteger;
    }
    public void setaInteger(Integer aInteger) {
        this.aInteger = aInteger;
    }
    public List<String> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    
}
