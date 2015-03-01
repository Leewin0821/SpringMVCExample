package com.tw.leewin.springmvc.service;

import com.tw.leewin.springmvc.dao.EmployeeDAO;
import com.tw.leewin.springmvc.model.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by lwzhang on 3/1/15.
 */
public class EmployeeManagerImpl implements EmployeeManager {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public List<EmployeeVO> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
