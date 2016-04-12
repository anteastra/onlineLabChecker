package com.anteastra.checktaskonline.bean;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by anteastra on 03.04.2016.
 */
@Component
public class TestBean {

    @Autowired
    private SessionFactory sessionFactory;

    public void test() {
        System.out.println("yey, sessionFactory: " + sessionFactory);
    }
}
