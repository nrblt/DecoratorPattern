package com.company;

public class SkinHat extends Skin{
    public SkinHat(Hero hero) {
        this.hero=hero;
    }

    @Override
    public void pick() {
        System.out.println("Now you have Hat");
    }
}
