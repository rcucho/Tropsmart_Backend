package com.techelper.tropsmart_backend.resources.comunications;

import com.techelper.tropsmart_backend.resources.outputs.ReviewOutput;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ReviewResponse extends BaseResponse<ReviewOutput>{
    public ReviewResponse(List<ReviewOutput> reviewOutputList) {super(reviewOutputList);}
    public ReviewResponse(ReviewOutput reviewOutput){super(reviewOutput);}
    public ReviewResponse(String message) {super(message);}
}
