package com.techprimers.security.securitydbexample.resource;


import com.techprimers.security.securitydbexample.model.User;
import com.techprimers.security.securitydbexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/")
public class HelloResource {
    @Autowired
    private UserService userService;

   // @PreAuthorize("hasAnyRole('USER')")
    @GetMapping("/all")
    public String hello() {
        return "HOME";
    }
//
    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/lock")
    public String securedHello() {
        return "chuj";
    }
//

     @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @GetMapping("/secured/user")
    public String alternate() {
        return "USER";
    }


    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("username") User userForm, BindingResult bindingResult, Model model) {
        //userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

       // securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/welcome";
    }

    @RequestMapping(value = "/changeRole", method = RequestMethod.GET)
    public String changeRole(Model model)
    {
        model.addAttribute("username", new User());
        //userService.changeRole();

        return "changeRole";
    }

    @RequestMapping(value = "/changeRoleToAdmin", method = RequestMethod.POST)
   // public String changeRole(@ModelAttribute("username") User user, BindingResult bindingResult, Model model)
    public ModelAndView changeRoleToAdmin(int id)
    {
 User user = userService.loadUserById(id).get();
userService.changeRoleToAdmin(userService.loadUserById(id).get());


        List<User> users = userService.findAll();
        return new ModelAndView("role","users", users);
    }

    @RequestMapping(value = "/role", method = RequestMethod.GET)
    public ModelAndView role()
    {

        List<User> users = userService.findAll();
        return new ModelAndView("role","users", users);
    }

    @RequestMapping(value = "/changeRoleToUser", method = RequestMethod.POST)
    // public String changeRole(@ModelAttribute("username") User user, BindingResult bindingResult, Model model)
    public ModelAndView changeRoleToUser(int id)
    {
        User user = userService.loadUserById(id).get();
        userService.changeRoleToUser(userService.loadUserById(id).get());


        List<User> users = userService.findAll();
        return new ModelAndView("role","users", users);
    }




//    @RequestMapping("/")
//    public String Index(){
//        return "test";
//    }
}
