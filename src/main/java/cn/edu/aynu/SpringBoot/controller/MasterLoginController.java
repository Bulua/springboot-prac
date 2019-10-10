package cn.edu.aynu.SpringBoot.controller;

import cn.edu.aynu.SpringBoot.entity.Master;
import cn.edu.aynu.SpringBoot.entity.User;
import cn.edu.aynu.SpringBoot.service.MasterLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MasterLoginController {

    @Autowired
    private MasterLoginService masterLoginService;

    /**
     * 用户登陆
     * 登陆成功：
     *      1、从数据库查询登陆用户下的users（请求另一个Controller）
     *      2、查询后存入ModelAndView对象，跳转页面
     * @param master
     * @param request
     * @param session
     * @return
     */
    @PostMapping("/masterLogin")
    public String masterLogin(Master master,
                              HttpServletRequest request,
                              HttpSession session){
        Master loginMaster = masterLoginService.findMasterByNameAndPassword(master);
        if (loginMaster != null){
            session.setAttribute("loginMaster",loginMaster.getName());
            //这里必须用重定向
            return "redirect:user/findUsersByMId/"+loginMaster.getId();
        }
        request.setAttribute("msg","用户名或密码错误！");
        return "index";
    }

}
