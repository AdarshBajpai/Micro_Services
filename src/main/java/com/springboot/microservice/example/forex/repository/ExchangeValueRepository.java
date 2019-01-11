package com.springboot.microservice.example.forex.repository;

import com.springboot.microservice.example.forex.entity.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by adbajpai on 1/7/2019.
 */
public interface ExchangeValueRepository extends
        JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}
