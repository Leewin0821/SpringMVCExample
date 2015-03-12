package com.tw.leewin.springmvc.dao;

import com.tw.leewin.springmvc.model.EmployeeVO;

import java.util.List;

/**
 * Created by lwzhang on 3/1/15.
 */
public interface EmployeeDAO {
    public List<EmployeeVO> getAllEmployees();

    public void addEmployee(EmployeeVO employee);

    public void deleteEmployee(EmployeeVO employee);
}