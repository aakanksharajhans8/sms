package com.cams.sms.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*;
import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data //equivalent to @Setter+@Getter+@ToString+@EqualsAndHashCode
public class Customer {
    @Id
    @Positive(message = "the stock id should be a positive number")
    private int id;
    @NotBlank(message = "The stock can't be empty")
    private String name;
    @Positive(message = "the stock unit should be a positive number")
    private int unit;
    private long total;
}
