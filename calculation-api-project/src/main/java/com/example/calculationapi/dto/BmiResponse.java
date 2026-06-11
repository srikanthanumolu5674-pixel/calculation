package com.example.calculationapi.dto;

public class BmiResponse {

    private boolean success;
    private Double weightKg;
    private Double heightCm;
    private Double bmi;
    private String category;
    private String message;

    public BmiResponse(boolean success, Double weightKg, Double heightCm, Double bmi, String category, String message) {
        this.success = success;
        this.weightKg = weightKg;
        this.heightCm = heightCm;
        this.bmi = bmi;
        this.category = category;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public Double getHeightCm() {
        return heightCm;
    }

    public Double getBmi() {
        return bmi;
    }

    public String getCategory() {
        return category;
    }

    public String getMessage() {
        return message;
    }
}
