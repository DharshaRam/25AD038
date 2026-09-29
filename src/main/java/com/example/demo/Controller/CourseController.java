package com.example.demo.Controller;

import com.example.demo.Models.Course;
import com.example.demo.Services.CourseServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseServices courseServices;

    public CourseController(CourseServices courseServices) {
        this.courseServices = courseServices;
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseServices.addCourse(course);
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseServices.getAllCourses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable Long id) {
        return courseServices.getCourseById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public Course updateCourse(
            @PathVariable Long id,
            @RequestBody Course course) {

        return courseServices.updateCourse(id, course);
    }

    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable Long id) {

        courseServices.deleteCourse(id);

        return "Course deleted successfully";
    }
}