package br.com.rodrigoscoutino.transactionmanagement.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;

import br.com.rodrigoscoutino.transactionmanagement.dto.FlightBookingAcknowledgement;
import br.com.rodrigoscoutino.transactionmanagement.dto.FlightBookingRequest;
import br.com.rodrigoscoutino.transactionmanagement.entity.PassengerInfo;
import br.com.rodrigoscoutino.transactionmanagement.entity.PaymentInfo;
import br.com.rodrigoscoutino.transactionmanagement.repository.PassengerInfoRepository;
import br.com.rodrigoscoutino.transactionmanagement.repository.PaymentInfoRepository;
import br.com.rodrigoscoutino.transactionmanagement.utils.PaymentUtils;
import jakarta.transaction.Transactional;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;

    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional // (readOnly = false, isolation = Isolation.READ_COMMITTED, propagation =
                   // Propagation.REQUIRED)
    public FlightBookingAcknowledgement bookflightTicket(FlightBookingRequest request) {

        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();

        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());

        paymentInfo.setPassengerId(passengerInfo.getPid());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("SUCCESS", passengerInfo.getFare(),
                UUID.randomUUID().toString().split("-")[0],
                passengerInfo);
    }
}
