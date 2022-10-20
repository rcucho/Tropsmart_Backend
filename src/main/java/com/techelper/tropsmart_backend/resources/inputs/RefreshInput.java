package com.techelper.tropsmart_backend.resources.inputs;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RefreshInput {
    private String token;
    private String refreshToken;
    private Integer userId;
}
