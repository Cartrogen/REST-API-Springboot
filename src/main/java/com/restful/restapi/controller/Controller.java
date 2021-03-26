package com.restful.restapi.controller;

import com.restful.restapi.entities.Courses;
import com.restful.restapi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Courses> getCourses() {
        return courseService.getCourses();
    }

    @GetMapping("/specificCourse/{courseID}")
    public Courses getSpecificCourse(@PathVariable String courseID) {
        return courseService.getSpecificCourse(Long.parseLong(courseID));
    }

    @PostMapping("/addCourse")
    public String addCourse(@RequestBody Courses course) {
        return courseService.addCourse(course);
    }

    @DeleteMapping("/deleteCourse/{courseID}")
    public String deleteCourse(@PathVariable String courseID) {
        return courseService.deleteCourse(Long.parseLong(courseID));
    }

    @PutMapping("/updateCourse")
    public String updateCourse(@RequestBody Courses course) {
        return courseService.updateCourse(course);
    }
}
