package org.example.calculatorapp;

public class Calculator {

    private int op1;
    private int op2;
    private char operator;
    private int result;
    private boolean isError ;

    public void calculate(){

        if(this.operator == '+'){
            this.result = this.op1 + this.op2;
        }

        if(this.operator == '-'){
            this.result = this.op1 - this.op2;
        }
        if(this.operator == '*'){
            this.result = this.op1 * this.op2;
        }
        if(this.operator == '/'){
           // Проверка на деление на ноль
           if (this.op2 != 0) {
               this.result = this.op1 / this.op2;
           } else {
               // Обработка ошибки деления на ноль
               isError=true;
               System.out.println("Error: Division by zero.");
               this.result = 0;

           }
            // this.result = this.op1 / this.op2;
        }
        if(this.operator == 'N'){
            this.result = this.op1*(-1);
        }

    }


    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public boolean isError(){
        return  isError;
    }
}