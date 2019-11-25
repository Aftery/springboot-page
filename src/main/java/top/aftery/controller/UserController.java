package top.aftery.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
    public String index(Model model, @RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "size", defaultValue = "50") Integer size) {
        PageHelper.startPage(page, size);
        List<User> users = service.queryUserList();
        PageInfo<User> pageInfo = new PageInfo<>(users);
        model.addAttribute("pageInfo", pageInfo);
        return "index";
    }

    @ResponseBody
    @RequestMapping("/list")
    public PageInfo<User> list(@RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "size", defaultValue = "50") Integer size) {
        PageHelper.startPage(page, size);
        List<User> users = service.queryUserList();
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }

    @ResponseBody
    @RequestMapping("/getData")
    public List<User> getData(@RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "size", defaultValue = "50") Integer size) {
        size=Integer.MAX_VALUE;
        PageHelper.startPage(page, size);
        List<User> users = service.queryUserList();
        return  users;
    }



}
