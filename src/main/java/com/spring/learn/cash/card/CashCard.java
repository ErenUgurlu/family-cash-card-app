package com.spring.learn.cash.card;

import org.springframework.data.annotation.Id;

public record CashCard(@Id Long ID, Double amount) {

}
