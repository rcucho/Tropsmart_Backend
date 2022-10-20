package com.techelper.tropsmart_backend.resources.comunications;

import com.techelper.tropsmart_backend.resources.outputs.RouteOutput;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class RouteResponse extends BaseResponse<RouteOutput> {
    public RouteResponse(String message) { super(message);}
    public RouteResponse(RouteOutput routeOutput) {super(routeOutput);}
    public RouteResponse(List<RouteOutput> routeOutputList) {super(routeOutputList);}
}
