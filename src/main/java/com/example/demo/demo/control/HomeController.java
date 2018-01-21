package com.example.demo.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/bikui")
public class HomeController {

    @Autowired
    HttpServletResponse response;

    @RequestMapping("/hongbao")
    public String luckyMoneny() {
//        return "index";
        return "redirect:https://qr.alipay.com/c1x00085o4zqzkjkex8qg13";
    }

    @RequestMapping("jump")
    public ModelAndView jump() {
//        response.sendRedirect("www.baidu.com"); //项目间跳转

        return new ModelAndView("redirect:https://qr.alipay.com/c1x00085o4zqzkjkex8qg13");
    }
}
