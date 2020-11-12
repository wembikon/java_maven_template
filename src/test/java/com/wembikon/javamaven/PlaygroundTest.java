package com.wembikon.javamaven;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlaygroundTest {

    @Test
    public void getData() {
        Playground p = new Playground("Hello");
        assertEquals("Hello", p.getData());
    }
}