package br.com.rodrigoscoutino.transactionmanagement.dto;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.rodrigoscoutino.transactionmanagement.entity.PassengerInfo;
import br.com.rodrigoscoutino.transactionmanagement.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

    @Autowired

    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;
}
