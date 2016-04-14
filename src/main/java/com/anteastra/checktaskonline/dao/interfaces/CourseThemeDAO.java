package com.anteastra.checktaskonline.dao.interfaces;

import com.anteastra.checktaskonline.entities.CourseTheme;

import java.util.List;

/**
 * Created by anteastra on 13.04.2016.
 */
public interface CourseThemeDAO {
    List<CourseTheme> getCourseThemes(int courseId);
    CourseTheme getCourseTheme(int courseId, String courseThemeName);
}
