package com.techelper.tropsmart_backend.services;

import com.techelper.tropsmart_backend.models.Balance;
import com.techelper.tropsmart_backend.resources.comunications.BalanceResponse;

public interface IBalanceService extends ICrudService<Balance>{
    BalanceResponse findBalanceById(int userId);
    BalanceResponse findAllBalances();
}
