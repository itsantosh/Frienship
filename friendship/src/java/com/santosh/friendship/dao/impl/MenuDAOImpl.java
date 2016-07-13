/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.friendship.dao.impl;

import com.santosh.friendship.dao.MenuDAO;
import com.santosh.friendship.entity.Menu;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author santosh
 */
@Repository

public class MenuDAOImpl implements MenuDAO {

    

private Session session;
private Transaction trans;
@Autowired(required = true)
private SessionFactory sessionFactory;

@Override
    public List<Menu> getAll() {
        session=sessionFactory.openSession();
        trans=session.beginTransaction();
        return session.getNamedQuery("Menu.findAll").list();
        
    }

    @Override
    public void insert(Menu m) {
    session=sessionFactory.openSession();
    trans=session.beginTransaction();
    session.save(m);
    trans.commit();
    session.close();        
    }

    @Override
    public void delete(int id) {
     session=sessionFactory.openSession();
    trans=session.beginTransaction();
    session.delete(getById(id));
    trans.commit();
    session.close(); 
        
    }

    @Override
    public void update(Menu m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Menu getById(int id) {
     session=sessionFactory.openSession();
     trans=session.beginTransaction();
     return (Menu) session.getNamedQuery("Menu.findByMenuId").list();
    }
    
}
