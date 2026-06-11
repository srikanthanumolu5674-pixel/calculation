# Calculation API - Spring Boot Java 17

This is a small sample Spring Boot project for calculator APIs. It has no database interaction.

## Java and Build

- Java: 17
- Build Tool: Maven
- Spring Boot: 3.3.5
  test pipelines

## How to Run

```bash
mvn clean package
mvn spring-boot:run
```

Application runs on:

```text
http://localhost:8080
```

## Postman APIs

### Health Check
GET `http://localhost:8080/api/v1/calculations/health`

### Add
POST `http://localhost:8080/api/v1/calculations/add`

```json
{
  "num1": 10,
  "num2": 5
}
```

### Subtract
POST `http://localhost:8080/api/v1/calculations/subtract`

```json
{
  "num1": 10,
  "num2": 5
}
```

### Multiply
POST `http://localhost:8080/api/v1/calculations/multiply`

```json
{
  "num1": 10,
  "num2": 5
}
```

### Divide
POST `http://localhost:8080/api/v1/calculations/divide`

```json
{
  "num1": 10,
  "num2": 5
}
```

### Percentage
POST `http://localhost:8080/api/v1/calculations/percentage`

This calculates `num2% of num1`.

```json
{
  "num1": 1000,
  "num2": 15
}
```

### BMI
POST `http://localhost:8080/api/v1/calculations/bmi`

```json
{
  "weightKg": 92,
  "heightCm": 170
}
```

## Sample Response

```json
{
  "success": true,
  "operation": "ADD",
  "num1": 10.0,
  "num2": 5.0,
  "result": 15.0,
  "message": "Calculation completed successfully"
}
```
