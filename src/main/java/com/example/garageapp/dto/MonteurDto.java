package com.example.garageapp.dto;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Data
public class MonteurDto {

    private final Long id;


    @NotBlank
    private final String firstName;

    @Size(min = 2, max = 128, message = "last name size must be between 2 and 128")
    private final String lastName;

    @Max(value = 4000, message = "salary must be less than or equal to 4000!")
    private final int salary;

}
