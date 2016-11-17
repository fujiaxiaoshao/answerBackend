package com.wulijiexi.answer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Created by fujiaxiaoshao on 2016/11/12.
 */
@Controller
@RequestMapping("/backend")
public class BackendController {

    //武理解析答案后台的登录首页
    @RequestMapping(value="/index",method=RequestMethod.GET)
    public  String getCampusName(){

        return "backend/index.jsp";

    }

}
