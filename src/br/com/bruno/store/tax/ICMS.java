package br.com.bruno.store.tax;

import br.com.bruno.store.budget.Budget;

import java.math.BigDecimal;

public class ICMS extends Tax {
    public ICMS(Tax anotherTax) {
        super(anotherTax);
    }

    public BigDecimal performeCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
