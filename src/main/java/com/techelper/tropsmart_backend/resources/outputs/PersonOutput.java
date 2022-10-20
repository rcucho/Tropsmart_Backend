package com.techelper.tropsmart_backend.resources.outputs;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonOutput {
    private String firstName;
    private String lastName;
    private String email;
    private String userType;
}
