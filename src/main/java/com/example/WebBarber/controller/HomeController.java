package com.example.WebBarber.controller;

import com.example.WebBarber.model.Booking;
import com.example.WebBarber.model.User;
import com.example.WebBarber.repository.IServiceRepository;
import com.example.WebBarber.repository.IUserRepository;
import com.example.WebBarber.service.BookingService;
import com.example.WebBarber.service.IBookingService;
import com.example.WebBarber.service.ISerService;
import com.example.WebBarber.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/barbers")
public class HomeController {

    @Autowired
    private BookingService bookingService;



    @GetMapping("/log")
    public ModelAndView loginF() {
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("newUser", new User());
        return modelAndView;
    }

    @GetMapping("/findAllBooking")
    public ModelAndView showAllBooking(){
        ModelAndView modelAndView = new ModelAndView("booking");
        List<Booking> bookingList = (List<Booking>) bookingService.findAll();
        return modelAndView.addObject("listBooking", bookingList);
    }

//    @GetMapping("/order")
//    public ModelAndView showFormBooking(){
//        ModelAndView modelAndView = new ModelAndView("/order");
//        modelAndView.addObject("listService", iBookingService.findAll());
//        modelAndView.addObject("listBarber",iUserService.findByRole(3));
//        return modelAndView;
//    }


}
