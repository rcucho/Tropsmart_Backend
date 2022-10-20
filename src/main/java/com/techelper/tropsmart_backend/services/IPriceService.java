package com.techelper.tropsmart_backend.services;

import com.techelper.tropsmart_backend.models.Price;
import com.techelper.tropsmart_backend.resources.comunications.PriceResponse;

public interface IPriceService extends ICrudService<Price> {
    PriceResponse findAllPrices();
    PriceResponse findPriceById(int priceId);
    PriceResponse findPricesByPriceType(int priceType);
}
