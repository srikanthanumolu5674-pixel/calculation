package com.example.calculationapi.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class BmiRequest {

    @NotNull(message = "weightKg is required")
    @Positive(message = "weightKg must be greater than 0")
    private Double weightKg;

    @NotNull(message = "heightCm is required")
    @Positive(message = "heightCm must be greater than 0")
    private Double heightCm;

    public Double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(Double weightKg) {
        this.weightKg = weightKg;
    }

    public Double getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(Double heightCm) {
        this.heightCm = heightCm;
    }
}
