package com.proxy.dynamicproxy;

public interface IEmployee {
    void giveHike(double amount);
    void payCut(double amount);

    //access
    int getId();
    void setId(int id);
    String getName();
    void setName(String name);
    double getSalary();
    void setSalary(double salary);
}
