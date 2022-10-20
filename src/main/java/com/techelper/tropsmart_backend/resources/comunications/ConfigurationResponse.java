package com.techelper.tropsmart_backend.resources.comunications;

import com.techelper.tropsmart_backend.resources.outputs.ConfigurationOutput;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ConfigurationResponse extends BaseResponse<ConfigurationOutput> {
    public ConfigurationResponse(String message) {super(message);}
    public ConfigurationResponse(ConfigurationOutput configurationOutput) {super(configurationOutput);}
    public ConfigurationResponse(List<ConfigurationOutput> configurationOutputList) {super(configurationOutputList);}
}
