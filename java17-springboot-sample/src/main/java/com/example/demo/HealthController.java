package com.example.demo;
import org.springframework.web.bind.annotation.*;
@RestController
public class HealthController {
 @GetMapping("/health")
 public String health(){ return "Application is running"; }
}
