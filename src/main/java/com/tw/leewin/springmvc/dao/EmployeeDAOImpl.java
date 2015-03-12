package com.tw.leewin.springmvc.dao;

import com.google.common.collect.Lists;
import com.tw.leewin.springmvc.model.EmployeeVO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lwzhang on 3/1/15.
 */

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    private List<EmployeeVO> employees;

    public EmployeeDAOImpl() {
        init();
    }

    private void init() {
        employees = Lists.newArrayList();
    }

    @Override
    public List<EmployeeVO> getAllEmployees() {
        return employees;
    }

    @Override
    public void addEmployee(EmployeeVO employee) {
        employees.add(employee);
    }

    @Override
    public void deleteEmployee(EmployeeVO employee) {
        employees.remove(employee);
    }

}