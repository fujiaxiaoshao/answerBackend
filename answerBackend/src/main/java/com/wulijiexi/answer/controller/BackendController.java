package com.wulijiexi.answer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by fujiaxiaoshao on 2016/11/12.
 */
@Controller
@RequestMapping("/backend")
public class BackendController {

    @RequestMapping(value="/articles",method= RequestMethod.GET)
    public  String articles(){

        return "backend/articles.jsp";

    }

}
