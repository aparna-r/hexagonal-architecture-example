package com.hexagonal.domain.port;

import com.hexagonal.domain.core.Payment;
import com.hexagonal.domain.core.PaymentDetail;

import java.util.List;
import java.util.Optional;

public interface PaymentRepository {
    void save(PaymentDetail payment);
    Optional<PaymentDetail> get(String paymentId);
    List<PaymentDetail> getAll();
}
