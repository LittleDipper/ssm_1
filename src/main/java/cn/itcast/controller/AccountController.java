package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author sunhongguang
 * @create 2020-10-08-22:09
 */
@Controller
@RequestMapping(path = "/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    private static final String SUCCESS = "success";

    @RequestMapping(path = "/findAll")
    public String findAll(Model model){
        System.out.println("test。。。。");
        List<Account> accounts = accountService.findAll();
        for(Account account : accounts){
            System.out.println(account);
        }
        model.addAttribute("accountList", accounts);
        return "list";
    }

    @RequestMapping(path = "/saveAccount")
    public void saveAccount(Account account, HttpServletRequest request,HttpServletResponse response) throws IOException {
        System.out.println("test。。。。");
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }
}
