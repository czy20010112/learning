package org.example;

public class Rooting implements Calculate {
    @Override
    public String cal(InputDTO input){
        double result =  java.lang.Math.pow(input.getP(),input.getQ());
        return String.valueOf(result);
    }
}
