package com.nantian.model;

/**
 * Created by nantian on 2017/8/4.
 */
public class Demo
{
    private String name;

    private String password;

    public Demo() {
    }

    public Demo(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }



}
