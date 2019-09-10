package cn.com.scitc.webapp3;

import cn.com.scitc.webapp3.dao.LoginDao;
import cn.com.scitc.webapp3.model.Login;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IndexTest {
    @Resource
    LoginDao loginDao;
    @Test
    public void index(){
        Login login = new Login();
        login.setId(2);
        login.setPassword("2");
        login.setSex("Nan");
        login.setHabit("code");
        loginDao.save(login);
    }

}
