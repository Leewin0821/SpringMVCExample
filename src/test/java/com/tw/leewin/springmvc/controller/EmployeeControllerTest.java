package com.tw.leewin.springmvc.controller;

import com.google.common.collect.Lists;
import com.tw.leewin.springmvc.model.EmployeeVO;
import com.tw.leewin.springmvc.service.EmployeeManager;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;


public class EmployeeControllerTest {

    @Mock
    private Model mockModel;
    @Mock
    private EmployeeManager mockManager;

    private EmployeeController employeeController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        employeeController = new EmployeeController(mockManager);
    }

    @Test
    public void should_request_render_of_employeeDisplay_page() throws Exception {
        //Given
        String expectedViewName = "employeeListDisplay";

        //When
        String actualViewName = employeeController.getAllEmployees(mockModel);

        //Then
        assertThat(actualViewName, is(expectedViewName));
    }

    @Test
    public void should_render_employeeDisplay_page() throws Exception {
        //Given
        int userId = 1;
        String expectedViewName = "employeeDisplay";
        given(mockManager.getAllEmployees()).willReturn(Lists.newArrayList(new EmployeeVO(1, "awe", "some")));

        //When
        ModelAndView modelAndView = employeeController.getSpecificEmployee(userId);

        //Then
        assertThat(modelAndView.getViewName(), is(expectedViewName));
    }

    @Test
    public void should_render_noSuchEmployee_page() throws Exception {
        //Given
        int userId = 2;
        String expectedViewName = "noSuchEmployee";
        given(mockManager.getAllEmployees()).willReturn(Lists.newArrayList(new EmployeeVO(1, "awe", "some")));

        //When
        ModelAndView modelAndView = employeeController.getSpecificEmployee(userId);

        //Then
        assertThat(modelAndView.getViewName(), is(expectedViewName));
    }

    @Test
    public void should_redirect_to_specific_employee_page() throws Exception {
        //Given
        int userId = 1;
        String expectedViewName = "redirect:/employee/1";
        given(mockManager.getAllEmployees()).willReturn(Lists.newArrayList(new EmployeeVO(1, "awe", "some")));

        //When
        ModelAndView modelAndView = employeeController.searchSpecificEmployee("1");

        //Then
        assertThat(modelAndView.getViewName(), is(expectedViewName));
    }

    @Test
    public void should_return_employeeListDisplay_page() throws Exception {
        //Given
        String expectedViewName = "redirect:/getAllEmployees";

        //When
        ModelAndView modelAndView = employeeController.returnToEmployeeListPage();

        //Then
        assertThat(modelAndView.getViewName(), is(expectedViewName));
    }
}