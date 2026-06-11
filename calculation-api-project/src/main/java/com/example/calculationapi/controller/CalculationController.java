package com.example.calculationapi.controller;

import com.example.calculationapi.dto.BmiRequest;
import com.example.calculationapi.dto.BmiResponse;
import com.example.calculationapi.dto.CalculationRequest;
import com.example.calculationapi.dto.CalculationResponse;
import com.example.calculationapi.service.CalculationService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/calculations")
public class CalculationController {

    private final CalculationService calculationService;

    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping("/health")
    public ResponseEntity<Map<String, Object>> health() {
        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", "Calculation API is running");
        return ResponseEntity.ok(response);
    }

    @PostMapping("/add")
    public ResponseEntity<CalculationResponse> add(@Valid @RequestBody CalculationRequest request) {
        return ResponseEntity.ok(calculationService.add(request));
    }

    @PostMapping("/subtract")
    public ResponseEntity<CalculationResponse> subtract(@Valid @RequestBody CalculationRequest request) {
        return ResponseEntity.ok(calculationService.subtract(request));
    }

    @PostMapping("/multiply")
    public ResponseEntity<CalculationResponse> multiply(@Valid @RequestBody CalculationRequest request) {
        return ResponseEntity.ok(calculationService.multiply(request));
    }

    @PostMapping("/divide")
    public ResponseEntity<CalculationResponse> divide(@Valid @RequestBody CalculationRequest request) {
        return ResponseEntity.ok(calculationService.divide(request));
    }

    @PostMapping("/percentage")
    public ResponseEntity<CalculationResponse> percentage(@Valid @RequestBody CalculationRequest request) {
        return ResponseEntity.ok(calculationService.percentage(request));
    }

    @PostMapping("/bmi")
    public ResponseEntity<BmiResponse> bmi(@Valid @RequestBody BmiRequest request) {
        return ResponseEntity.ok(calculationService.calculateBmi(request));
    }
}
