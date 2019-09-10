package cn.com.scitc.webapp3.controller;

import cn.com.scitc.webapp3.dao.LoginDao;
import cn.com.scitc.webapp3.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "register")
public class RegisterController {
    @Autowired
    private LoginDao loginDao;

    public String registerPage() {

        return "/home/welcome";
    }
}
