package com.wembikon.javamaven;

public class Playground {
    private String data;

    public Playground(final String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public static void main(String[] args) {
        Playground p = new Playground("Hello World!");
        System.out.println(p.getData());
    }
}
