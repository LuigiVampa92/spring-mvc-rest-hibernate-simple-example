package com.luigivampa92.ingots.springmvc.data.service;

import com.luigivampa92.ingots.springmvc.data.model.UserModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserDataService {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<UserModel> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(UserModel.class);
        return criteria.list();
    }
}
