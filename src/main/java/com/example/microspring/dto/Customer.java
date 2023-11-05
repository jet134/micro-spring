package com.example.microspring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @Author: Jet Ma
 * @Created: 5/11/2023
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class Customer {
    private UUID id;
    private String name;
}
