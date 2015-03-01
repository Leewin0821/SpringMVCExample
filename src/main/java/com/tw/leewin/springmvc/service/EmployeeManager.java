package com.tw.leewin.springmvc.service;

import com.tw.leewin.springmvc.model.EmployeeVO;

import java.util.List;

/**
 * Created by lwzhang on 3/1/15.
 */
public interface EmployeeManager {

    public List<EmployeeVO> getAllEmployees();
}
