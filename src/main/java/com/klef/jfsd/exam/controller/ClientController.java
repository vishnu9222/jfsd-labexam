package com.klef.jfsd.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/SpringMVC")
public class ClientController {

    // Display a welcome message
    @GetMapping("/welcome")
    public ModelAndView welcome() {
        ModelAndView mvc = new ModelAndView();
        mvc.setViewName("test.jsp");
        mvc.addObject("message", "Welcome to Spring MVC!");
        return mvc;
    }

    // Render a JSP named "test"
    @GetMapping("/test")
    public ModelAndView test() {
        return new ModelAndView("test.jsp");
    }

    // Display ID and name from request parameters
    @GetMapping("/showInfo")
    public ModelAndView showInfo(@RequestParam("id") int id, @RequestParam("name") String name) {
        ModelAndView mvc = new ModelAndView();
        mvc.setViewName("showInfo.jsp");
        mvc.addObject("id", id);
        mvc.addObject("name", name);
        return mvc;
    }

    // Calculate and display the sum of two numbers
    @GetMapping("/calculateSum/{num1}/{num2}")
    public ModelAndView calculateSum(@PathVariable int num1, @PathVariable int num2) {
        ModelAndView mvc = new ModelAndView();
        int sum = num1 + num2;
        mvc.setViewName("arithmetic.jsp");
        mvc.addObject("result", "Sum: " + sum);
        return mvc;
    }

    // Render an employee form
    @GetMapping("/employeeForm")
    public ModelAndView employeeForm() {
        return new ModelAndView("employeeForm.jsp");
    }

    // Add two numbers provided as request parameters
    @GetMapping("/addNumbers")
    public ModelAndView addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        ModelAndView mvc = new ModelAndView();
        int sum = num1 + num2;
        mvc.setViewName("addNumbers.jsp");
        mvc.addObject("result", sum);
        return mvc;
    }

    // Combine two strings and display the result
    @GetMapping("/combine")
    public ModelAndView combineStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2) {
        ModelAndView mvc = new ModelAndView();
        String combined = str1 + " " + str2;
        mvc.setViewName("combineStrings.jsp");
        mvc.addObject("result", combined);
        return mvc;
    }

    // Perform addition and multiplication
    @GetMapping("/calculate")
    public ModelAndView calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        ModelAndView mvc = new ModelAndView();
        mvc.setViewName("calculate.jsp");
        mvc.addObject("sum", num1 + num2);
        mvc.addObject("product", num1 * num2);
        return mvc;
    }
}
