package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CalculatorTests3 {
    @Test
    public void testScore1() throws Exception {
        try {
            int output = Calculator.score(-1,true);
            fail("Không ném ngoại lệ");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Invalid input");
        }
    }
    @Test
    public void testScore2() throws Exception {
        try {
            int output = Calculator.score(4,true);
            assertEquals(56000, output, 0.0);
        } catch (Exception e) {
            fail("Bắt ngoại lệ không đúng");
        }
    }
    @Test
    public void testScore3() throws Exception {
        try {
            int output = Calculator.score(4,false);
            assertEquals(43000, output, 0.0);
        } catch (Exception e) {
            fail("Bắt ngoại lệ không đúng");
        }
    }
}
