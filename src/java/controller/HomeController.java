/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author BienBien
 */
@Controller
@RequestMapping("/home/")
public class HomeController {

    @Autowired
    User user;
    @RequestMapping("home")
    public String Home(ModelMap model) {
        return "Home";
    }
@RequestMapping("index")
    public String index(ModelMap model) {
        return "index";
    }

    @ModelAttribute("user")
    public User getUser() {
        return user;
    }

    @RequestMapping("form")
    public String form() {
        return "form";
    }

}
