package com.interfaces.Ejercicio1;

public class Ornitorrinco extends Mamiferos implements IOviparo {

    @Override
    public void amamantarCrias() {
        System.out.println("El ornitorrinco amamanta a sus crías ");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("El ornitorrinco pone huevos");
    }

}
