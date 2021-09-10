package com.Shubham.OCP_Principle;

public class Calculator {
    public void calculate(Operation operation) throws Exception{
        if(operation == null){
            throw new Exception("Can not perform operation");
        }

        operation.perform();
    }
}
