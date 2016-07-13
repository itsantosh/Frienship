/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.friendship.dao;

import com.santosh.friendship.entity.Menu;
import java.util.List;

/**
 *
 * @author santosh
 */
public interface MenuDAO {
    List<Menu> getAll();
    void insert(Menu m);
    void delete(int id);
    void update(Menu m);
    Menu getById(int id);
    
}
