package com.controller;

import com.domain.User;
import com.service.IUserService;
import com.service.impl.userServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class userController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public String findAll(Model model){
        HttpSession   session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        // 调用service的方法
        List<User> list = iUserService.findAll();
        session.setAttribute("allUser",list);
        return null;
    }

    @RequestMapping("/findAllSale")
    public String findAllSale(){
        HttpSession   session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        // 调用service的方法
        List<User> list = iUserService.findAllSale();
        session.setAttribute("allSale",list);
        return null;
    }

    @RequestMapping("/save")
    public void save(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
        iUserService.saveUser(user);
        response.sendRedirect(request.getContextPath()+"/user/findAll");
        return;
    }

    //正常访问login页面
    @RequestMapping("/login")
    public String login(){
        return "redirect:/login.jsp";
    }

    //表单提交过来的路径
    @RequestMapping("/checkLogin")
    public String checkLogin(User user,Model model){
        HttpSession   session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        //调用service方法
//        System.out.println("test checkLogin");
        User user1 = iUserService.checkLogin(user.getName(), user.getPassword());
        //若有user则添加到model里并且跳转到成功页面
        if(user1 != null){
            String position = user1.getPosition();
            session.setAttribute("loginUser",user1);
            session.setAttribute("loginPosition",position);
//            System.out.println(session.getAttribute("loginUser"));
            switch (position) {
                case "销售管理员":
                    return "redirect:/index.jsp";
                case "销售人员":
                    return "redirect:/indexSale.jsp";
                case "仓库管理员":
                    return "redirect:/indexWhManager.jsp";
            }
        }
         session.setAttribute("msg","用户名或密码错误，请重新登录");
         return "redirect:/login.jsp";
    }

    @RequestMapping("/outLogin")
    public String outLogin(HttpSession session){
        //通过session.invalidata()方法来注销当前的session
        session.invalidate();
        return "redirect:/login.jsp";
    }

    //测试超链接跳转到另一个页面是否可以取到session值
    /*@RequestMapping("/anotherpage")
    public String hrefpage(){

        return "anotherpage";
    }
*/
}
