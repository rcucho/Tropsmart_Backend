package com.techelper.tropsmart_backend.services;

import com.techelper.tropsmart_backend.models.PaymentMethod;
import com.techelper.tropsmart_backend.resources.comunications.PaymentMethodResponse;
import com.techelper.tropsmart_backend.resources.inputs.PaymentMethodInput;

public interface IPaymentMethodService extends ICrudService<PaymentMethod> {
    PaymentMethodResponse findAllPaymentMethod();
    PaymentMethodResponse findPaymentMethodById(int paymentMethodId);
    PaymentMethodResponse findPaymentMethodByUserId(int userId);
    PaymentMethodResponse addPaymentMethodByUserId(int userId, PaymentMethodInput paymentMethodInput);
}
