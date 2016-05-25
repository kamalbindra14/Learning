package com.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.domain.Employee;
import com.spring.mvc.service.intf.EmployeeService;

/**
 * @author kamal.bindra
 *
 */
@Controller
@RequestMapping("/employee")
public class MainController {
  @Autowired
  EmployeeService employeeService;

  @Value("${juggler.items}")
  private String configValue;

  // @RequestMapping(method = RequestMethod.GET, params = "new")
  // public String createEmpProfile(Model model) {
  // model.addAttribute(new Employee());
  // return "form";
  // }
  @RequestMapping(method = RequestMethod.GET, params = "new")
  public String createEmpProfile(Employee emp) {
    return "form";
  }

  @RequestMapping(method = RequestMethod.POST)
  public String saveEmpProfile(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingErrors) {
    if (bindingErrors.hasErrors()) {
      return "form";
    }
    employeeService.saveEmpDetails(emp);
    return "redirect:/employee/details/" + emp.getFirstName() + " " + emp.getLastName();
  }

  @RequestMapping(value = "/details/{username}", method = RequestMethod.GET)
  public String redirection(@PathVariable String username, Model model) {
    model.addAttribute("configValue", configValue);
    model.addAttribute(username);
    return "details";
  }
}
