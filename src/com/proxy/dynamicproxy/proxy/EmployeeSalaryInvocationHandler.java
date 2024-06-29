package com.proxy.dynamicproxy.proxy;

import com.proxy.dynamicproxy.IEmployee;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;

public class EmployeeSalaryInvocationHandler implements InvocationHandler {

    //Target Object
    private IEmployee employee;

    public EmployeeSalaryInvocationHandler(IEmployee employee) {
        this.employee = employee;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        //pre processing
        if(args != null && args[0] instanceof Double){
            if ((double) args[0] < 0){
                throw new RuntimeException("Amount is not valid");
            }
        }

        //making actual call to my service layer
        Object returnValue = method.invoke(employee, args);

        // post processing
        System.out.println("Executing method: " + method.getName() +
                " for employee id: " + employee.getId());

        return returnValue;
    }
}
