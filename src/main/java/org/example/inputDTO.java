package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class inputDTO {
    private final int x;
    private int y;
    private int z;
    private int m;
    private int n;
    private int p;
    private int q;
    private inputDTO(Builder builder) {
        this.x = builder.x;
        this.y = builder.y;
        this.z = builder.z;
        this.m = builder.m;
        this.n = builder.n;
        this.p = builder.p;
        this.q = builder.q;
    }

    public static class Builder {
        private final int x;
        private int y;
        private int z;
        private int m;
        private int n;
        private int p;
        private int q;
        public Builder(int x)
        {
            this.x = x;
        }

        public Builder y(int y){
            this.y = y;
            return this;
        }
        public Builder z(int z){
            this.z = z;
            return this;
        }
        public Builder m(int m){
            this.m = m;
            return this;
        }
        public Builder n(int n){
            this.n = n;
            return this;
        }
        public Builder p(int p){
            this.p = p;
            return this;
        }
        public inputDTO build() {
            return new inputDTO(this);
        }
    }

}

