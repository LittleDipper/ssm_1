package cn.itcast;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author sunhongguang
 * @create 2020-10-08-22:21
 */
public class TestSpring {

    @Test
    public void run1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        List<Account> all = accountService.findAll();

    }
}
