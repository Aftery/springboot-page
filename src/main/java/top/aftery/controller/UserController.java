package top.aftery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.aftery.entity.User;
import top.aftery.service.UserService;

import java.util.List;

/**
 * @Author Aftery
 * @Date 2019/11/23 19:56
 * @Version 1.0
 **/
@Controller
@SuppressWarnings("all")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/")
    public String index(Model model){
        List<User> users = service.queryUserList();
        model.addAttribute("users",users);
        return "index";
    }



}
