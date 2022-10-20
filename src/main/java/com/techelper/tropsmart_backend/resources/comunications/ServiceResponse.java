package com.techelper.tropsmart_backend.resources.comunications;

import com.techelper.tropsmart_backend.resources.outputs.ServiceOutput;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ServiceResponse extends BaseResponse<ServiceOutput>{
    public ServiceResponse(List<ServiceOutput> serviceOutputList) {super(serviceOutputList);}
    public ServiceResponse(ServiceOutput serviceOutput) {super(serviceOutput);}
    public ServiceResponse(String message) {super(message);}
}
