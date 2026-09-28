package com.example.demo.DTO.Request;

public class ResponseRequest {

    private Long feedbackformId;
    private Long questionId;
    private String studentId;
    private int rating;

    public ResponseRequest() {
    }

    public Long getFeedbackformId() {
        return feedbackformId;
    }

    public void setFeedbackformId(Long feedbackformId) {
        this.feedbackformId = feedbackformId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
