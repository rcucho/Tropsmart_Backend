package com.techelper.tropsmart_backend.resources.comunications;

import com.techelper.tropsmart_backend.resources.outputs.BalanceOutput;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class BalanceResponse extends BaseResponse<BalanceOutput>{
    public BalanceResponse(String message) { super(message);}
    public BalanceResponse(BalanceOutput balanceOutput) { super(balanceOutput);}
    public BalanceResponse(List<BalanceOutput> balanceOutputList){ super(balanceOutputList);}
}
