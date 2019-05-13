package com.company.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for Third exercise
 */
public class ThirdExerciseTest {
    
    private static final String GROCERIES = "groceries";
    private static final String EMPLOYEE = "employee";
    private static final String AFFILIATE = "affiliate";
    private static final String CUSTOMER = "customer";
    private static final String NUM = "$990";
    private static BigDecimal AMOUNT;
    
    @Before
    public void setUp() {
        AMOUNT = BigDecimal.valueOf(Long.valueOf(NUM.substring(1, NUM.length())));
    }

    @Test
    public void testCatalogues() {
        ThirdExercise exercise = new ThirdExercise();
        BigDecimal  totalAmount = exercise.getPaymentAmount(null, 0, AMOUNT, GROCERIES);
        assertEquals(BigDecimal.valueOf(945), totalAmount);
    }
    
    @Test
    public void testEmployee() {
        ThirdExercise exercise = new ThirdExercise();
        BigDecimal totalAmount = exercise.getPaymentAmount(EMPLOYEE, 0, AMOUNT, null);
        assertEquals(BigDecimal.valueOf(663), totalAmount);
    }
    
    @Test
    public void testAffiliate() {
        ThirdExercise exercise = new ThirdExercise();
        BigDecimal totalAmount = exercise.getPaymentAmount(AFFILIATE, 0, AMOUNT, null);
        assertEquals(BigDecimal.valueOf(851), totalAmount);
    }
    
    @Test
    public void testCustomer() {
        ThirdExercise exercise = new ThirdExercise();
        BigDecimal totalAmount = exercise.getPaymentAmount(CUSTOMER, 3, AMOUNT, null);
        assertEquals(BigDecimal.valueOf(895.5), totalAmount);
    }
    
    @Test
    public void testNotCustomer() {
        ThirdExercise exercise = new ThirdExercise();
        BigDecimal totalAmount = exercise.getPaymentAmount(CUSTOMER, 2, AMOUNT, null);
        assertEquals(BigDecimal.valueOf(945), totalAmount);
    }
    
}
