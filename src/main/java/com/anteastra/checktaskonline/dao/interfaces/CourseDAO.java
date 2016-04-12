package com.anteastra.checktaskonline.dao.interfaces;

import com.anteastra.checktaskonline.entities.Course;

import java.util.List;

/**
 * Created by anteastra on 10.04.2016.
 */
public interface CourseDAO {

    List<Course> getCourses();
    Course getCourse(String courseName);
}
