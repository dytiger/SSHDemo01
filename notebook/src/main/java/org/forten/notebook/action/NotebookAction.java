package org.forten.notebook.action;

import org.forten.notebook.bo.NotebookBo;
import org.forten.notebook.model.Notebook;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/7/28.
 */
@Controller
public class NotebookAction {
    @Resource
    private NotebookBo notebookBo;

    @RequestMapping("/notebook/save")
    public String save(Notebook nb){
        notebookBo.doSave(nb);
        return "redirect:listAll.do";
    }

    @RequestMapping("/notebook/listAll")
    public ModelAndView listAll(){
        List<Notebook> list = notebookBo.queryAll();
        ModelAndView mav = new ModelAndView();
        mav.addObject("data",list);
        mav.setViewName("../notebook.jsp");

        return mav;
    }
}
