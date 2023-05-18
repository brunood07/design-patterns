package br.com.bruno.store.tax;

import br.com.bruno.store.budget.Budget;

import java.math.BigDecimal;

// Aplicado o pattern Strategy, que visa evitar que façamos diversos ifs, ou utilizemos switch cases.
public class TaxCalculator {
    public BigDecimal calculate(Budget budget, Tax tax) {
        return tax.calculate(budget);
    }
}
