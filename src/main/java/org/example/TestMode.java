package org.example;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TestMode {
    private static final String TAG = "TestMode";

    private int age;

    String name;


    int length;
    public TestMode() {
    }

    public TestMode(int age, String name, int length) {
        this.age = age;
        this.name = name;
        this.length = length;
    }


    private void testReflect(String msg) {
        System.out.println(msg);
    }

    @Override
    public String toString() {
        return "TestMode{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", length=" + length +
                '}';
    }

}
