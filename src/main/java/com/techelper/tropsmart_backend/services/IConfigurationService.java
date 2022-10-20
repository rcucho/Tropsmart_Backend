package com.techelper.tropsmart_backend.services;

import com.techelper.tropsmart_backend.models.Configuration;
import com.techelper.tropsmart_backend.resources.comunications.ConfigurationResponse;
import com.techelper.tropsmart_backend.resources.inputs.ConfigurationInput;
import com.techelper.tropsmart_backend.resources.inputs.PaymentMethodInput;

public interface IConfigurationService extends ICrudService<Configuration> {
    ConfigurationResponse findAllConfigurations();
    ConfigurationResponse findConfigurationByUserId(int userId);
    ConfigurationResponse addPaymentMethod(int userId, PaymentMethodInput paymentMethodInput);
    ConfigurationResponse updateConfiguration(int userId, ConfigurationInput configurationInput);
    ConfigurationResponse generateConfiguration(int userId);
}
