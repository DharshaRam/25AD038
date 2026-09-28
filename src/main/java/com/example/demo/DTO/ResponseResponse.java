package com.example.demo.DTO.Response;

import java.time.LocalDateTime;

public class ResponseResponse {

    private Long id;
    private Long feedbackformId;
    private Long questionId;
    private String studentId;
    private int rating;
    private LocalDateTime submittedAt;

    public ResponseResponse() {
    }

    public ResponseResponse(Long id, Long feedbackformId,
                            Long questionId, String studentId,
                            int rating, LocalDateTime submittedAt) {
        this.id = id;
        this.feedbackformId = feedbackformId;
        this.questionId = questionId;
        this.studentId = studentId;
        this.rating = rating;
        this.submittedAt = submittedAt;
    }

    public Long getId() {
        return id;
    }

    public Long getFeedbackformId() {
        return feedbackformId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getRating() {
        return rating;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }
}