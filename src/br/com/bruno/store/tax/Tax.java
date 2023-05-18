package br.com.bruno.store.tax;

import br.com.bruno.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Tax {
    private Tax anotherTax;

    public Tax(Tax anotherTax) {
        this.anotherTax = anotherTax;
    }

    protected abstract BigDecimal performeCalculation(Budget budget);
    public BigDecimal calculate(Budget budget) {
        BigDecimal taxValue = performeCalculation(budget);
        BigDecimal anotherTaxValue = BigDecimal.ZERO;
        if (anotherTax !=null) {
            anotherTaxValue = anotherTax.performeCalculation(budget);
        }

        return taxValue.add(anotherTaxValue);
    }
}
