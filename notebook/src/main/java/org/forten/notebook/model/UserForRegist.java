package org.forten.notebook.model;

import java.util.Date;

/**
 * Created by Administrator on 2016/7/26.
 */
public class UserForRegist {
    private String loginName;
    private String password;
    private String email;
    private int userLevel;
    private String status;
    private Date registTime;
    private Date lastLoginTime;
    private String valCode;

    public UserForRegist() {
        this.userLevel = 0;
        this.status = "NA";
        Date now = new Date();
        this.registTime = now;
        this.lastLoginTime = now;
        this.valCode = "test";// TODO 应用StringUtil来得到随机串
    }

    public UserForRegist(String loginName, String password, String email) {
        this();
        this.loginName = loginName;
        this.password = password;
        this.email = email;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public String getStatus() {
        return status;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public String getValCode() {
        return valCode;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserForRegist{" +
                "loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", userLevel=" + userLevel +
                ", status='" + status + '\'' +
                ", registTime=" + registTime +
                ", lastLoginTime=" + lastLoginTime +
                ", valCode='" + valCode + '\'' +
                '}';
    }
}
