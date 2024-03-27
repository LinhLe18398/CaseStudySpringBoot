package com.example.WebBarber.controller;

import com.example.WebBarber.model.Booking;
import com.example.WebBarber.model.Service;
import com.example.WebBarber.model.User;
import com.example.WebBarber.service.BookingService;
import com.example.WebBarber.service.SerService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/barbers")
public class HomeController {

    @Autowired
    private BookingService bookingService;
    @Autowired
    private SerService serService;



    @GetMapping("/log")
    public ModelAndView loginF() {
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("newUser", new User());
        return modelAndView;
    }

    @GetMapping("/findAllBooking")
    public ModelAndView showAllBooking(){
        ModelAndView modelAndView = new ModelAndView("listBooking");
        List<Booking> bookingList = (List<Booking>) bookingService.findAll();
        return modelAndView.addObject("listBooking", bookingList);
    }

    @GetMapping("/findAllService")
    public ModelAndView findAllTour(@PageableDefault(value = 1) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("listService");
        Page<Service> listService = serService.findAll(pageable);
        return modelAndView.addObject("listService", listService);
    }


//    @GetMapping("/order")
//    public ModelAndView showFormBooking(HttpServletRequest request) {
//        ModelAndView modelAndView = new ModelAndView("FormBooking");
//        HttpSession session = request.getSession();
//        Service service = (Service) session.getAttribute("service");
//        modelAndView.addObject("service", service);
//        modelAndView.addObject("newBooking", new Booking());
//        return modelAndView;
//    }

    @GetMapping("/showFormBooking")
    public ModelAndView showFormBooking(Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("FormBooking");
        Page<Service> services = serService.findAll(pageable);
        modelAndView.addObject("services",services);
        modelAndView.addObject("newBooking",new Booking());
        return modelAndView;
    }

    @PostMapping("/order")
    public ModelAndView createBooking(@ModelAttribute("booking") Booking booking) {
//        bookingService.save(booking);
//        ModelAndView modelAndView = new ModelAndView("redirect:/FormBooking");
//        return modelAndView;
        bookingService.save(booking);
        ModelAndView modelAndView = new ModelAndView("redirect:/barbers/findAllService");
        modelAndView.addObject("newBooking", new Booking());
        modelAndView.addObject("message", "Dat lich thanh cong");
        return modelAndView;
    }



}
