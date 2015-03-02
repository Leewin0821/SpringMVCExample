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

    @Override
    public List<EmployeeVO> getAllEmployees() {
        List<EmployeeVO> employees = Lists.newArrayList();

        EmployeeVO vo1 = new EmployeeVO();
        vo1.setId(1);
        vo1.setFirstName("Lokesh");
        vo1.setLastName("Gupta");
        employees.add(vo1);

        EmployeeVO vo2 = new EmployeeVO();
        vo2.setId(2);
        vo2.setFirstName("Raj");
        vo2.setLastName("Kishore");
        employees.add(vo2);

        EmployeeVO vo3 = new EmployeeVO();
        vo3.setId(3);
        vo3.setFirstName("Bay");
        vo3.setLastName("Max");
        employees.add(vo3);

        return employees;
    }
}