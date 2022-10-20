package com.techelper.tropsmart_backend.services;

import com.techelper.tropsmart_backend.models.Subscription;
import com.techelper.tropsmart_backend.resources.comunications.SubscriptionResponse;

public interface ISubscriptionService extends ICrudService<Subscription> {
    SubscriptionResponse findSubscriptionById(int subscriptionId);
    SubscriptionResponse subscribe(int userId, int planId);
    SubscriptionResponse findSubscriptionsByUserId(int userId);
    SubscriptionResponse findAllSubscriptions();
    SubscriptionResponse cancelSubscription(int subscriptionId);
    SubscriptionResponse enableSubscriptionById(int subscriptionId);
    SubscriptionResponse deleteSubscriptionBySubscriptionId(int subscriptionId);
}
