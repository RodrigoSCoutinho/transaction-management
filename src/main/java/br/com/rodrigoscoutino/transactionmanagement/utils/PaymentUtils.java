package br.com.rodrigoscoutino.transactionmanagement.utils;

import java.util.HashMap;
import java.util.Map;

import br.com.rodrigoscoutino.transactionmanagement.exception.InsufficientAmountException;

public class PaymentUtils {

    private static Map<String, Double> paymentMap = new HashMap<>();

    {
        paymentMap.put("acc1", 12000.0);
        paymentMap.put("acc2", 10000.0);
        paymentMap.put("acc3", 5000.0);
        paymentMap.put("acc4", 8000.0);

    }

    public static boolean validateCreditLimit(String acctNo, double paidAmount) {
        if (paidAmount > paymentMap.get(accNo)) {
            throw new InsufficientAmountException("Insufficient Balance in account");
        } else {
            return true;
        }
    }

    // public static boolean validateCreditLimit(String accNo, double paidAmount) {
    // if (!paymentMap.containsKey(accNo)) {
    // throw new IllegalArgumentException("Account number " + accNo + " does not
    // exist");
    // }
    // if (paidAmount > paymentMap.get(accNo)) {
    // throw new InsufficientAmountException("Insufficient Balance in account");
    // } else {
    // return true;
    // }
    // }
}
