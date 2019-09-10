package cn.com.scitc.webapp3.controller;

import cn.com.scitc.webapp3.dao.LoginDao;
import cn.com.scitc.webapp3.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class LoginController {
    @Resource
    private LoginDao loginDao;


    @GetMapping({"/"})
    private String homePage(Model model) {
        return "/home/homepage";
    }

    @RequestMapping(value = "login")
    private String loginPage(Login login) {
        login.getId();
        login.getPassword();
        Optional<Login> list = loginDao.findById(login.getId());
        if (list.isPresent()) {
            if (list.get().getPassword().equals(login.getPassword())) {
                return "/home/welcome";
            } else {
                return "/home/false";
            }
        }
        return "/home/homepage";
    }

    @RequestMapping(value = "/register")
    private String registerPage(Login login,String password,String sex,String habit) {
        login.setPassword(password);
        login.setSex(sex);
        login.setHabit(habit);
        loginDao.save(login);
        return "/home/welcome";
    }
}
