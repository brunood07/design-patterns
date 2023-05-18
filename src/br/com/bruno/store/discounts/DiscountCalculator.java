package br.com.bruno.store.discounts;

import br.com.bruno.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calculate(Budget budget) {
        Discount discountChain = new DiscountForMoreThanFiveItems(
                new DiscountForBudgetGreaterThanFiveHundred(
                        new DiscountZero()));


        return discountChain.calculate(budget);
    }
}
