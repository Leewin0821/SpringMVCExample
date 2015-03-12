package com.tw.leewin.springmvc.service;

import com.tw.leewin.springmvc.dao.EmployeeDAO;
import com.tw.leewin.springmvc.model.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lwzhang on 3/1/15.
 */

@Service
public class EmployeeManagerImpl implements EmployeeManager {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public List<EmployeeVO> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public void addEmployee(EmployeeVO employee) {
        employeeDAO.addEmployee(employee);
    }

    @Override
    public void deleteEmployee(EmployeeVO employee) {
        employeeDAO.deleteEmployee(employee);
    }


}
