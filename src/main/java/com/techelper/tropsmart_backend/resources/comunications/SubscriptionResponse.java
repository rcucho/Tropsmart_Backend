package com.techelper.tropsmart_backend.resources.comunications;

import com.techelper.tropsmart_backend.resources.outputs.SubscriptionOutput;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SubscriptionResponse extends BaseResponse<SubscriptionOutput>{
    public SubscriptionResponse(List<SubscriptionOutput> subscriptionOutputList) {super(subscriptionOutputList);}
    public SubscriptionResponse(SubscriptionOutput subscriptionOutput) {super(subscriptionOutput);}
    public SubscriptionResponse(String message) {super(message);}
}
