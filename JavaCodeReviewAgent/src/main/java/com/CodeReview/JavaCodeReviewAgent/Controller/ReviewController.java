package com.CodeReview.JavaCodeReviewAgent.Controller;

import com.CodeReview.JavaCodeReviewAgent.DTO.ReviewRequest;
import com.CodeReview.JavaCodeReviewAgent.DTO.ReviewResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @PostMapping
    public ReviewResponse reviewCode(@RequestBody ReviewRequest request) {
        return new ReviewResponse(
                "RECEIVED",
                "Review request received for project: " + request.getProjectPath()
        );
    }
}
