package br.com.bruno.store.order;

import br.com.bruno.store.budget.Budget;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GenerateOrder {
    private BigDecimal budgetValue;
    private String clientName;
    private int quantityOfItems;

    public GenerateOrder(BigDecimal budgetValue, String clientName, int quantityOfItems) {
        this.clientName = clientName;
        this.budgetValue = budgetValue;
        this.quantityOfItems = quantityOfItems;
    }

    public BigDecimal getBudgetValue() {
        return budgetValue;
    }

    public String getClientName() {
        return clientName;
    }

    public int getQuantityOfItems() {
        return quantityOfItems;
    }
}
