package com.company.staff.presentation.controllers;

import com.company.staff.models.StaffMember;
import com.company.staff.service.StaffService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

// A controller is used to control requests to the web server.
@Controller
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    // Model Attributes
    /*
    A model attribute is something that can be accessed by the templates in thymeleaf.
    If you look in the staff-list template you will see references to staffList (Line 26). When spring renders
    the template it will run this code. When someone navigates to the staff list page we need to get
    a list of staff. This is stored in the database. Here we are asking the staffService to give us a list of all staff.
     */
    @ModelAttribute("staffList")
    public List<StaffMember> allStaff() {
        return staffService.getAllStaff();
    }

    // Endpoints
    // This exposes an endpoint you can browse to. When browsing the internet the browser will do a GET request to retrieve the website to view.
    // GetMapping is spring setting up an endpoint on the server to handle a GET request at the uri (the part after the host name).
    // Basically if someone types into the browser http://localhost:8080/staff-list the following code is run and determines what is shown by the browser.
    // To start learn about GET and POST requests and what the differences are.
    @GetMapping("/staff-list")
    public String salesOrdersPage() {
        // The string we are returning is the path to the file staff-list in the template directory.
        // This is where spring magic grabs the file and uses Thymeleaf to render the HTML to be displayed.
        return "staff-list";
    }

//    @GetMapping("/staff/{id}")
//    public String salesOrderDetailsPage(@PathVariable("id") long id, ModelMap modal) {
//        modal.addAttribute("staffMember", staffService.getStaffMember(id));
//        return "staff-member";
//    }
}
