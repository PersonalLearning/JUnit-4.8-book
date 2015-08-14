package com.manning.junit48.ch01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

  @Test
  public  void testAdd() {
    Calculator calculator = new Calculator();
    double result = calculator.add(10,50);
    assertEquals("Adding method is broken", 60, result, 0);
  }

}
