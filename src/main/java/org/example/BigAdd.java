package org.example;

public class BigAdd implements caculate{
    private caculate caculate;

    @Override
    public String cal(inputDTO input) {
        int i = input.getX();
        int j = input.getY();
        int result = 0;
        for(int times = 1;times <= j ;times ++){
            result = result + i ;
        }
        return String.valueOf(result);
    }
}
