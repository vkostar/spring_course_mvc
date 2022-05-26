package com.kostar.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {


    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
//        Employee emp = new Employee();
//        emp.setName("Kosta");
//        emp.setSurName("Vikh");
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }


    @RequestMapping("/showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee emp) {
        emp.setName("Mr " + emp.getName());


        return "show-emp-details-view";
    }

}
