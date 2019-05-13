package com.company.test;

import java.math.BigDecimal;

public class ThirdExercise {

    private static final String GROCERIES = "groceries";
    private static final String EMPLOYEE = "employee";
    private static final String AFFILIATE = "affiliate";
    private static final String CUSTOMER = "customer";

    public BigDecimal getPaymentAmount(String name, int year, BigDecimal totalAmount, String catalogues) {

        if (!GROCERIES.equals(catalogues)) {
            if (EMPLOYEE.equals(name)) {
                totalAmount = totalAmount.multiply(BigDecimal.valueOf(70)).divide(BigDecimal.valueOf(100));
            } else if (AFFILIATE.equals(name)) {
                totalAmount = totalAmount.multiply(BigDecimal.valueOf(90)).divide(BigDecimal.valueOf(100));
            } else if (CUSTOMER.equals(name) && year > 2) {
                totalAmount = totalAmount.multiply(BigDecimal.valueOf(95)).divide(BigDecimal.valueOf(100));
            }
        }
        int amountDiscount = totalAmount.divide(BigDecimal.valueOf(100)).intValue() * 5;
        return totalAmount.subtract(BigDecimal.valueOf(amountDiscount));
    }

}
