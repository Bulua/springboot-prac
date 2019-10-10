package cn.edu.aynu.SpringBoot.component;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 配置登陆拦截器
 * 当用户没有经过登陆时，直接跳转list页面会先经过拦截器
 * 拦截器判断当前会话中是否有登陆用户，有就返回true，否则为false
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

    /**
     * 前置拦截方法
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws ServletException, IOException {
        Object loginMaster = request.getSession().getAttribute("loginMaster");
        if (loginMaster == null){
            request.setAttribute("msg","还没有登陆请先登录");
            request.getRequestDispatcher("/index").forward(request,response);
            return false;
        }
        return true;
    }
}
