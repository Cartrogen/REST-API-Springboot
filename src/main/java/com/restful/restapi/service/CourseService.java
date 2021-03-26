package com.restful.restapi.service;

import com.restful.restapi.entities.Courses;

import java.util.List;

public interface CourseService {

    public List<Courses> getCourses();
    public Courses getSpecificCourse(long courseID);
    public String addCourse(Courses course);
    public String deleteCourse(long courseID);
    public String updateCourse(Courses course);
}
