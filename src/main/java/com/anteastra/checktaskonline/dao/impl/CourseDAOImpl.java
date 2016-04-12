package com.anteastra.checktaskonline.dao.impl;

import com.anteastra.checktaskonline.dao.interfaces.CourseDAO;
import com.anteastra.checktaskonline.entities.Course;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by anteastra on 10.04.2016.
 */
@Component
public class CourseDAOImpl implements CourseDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private List<Course> courses;

    @Transactional
    @Override
    public List<Course> getCourses() {
        courses = (List<Course>) sessionFactory.getCurrentSession()
                .createCriteria(Course.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

        return courses;
    }

    @Override
    public Course getCourse(String courseName) {
        return null;
    }

}
