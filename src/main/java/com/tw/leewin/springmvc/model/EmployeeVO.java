package com.tw.leewin.springmvc.model;

import java.io.Serializable;

/**
 * Created by lwzhang on 3/1/15.
 */
public class EmployeeVO implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String firstName;
    private String lastName;

    public EmployeeVO(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public EmployeeVO() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "EmployeeVO [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + "]";
    }
}
