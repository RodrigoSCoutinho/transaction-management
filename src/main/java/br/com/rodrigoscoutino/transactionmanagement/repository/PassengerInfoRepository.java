package br.com.rodrigoscoutino.transactionmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rodrigoscoutino.transactionmanagement.entity.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {

}
