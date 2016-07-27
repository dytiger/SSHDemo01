package org.forten.notebook.action;

import org.forten.notebook.bo.UserBo;
import org.forten.notebook.model.UserForRegist;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/7/27.
 */
@Controller
public class UserAction {
    @Resource
    private UserBo userBo;

    @RequestMapping("/user/save")
    public String save(UserForRegist user){
        userBo.doSave(user);
        return "redirect:../index.html";
    }
}
