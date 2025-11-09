package com.fluentinterface;


/**
 * @ClassName: Phone
 * @Description: 建造者模式 -- 链式编程
 * @Author: Winston
 * @Date: 2025/11/9 15:48
 * @Version: 1.0
 */
public class Phone {
    private String brand;
    private String color;

    public Phone(Builder builder) {
        this.brand = builder.brand;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static class Builder{
        private String brand;
        private String color;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}