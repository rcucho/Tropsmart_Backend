package com.techelper.tropsmart_backend.services;

import com.techelper.tropsmart_backend.resources.comunications.AuthResponse;
import com.techelper.tropsmart_backend.resources.inputs.RefreshInput;
import com.techelper.tropsmart_backend.resources.inputs.SignUp;

public interface IAuthService {
    AuthResponse registerComplete(SignUp signUp);
    AuthResponse login(String email, String password);
    //AuthResponse refresh(RefreshInput refreshInput) throws Exception;
}
