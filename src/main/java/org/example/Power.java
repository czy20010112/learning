package org.example;

public class Power implements Caculate {
    private Caculate caculate;
    @Override
    public String cal(InputDTO input){
        int i = input.getX();
        int j = input.getY();
        int result = 1;
        for(int times = 1;times <= j ;times ++){
            result = result * i ;
        }
        return String.valueOf(result);
    }
}
