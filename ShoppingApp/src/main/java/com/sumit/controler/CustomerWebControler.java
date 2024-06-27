package com.sumit.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sumit.repository.CustomerRepository;

@Controller
@RequestMapping("/customer")
public class CustomerWebControler {
	
	@Autowired
	CustomerRepository customerRepository;

	@GetMapping("/get")
	public String getAllCustomers(Model model)
	{
		model.addAttribute("customers", customerRepository.findAll());
		return "Customer";
		
	}
	
	@GetMapping("/delete")
    public String deleteCustomer(int id, Model model) {
        customerRepository.deleteById(id);
        model.addAttribute("customers", customerRepository.findAll());
        return "Customer";
    }
}
