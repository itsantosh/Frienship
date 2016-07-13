/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.friendship.Controller;

import com.santosh.friendship.dao.MenuDAO;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author santosh
 */
@Controller
@RequestMapping(value = "{/}")
public class DefaultController {
   
    
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";

    }
    @Autowired(required = true)
    private MenuDAO menuDao;
    @RequestMapping(value="/menu",method = RequestMethod.GET)
    
    public ModelAndView menu(){
        ModelAndView mv=new ModelAndView("menu", (Map<String, ?>) menuDao.getAll());
        
    
        return mv;
    }
   
}
