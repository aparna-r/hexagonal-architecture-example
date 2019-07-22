package com.hexagonal.domain.port;

import com.hexagonal.domain.core.Payment;
import com.hexagonal.domain.core.PaymentDetail;

import java.util.List;
import java.util.Optional;

public interface PaymentService {

    String createPayment(Payment payment);
    Optional<PaymentDetail> getPaymentDetails(String paymentId);
    List<PaymentDetail> getAllPayments();
}
