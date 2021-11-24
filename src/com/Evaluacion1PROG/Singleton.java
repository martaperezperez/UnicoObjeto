package com.Evaluacion1PROG;

public class Singleton {
    private static Singleton instanciar=null;
    public String nombre;

    private Singleton(){
    }
    public static Singleton getInstanciar() {
        if(instanciar==null){
            instanciar = new Singleton();
        }
        return instanciar;
    }
}
