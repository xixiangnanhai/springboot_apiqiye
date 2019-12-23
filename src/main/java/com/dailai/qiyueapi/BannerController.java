package com.dailai.qiyueapi;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class BannerController {


    @GetMapping("/test")
    public void test(HttpServletResponse httpServletResponse) throws IOException {

        httpServletResponse.getWriter().write("sucess");
    }

}
