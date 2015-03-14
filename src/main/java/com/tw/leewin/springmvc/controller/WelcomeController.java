package com.tw.leewin.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lwzhang on 3/2/15.
 */
@Controller
public class WelcomeController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome() {
        return "index";
    }

    @RequestMapping(params = "getAllEmployees", method = RequestMethod.POST)
    public ModelAndView getAllEmployees() {
        return new ModelAndView("redirect:/getAllEmployees");
    }

    @RequestMapping(params = "notInTheList", method = RequestMethod.POST)
    public ModelAndView createNewEmployee() {
        return new ModelAndView("redirect:/create");
    }
}
