package com.tw.leewin.springmvc.controller;

import com.tw.leewin.springmvc.model.EmployeeVO;
import com.tw.leewin.springmvc.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Created by lwzhang on 3/14/15.
 */

@Controller
public class createNewEmployeeController {

    private EmployeeManager employeeManager;

    @Autowired
    public createNewEmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }
//
//    @RequestMapping(value = "/create", method = RequestMethod.GET)
//    public ModelAndView getCreateNewEmployeePage(){
//        return new ModelAndView("createNewEmployee");
//    }
}
