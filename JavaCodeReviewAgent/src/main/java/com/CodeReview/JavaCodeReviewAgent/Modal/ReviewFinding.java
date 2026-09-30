package com.CodeReview.JavaCodeReviewAgent.Modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewFinding {
    private String fileName;
    private int lineNumber;
    private ReviewCategory category;
    private ReviewSeverity severity;
    private String title;
    private String description;
    private String recommendations;
    private String suggestedFix;
}
