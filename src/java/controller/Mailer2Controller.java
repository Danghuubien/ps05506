/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author BienBien
 */
@Controller
@RequestMapping("/mailer2/")
public class Mailer2Controller {

    @Autowired
    XMailer mailer;

    @RequestMapping("form")
    public String index() {
        return "mail2";
    }

    @RequestMapping("send")
    public String send(ModelMap model,
            @RequestParam("from") String from,
            @RequestParam("to") String to,
            @RequestParam("subject") String subject,
            @RequestParam("body") String body) {
        try {
// Gửi mail
            mailer.send(from, to, subject, body);
            model.addAttribute("message", "Gửi email thành công !");
        } catch (Exception ex) {
            model.addAttribute("message", "Gửi email thất bại !");
        }
        return "mail2";
    }
}

