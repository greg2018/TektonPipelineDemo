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
    public void multipliesNumbers() {
        int result = mathService.multiply(2, 4);

      //  assertThat(result, equalTo(8));
        org.junit.jupiter.api.Assertions.assertEquals(result, 8);
       
    }
}