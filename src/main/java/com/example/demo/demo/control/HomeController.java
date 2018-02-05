package com.example.demo.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @Autowired
    HttpServletResponse response;

    @RequestMapping("/bikui/hongbao")
    public String luckyMoneny() {
//        return "index";
        return "redirect:https://render.alipay.com/p/f/fd-j6lzqrgm/guiderofmklvtvw.html?shareId=2088602159628421&campStr=p1j%2BdzkZl018zOczaHT4Z5CLdPVCgrEXq89JsWOx1gdt05SIDMPg3PTxZbdPw9dL&sign=Rj2wD2MtqWnKyZ%2Flb2HCUag1AlrClIIuiyxi9XLKRdk%3D&scene=offlinePaymentNewSns";
    }

    @RequestMapping("/yangml/hongbao")
    public String yLuckyMoneny() {
//        return "index";
        return "redirect:https://qr.alipay.com/c1x00085o4zqzkjkex8qg13";
    }

    @RequestMapping("jump")
    public ModelAndView jump() {
//        response.sendRedirect("www.baidu.com"); //项目间跳转

        return new ModelAndView("redirect:https://qr.alipay.com/c1x00085o4zqzkjkex8qg13");
    }
}
