package com.techelper.tropsmart_backend.resources.inputs;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonInput {

    public long id;
    public String firstName;
    public String lastName;

}
