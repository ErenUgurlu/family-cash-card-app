package com.spring.learn.cash.card;

import org.springframework.data.annotation.Id;

record CashCard(@Id Long ID, Double amount, String owner) {
}