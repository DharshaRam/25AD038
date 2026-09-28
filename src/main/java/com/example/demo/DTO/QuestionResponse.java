package com.example.demo.DTO.Response;

public class QuestionResponse {

    private Long id;
    private Long feedbackformId;
    private String questionText;

    public QuestionResponse() {
    }

    public QuestionResponse(Long id, Long feedbackformId,
                            String questionText) {
        this.id = id;
        this.feedbackformId = feedbackformId;
        this.questionText = questionText;
    }

    public Long getId() {
        return id;
    }

    public Long getFeedbackformId() {
        return feedbackformId;
    }

    public String getQuestionText() {
        return questionText;
    }
}