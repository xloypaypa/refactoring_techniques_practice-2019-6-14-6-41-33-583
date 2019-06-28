package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {

    @Test
    public void should_get_price_when_calculate() {
        PriceCalculator priceCalculator = new PriceCalculator();

        assertEquals(1075, priceCalculator.getPrice(1000, 1), 1e-3);
    }
}