package com.example.calculationapi.service;

import com.example.calculationapi.dto.BmiRequest;
import com.example.calculationapi.dto.BmiResponse;
import com.example.calculationapi.dto.CalculationRequest;
import com.example.calculationapi.dto.CalculationResponse;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    public CalculationResponse add(CalculationRequest request) {
        double result = request.getNum1() + request.getNum2();
        return response("ADD", request, result);
    }

    public CalculationResponse subtract(CalculationRequest request) {
        double result = request.getNum1() - request.getNum2();
        return response("SUBTRACT", request, result);
    }

    public CalculationResponse multiply(CalculationRequest request) {
        double result = request.getNum1() * request.getNum2();
        return response("MULTIPLY", request, result);
    }

    public CalculationResponse divide(CalculationRequest request) {
        if (request.getNum2() == 0) {
            throw new IllegalArgumentException("num2 should not be zero for division");
        }
        double result = request.getNum1() / request.getNum2();
        return response("DIVIDE", request, round(result));
    }

    public CalculationResponse percentage(CalculationRequest request) {
        double result = (request.getNum1() * request.getNum2()) / 100;
        return response("PERCENTAGE", request, round(result));
    }

    public BmiResponse calculateBmi(BmiRequest request) {
        double heightMeter = request.getHeightCm() / 100;
        double bmi = round(request.getWeightKg() / (heightMeter * heightMeter));
        String category = getBmiCategory(bmi);
        return new BmiResponse(true, request.getWeightKg(), request.getHeightCm(), bmi, category, "BMI calculated successfully");
    }

    private CalculationResponse response(String operation, CalculationRequest request, double result) {
        return new CalculationResponse(true, operation, request.getNum1(), request.getNum2(), result, "Calculation completed successfully");
    }

    private String getBmiCategory(double bmi) {
        if (bmi < 18.5) return "UNDER_WEIGHT";
        if (bmi < 25) return "NORMAL";
        if (bmi < 30) return "OVER_WEIGHT";
        return "OBESE";
    }

    private double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
