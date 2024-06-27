package com.sumit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.sumit.entity.Bus;
import com.sumit.entity.Passenger;
import com.sumit.repository.BusRepository;
import com.sumit.repository.PassengerRepository;

import java.util.Optional;
import java.util.Set;

@Controller
@RequestMapping(value = "/bus")
public class BusWebController {

    @Autowired
    private BusRepository busRepository;

    @Autowired
    private PassengerRepository passengerRepository;

    @GetMapping("/assign")
    public String showAssignPassengerForm(Model model) {
        model.addAttribute("buses", busRepository.findAll());
        model.addAttribute("passengers", passengerRepository.findAll());
        model.addAttribute("passenger", new Passenger());
        return "assignPassenger";
    }

    @PostMapping("/fetchPassenger")
    public String fetchPassenger(@RequestParam int passengerId, Model model) {
        Optional<Passenger> passengerOptional = passengerRepository.findById(passengerId);
        if (passengerOptional.isPresent()) {
            model.addAttribute("passenger", passengerOptional.get());
        } else {
            model.addAttribute("error", "Passenger not found with id: " + passengerId);
        }
        model.addAttribute("buses", busRepository.findAll());
        model.addAttribute("passengers", passengerRepository.findAll());
        return "assignPassenger";
    }

    @PostMapping("/assign")
    public String assignPassengerToBus(@RequestParam int busId, @ModelAttribute Passenger passenger, Model model) {
        Optional<Bus> busOptional = busRepository.findById(busId);
        if (!busOptional.isPresent()) {
            model.addAttribute("error", "Bus not found with id: " + busId);
            return "assignPassenger";
        }
        Bus bus = busOptional.get();

        // Save the passenger to the database
        Passenger savedPassenger = passengerRepository.save(passenger);

        // Add the passenger to the bus
        Set<Passenger> passengers = bus.getPassengers();
        passengers.add(savedPassenger);
        bus.setPassengers(passengers);

        // Save the updated bus
        busRepository.save(bus);

        model.addAttribute("success", "Passenger assigned successfully");
        return "redirect:/bus/assign";
    }
}
