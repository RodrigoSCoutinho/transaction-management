package br.com.rodrigoscoutino.transactionmanagement.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.rodrigoscoutino.transactionmanagement.dto.FlightBookingAcknowledgement;
import br.com.rodrigoscoutino.transactionmanagement.dto.FlightBookingRequest;
import br.com.rodrigoscoutino.transactionmanagement.service.FlightBookingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class FlightController {

    @Autowired
    private FlightBookingService service;

    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request) {
        return service.bookflightTicket(request);
    }
}
