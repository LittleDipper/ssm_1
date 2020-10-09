package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author sunhongguang
 * @create 2020-10-08-22:06
 */
@Repository()
public interface AccountDao {

    // 查询所有账户信息
    @Select("select * from account")
    public List<Account> findAll();

    // 保存账户信息
    @Insert("insert into account (id,name,money) values(#{id},#{name},#{money})")
    public void saveAccount(Account account);
}
