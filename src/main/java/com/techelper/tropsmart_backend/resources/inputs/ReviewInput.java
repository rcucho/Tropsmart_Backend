package com.techelper.tropsmart_backend.resources.inputs;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReviewInput {
    private String commentary;
    private double calification;
}
