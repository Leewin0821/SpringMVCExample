package com.tw.leewin.springmvc.controller;

import com.tw.leewin.springmvc.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lwzhang on 3/1/15.
 */

@Controller
@RequestMapping("/employee-module")
public class EmployeeController {

    EmployeeManager employeeManager;

    @Autowired
    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", employeeManager.getAllEmployees());
        return "employeeListDisplay";
    }
}
