package com.anteastra.checktaskonline.dao.impl;

import com.anteastra.checktaskonline.dao.interfaces.CourseThemeDAO;
import com.anteastra.checktaskonline.entities.CourseTheme;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by anteastra on 13.04.2016.
 */
@Component
public class CourseThemeDAOImpl implements CourseThemeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    List<CourseTheme> courseThemes;

    @Transactional
    @Override
    public List<CourseTheme> getCourseThemes(int courseId) {
        courseThemes = (List<CourseTheme>) sessionFactory.getCurrentSession()
                .createCriteria(CourseTheme.class)
                // TODO: 14.04.2016 make restriction for course id
                // .add(Restrictions.eq("courseId", courseId))
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

        return courseThemes;
    }

    @Override
    public CourseTheme getCourseTheme(int courseId, String courseThemeName) {
        return null;
    }
}
