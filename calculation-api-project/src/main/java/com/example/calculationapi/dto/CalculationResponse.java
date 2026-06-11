package com.example.calculationapi.dto;

public class CalculationResponse {

    private boolean success;
    private String operation;
    private Double num1;
    private Double num2;
    private Double result;
    private String message;

    public CalculationResponse(boolean success, String operation, Double num1, Double num2, Double result, String message) {
        this.success = success;
        this.operation = operation;
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getOperation() {
        return operation;
    }

    public Double getNum1() {
        return num1;
    }

    public Double getNum2() {
        return num2;
    }

    public Double getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }
}
