package com.tw.leewin.springmvc.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by lwzhang on 3/1/15.
 */

@Component
public class EmployeeVO implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String firstName;
    private String lastName;

    public EmployeeVO(Integer id, String firstName, String lastName) {
        this.id = checkNotNull(id);
        this.firstName = checkNotNull(firstName);
        this.lastName = checkNotNull(lastName);
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
