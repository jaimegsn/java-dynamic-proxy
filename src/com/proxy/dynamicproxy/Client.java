package com.proxy.dynamicproxy;

import com.proxy.dynamicproxy.proxy.EmployeeSalaryInvocationHandler;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        ITEmployee itEmployee = new ITEmployee();

        itEmployee.setId(1);
        itEmployee.setName("Jaime");
        itEmployee.setSalary(4000);

        //itEmployee.giveHike(-3000); // Isso não pode acontecer, pois o valor deve ser positivo

        EmployeeSalaryInvocationHandler empHandler = new EmployeeSalaryInvocationHandler(itEmployee);

        IEmployee employee = (IEmployee) Proxy.newProxyInstance(
                ITEmployee.class.getClassLoader(),
                new Class[]{IEmployee.class},
                empHandler
        );

        employee.giveHike(6000);
        System.out.println(employee.getSalary());
    }
}
