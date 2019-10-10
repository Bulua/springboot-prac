package cn.edu.aynu.SpringBoot.controller;

import cn.edu.aynu.SpringBoot.entity.Master;
import cn.edu.aynu.SpringBoot.entity.User;
import cn.edu.aynu.SpringBoot.service.UserService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findUsersByMId/{mId}")
    public ModelAndView findUsersByMId(@PathVariable("mId") Integer mId,ModelAndView mv){
        List<User> users = userService.findUsersByMId(mId);
        mv.setViewName("list.html");
        mv.addObject("users",users);
        return mv;
    }

    @DeleteMapping("deleteUserById/{id}")
    public ModelAndView deleteUserById(@PathVariable("id") Integer id,
                                       HttpSession session,
                                       ModelAndView mv){
        int count = userService.deleteUserById(id);
        if (count > 0){
            mv.addObject("msg", "删除成功！");
        }
        Master master = (Master) session.getAttribute("loginMaster");
        mv.setViewName("redirect:user/findUsersByMId/"+master.getId());
        return mv;
    }
}
