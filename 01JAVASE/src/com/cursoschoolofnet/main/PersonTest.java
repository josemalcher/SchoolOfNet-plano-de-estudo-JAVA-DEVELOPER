package com.cursoschoolofnet.main;

import com.cursoschoolofnet.Person;

public class PersonTest {
    public static void main(String[] args) {

        System.out.println("Olá, bem vindo!");

        Person aluno = new Person("Black", (float)1.70, "blue");
        aluno.walk();

    }
}
