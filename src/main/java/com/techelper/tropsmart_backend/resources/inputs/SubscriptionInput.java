package com.techelper.tropsmart_backend.resources.inputs;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SubscriptionInput {
    private int userId;
    private int planId;


}
