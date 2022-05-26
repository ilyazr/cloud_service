package ru.zakharov.clients.fraud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        value = "fraud",
        url = "${clients.fraud.url}",
        path = "api/v1/fraud-check"
)
public interface FraudClient {

    @GetMapping("{customerId}")
    FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId);

}
