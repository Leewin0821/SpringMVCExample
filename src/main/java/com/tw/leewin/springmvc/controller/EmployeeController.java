package com.tw.leewin.springmvc.controller;

import com.tw.leewin.springmvc.model.EmployeeVO;
import com.tw.leewin.springmvc.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

/**
 * Created by lwzhang on 3/1/15.
 */

@Controller
public class EmployeeController {

    private EmployeeManager employeeManager;

    @Autowired
    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", employeeManager.getAllEmployees());
        return "employeeListDisplay";
    }

    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.POST)
    public ModelAndView searchSpecificEmployee(@RequestParam("searchId") String searchId){
        return new ModelAndView("redirect:/employee/" + searchId);
    }

    @RequestMapping(value = "/employee/{employeeId}", method = RequestMethod.GET)
    public ModelAndView getSpecificEmployee(@PathVariable int employeeId) {
        List<EmployeeVO> employeeVOList = employeeManager.getAllEmployees();
        for (EmployeeVO employee : employeeVOList) {
            if (employee.getId() == employeeId) {
                return new ModelAndView("employeeDisplay").addObject("employee", employee);
            }
        }
        return new ModelAndView("noSuchEmployee");
    }

    @RequestMapping(value = "/employee/*", method = RequestMethod.POST)
    public ModelAndView returnToEmployeeListPage() {
        return new ModelAndView("redirect:/getAllEmployees");
    }

    @RequestMapping(value = "/getAllEmployees", params = "createNewEmployee", method = RequestMethod.POST)
    public ModelAndView createNewEmployee(@ModelAttribute("employee") EmployeeVO employee) {
        employeeManager.addEmployee(employee);
        return new ModelAndView("employeeListDisplay");
    }

}
