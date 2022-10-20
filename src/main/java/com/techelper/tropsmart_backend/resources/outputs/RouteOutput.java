package com.techelper.tropsmart_backend.resources.outputs;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RouteOutput {
    private String DepartureLocation;
    private String ArrivalLocation;
    private double Distance;
    private int EstimedTime;
}
