package com.techelper.tropsmart_backend.resources.inputs;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RelationInput {
    public int userFrom;
    public int userTo;
}
