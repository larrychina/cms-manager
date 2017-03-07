package org.larry.cms.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Larry on 2017/3/6.
 */
@Controller
@RequestMapping("a/")
public class AdminController {

    @RequestMapping("index")
    public String index(){
        return "admin/index" ;
    }

    @RequestMapping("welcome")
    public String welcome(){
        return "admin/welcome" ;
    }
}
