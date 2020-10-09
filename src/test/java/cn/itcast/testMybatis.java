package cn.itcast;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author sunhongguang
 * @create 2020-10-08-23:12
 */
public class testMybatis {

    InputStream inputStream;
    SqlSession sqlSession;
    AccountDao accountDao;

    @Before
    public void before() throws IOException {
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        accountDao = sqlSession.getMapper(AccountDao.class);
    }

    @After
    public void after() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        inputStream.close();

    }
    @Test
    public void testFindAllAccount() {
        /*
        // 加载MyBatsi配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 通过工厂对象创建sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取到代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        */

        // 查询所有账户信息
        List<Account> all = accountDao.findAll();
        for(Account account : all){
            System.out.println(account);
        }
    }

    @Test
    public void testSaveAccount(){
        Account account = new Account();
//        account.setId(3);
        account.setName("ddd");
        account.setMoney(9000000400.0);
        accountDao.saveAccount(account);
    }
}
