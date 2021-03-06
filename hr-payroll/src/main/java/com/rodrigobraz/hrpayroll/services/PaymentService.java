package com.rodrigobraz.hrpayroll.services;
import com.rodrigobraz.hrpayroll.clients.WorkerFeignClient;
import com.rodrigobraz.hrpayroll.entities.Payment;
import com.rodrigobraz.hrpayroll.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient client;

    public Payment getPayment(long workerId, int days) {

        Worker worker = client.findById(workerId).getBody();
        
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
