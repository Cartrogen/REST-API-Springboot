package com.restful.restapi.service;

import com.restful.restapi.entities.Courses;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service implements CourseService {

    List<Courses> coursesList;

    public Service() {
        coursesList = new ArrayList<>();
        coursesList.add(new Courses(122, "Computers", "Learn about computers"));
        coursesList.add(new Courses(321, "Science", "Learn about science"));
    }

    @Override
    public List<Courses> getCourses() {
        return coursesList;
    }

    @Override
    public Courses getSpecificCourse(long courseID) {
        for (Courses c : coursesList) {
            if (c.getId() == courseID) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String addCourse(Courses course) {
        if (getSpecificCourse(course.getId()) == null){
            coursesList.add(course);
            return "The course has been added";
        }
        return "This course already exists.";
    }

    @Override
    public String deleteCourse(long courseID) {
        if(getSpecificCourse(courseID) != null) {
            coursesList.remove(getSpecificCourse(courseID));
            return "Course has been deleted";
        }
        return "This course does not exist";
    }

    @Override
    public String updateCourse(Courses course) {
        Courses myCourse = getSpecificCourse(course.getId());
        if(myCourse != null) {
               myCourse.setTitle(course.getTitle());
               myCourse.setDescription(course.getDescription());
               return "Course has been updated";
        }
        return "This course does not exist";
    }
}
