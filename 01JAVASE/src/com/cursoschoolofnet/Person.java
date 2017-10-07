package com.cursoschoolofnet;

public class Person {
    public String colorHair;
    public String eyeColor;
    public Float height;

    public Person(String black, float v, String blue){
        System.out.println("Executando COntrutor!");
    }

    public Person(String colorHair, String eyeColor, Float height) {
        this.colorHair = colorHair;
        this.eyeColor = eyeColor;
        this.height = height;
    }

    public void walk(){
        System.out.println("Eu estou andando....");
    }
}
