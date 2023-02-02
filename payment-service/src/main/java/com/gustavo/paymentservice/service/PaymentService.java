package com.gustavo.paymentservice.service;

import com.gustavo.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
