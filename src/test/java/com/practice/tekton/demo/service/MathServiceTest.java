package com.practice.tekton.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class MathServiceTest {
   @Autowired
	MathService mathService;

    @Test
    public void testMultipliesNumbers() {
        int result = mathService.multiply(2, 4);
        org.junit.jupiter.api.Assertions.assertEquals(result, 8);   
    }
    
    @Test
    public void testSubtractNumbers() {
        int result = mathService.subtract(10, 4);
        org.junit.jupiter.api.Assertions.assertEquals(result, 6);   
    }
    
    @Test
    public void testAddUp() {
        int result = mathService.addUp(10, 8);
        org.junit.jupiter.api.Assertions.assertEquals(result, 18);   
    }
}