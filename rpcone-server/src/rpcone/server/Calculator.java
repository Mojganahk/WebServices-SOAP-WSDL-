package rpcone.server;

public class Calculator {

    public Calculator() {
        System.out.println("Calculator was constructed");
    }    
    
    public double add(double v1, double v2) {
        System.out.println("add() was called");
        return v1 + v2;
    }
}