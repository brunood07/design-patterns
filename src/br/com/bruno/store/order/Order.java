package br.com.bruno.store.order;

import br.com.bruno.store.budget.Budget;

import java.time.LocalDateTime;

public class Order {
    private String clientName;
    private LocalDateTime date;
    private Budget budget;

    public Order(String clientName, LocalDateTime date, Budget budget) {
        this.clientName = clientName;
        this.date = date;
        this.budget = budget;
    }
}
