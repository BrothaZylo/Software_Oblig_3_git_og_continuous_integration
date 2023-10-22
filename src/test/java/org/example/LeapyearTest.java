package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapyearTest {

    @Test
    public void isDivisibleBy4ButNot100(){
        assertTrue(Leapyear.IsLeapyear(2024));
        assertTrue(Leapyear.IsLeapyear(2016));
    }
    @Test
    public void isDivisibleBy400(){
        assertTrue(Leapyear.IsLeapyear(1600));
        assertTrue(Leapyear.IsLeapyear(5600));
    }
    @Test
    public void isNotDivisibleBy4(){
        assertFalse(Leapyear.IsLeapyear(1234));
        assertFalse(Leapyear.IsLeapyear(4321));
    }
    @Test
    public void isDivisibleBy100butNot400(){
        assertFalse(Leapyear.IsLeapyear(2100));
        assertFalse(Leapyear.IsLeapyear(1700));
    }

}