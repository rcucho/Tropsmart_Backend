package com.techelper.tropsmart_backend.resources.comunications;

import com.techelper.tropsmart_backend.resources.outputs.AuthenticatedOutput;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class AuthResponse extends BaseResponse<AuthenticatedOutput> {
    public AuthResponse(List<AuthenticatedOutput> authenticatedOutputList){super(authenticatedOutputList);}
    public AuthResponse(AuthenticatedOutput authenticatedOutput){ super(authenticatedOutput);}
    public AuthResponse(String message){super(message);}
}
