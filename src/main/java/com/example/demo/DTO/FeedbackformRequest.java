package com.example.demo.DTO.Request;

import java.time.LocalDate;

public class FeedbackformRequest {

    private Long courseId;
    private String semester;
    private String academicYear;
    private LocalDate closingDate;

    public FeedbackformRequest() {
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public LocalDate getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(LocalDate closingDate) {
        this.closingDate = closingDate;
    }

    public static class FeedbackformResponse {

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
}
