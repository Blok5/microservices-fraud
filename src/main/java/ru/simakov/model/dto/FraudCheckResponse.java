package ru.simakov.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FraudCheckResponse {
    private Long id;
    private Boolean isFraudster;
}
