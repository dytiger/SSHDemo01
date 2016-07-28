package org.forten.notebook.bo;

import org.forten.notebook.dao.JdbcDao;
import org.forten.notebook.model.UserForRegist;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/26.
 */
@Service("userBo")
public class UserBo {
    @Resource
    private JdbcDao jdbcDao;

    @Transactional
    public int doSave(UserForRegist user){
        String sql ="INSERT INTO test_users (login_name,password,email,user_level,status,regist_time,last_login_time,val_code)" +
                " VALUES (:loginName,:password,:email,:userLevel,:status,:registTime,:lastLoginTime,:valCode)";
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("loginName",user.getLoginName());
        params.put("password",user.getPassword());
        params.put("email",user.getEmail());
        params.put("userLevel",user.getUserLevel());
        params.put("status",user.getStatus());
        params.put("registTime",user.getRegistTime());
        params.put("lastLoginTime",user.getLastLoginTime());
        params.put("valCode",user.getValCode());

        return jdbcDao.update(sql,params);
    }
}
