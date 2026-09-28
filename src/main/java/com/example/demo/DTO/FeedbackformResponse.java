package com.example.demo.DTO.Response;

import java.time.LocalDate;

public class FeedbackformResponse {

    private Long id;
    private Long courseId;
    private String semester;
    private String academicYear;
    private LocalDate closingDate;

    public FeedbackformResponse() {
    }

    public FeedbackformResponse(Long id, Long courseId,
                                String semester, String academicYear,
                                LocalDate closingDate) {
        this.id = id;
        this.courseId = courseId;
        this.semester = semester;
        this.academicYear = academicYear;
        this.closingDate = closingDate;
    }

    public Long getId() {
        return id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public String getSemester() {
        return semester;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public LocalDate getClosingDate() {
        return closingDate;
    }
}
