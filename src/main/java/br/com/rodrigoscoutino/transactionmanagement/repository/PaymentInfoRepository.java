package br.com.rodrigoscoutino.transactionmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rodrigoscoutino.transactionmanagement.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {

}
