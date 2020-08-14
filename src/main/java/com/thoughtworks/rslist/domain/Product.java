package com.thoughtworks.rslist.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @NotNull
    private String name;
    @NotNull
    private String unit;
    @NotNull
    private double price;
    private String imageUrl;
}
