package com.practice.tekton.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MathService {
    public int multiply(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;
    }
    
    public int multiplyThree(int firstNumber, int secondNumber, int thirdNumber) {

        return firstNumber * secondNumber*thirdNumber;
    }
    

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    
    public int addUp(int firstNumber, int secondNumber) {
        return firstNumber+secondNumber;
    }
    
    public int addUpThree(int firstNumber, int secondNumber,int thirdNumber) {
        return firstNumber+secondNumber+thirdNumber;
    }
    
    public int divide(int firstNumber, int secondNumber) {
        return firstNumber/secondNumber;
    }
}
