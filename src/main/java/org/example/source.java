package org.example;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@Builder
public class source {
    private final int people;
    private double animal;
    private int name;
    private source(Builder builder) {
        this.people = builder.people;
        this.animal = builder.animal;
        this.name = builder.name;
    }


    public static class Builder {
        private final int people;
        private double animal;
        private int name;
        public Builder(int x)
        {
            this.people = x;
        }
        public Builder animal(double x){
            this.animal = x;
            return this;
        }
        public Builder name(int y){
            this.name = y;
            return this;
        }

        public source build() {
            return new source(this);
        }
    }
}