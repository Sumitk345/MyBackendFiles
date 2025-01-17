package com.sumit.controler;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;

import com.sumit.entity.UserAccount;
import com.sumit.service.UserService;


@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/form")
	public String getUsersform(Model model)
	{
		model.addAttribute("user", new UserAccount());
		return "User";
	}
	
	@GetMapping("/get")
	public String getAllUsers(Model model)
	{
		model.addAttribute("users", userService.getUserAccount());
		return "details";
	}
	
	@PostMapping(value="/save")
    public String saveUser(@ModelAttribute UserAccount user, Model model,RedirectAttributes redirectAttributes) {
        userService.saveEntity(user);
        model.addAttribute("user", new UserAccount()); 
        redirectAttributes.addFlashAttribute("success", "User saved successfully!");
        return "redirect:/user/get";
    }
	
    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable("id") int id, Model model) {
        Optional<UserAccount> userOptional = userService.findById(id);
        if (userOptional.isPresent()) {
            model.addAttribute("user", userOptional.get());
            return "User"; // This should be the form page to edit user details
        } else {
            model.addAttribute("error", "User not found with id: " + id);
            return "details";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id, Model model) {
        userService.deleteById(id);
        model.addAttribute("user", new UserAccount()); 
        model.addAttribute("users", userService.getUserAccount());
        model.addAttribute("success", "User deleted successfully!");
        return "details";
    }
}
