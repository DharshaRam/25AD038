package com.example.demo.DTO.Request;

public class QuestionRequest {

    private Long feedbackformId;
    private String questionText;

    public QuestionRequest() {
    }

    public Long getFeedbackformId() {
        return feedbackformId;
    }

    public void setFeedbackformId(Long feedbackformId) {
        this.feedbackformId = feedbackformId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
}