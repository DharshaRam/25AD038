package com.example.demo.DTO.Request;

public class CourseRequest {

    private String courseCode;
    private String courseName;
    private String facultyName;

    public CourseRequest() {
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public static class CourseResponse {

        private Long id;
        private String courseCode;
        private String courseName;
        private String facultyName;

        public CourseResponse() {
        }

        public CourseResponse(Long id, String courseCode,
                              String courseName, String facultyName) {
            this.id = id;
            this.courseCode = courseCode;
            this.courseName = courseName;
            this.facultyName = facultyName;
        }

        public Long getId() {
            return id;
        }

        public String getCourseCode() {
            return courseCode;
        }

        public String getCourseName() {
            return courseName;
        }

        public String getFacultyName() {
            return facultyName;
        }
    }
}