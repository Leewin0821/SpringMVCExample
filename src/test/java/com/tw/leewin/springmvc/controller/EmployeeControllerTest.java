package com.tw.leewin.springmvc.controller;

import com.tw.leewin.springmvc.service.EmployeeManager;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class EmployeeControllerTest {

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void should_request_render_of_employeeDisplay_page() throws Exception {
//        //Given
        Model mockModel = Mockito.mock(Model.class);
        EmployeeManager mockManager = Mockito.mock(EmployeeManager.class);
        EmployeeController employeeController = new EmployeeController(mockManager);
        String expectedMessage = "employeeListDisplay";

        //When
        String actualMessage = employeeController.getAllEmployees(mockModel);

        //Then
        assertThat(actualMessage, is(expectedMessage));
    }
}