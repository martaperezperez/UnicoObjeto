package com.Evaluacion1PROG;

public class Main {

    public static void main(String[] args) {
 Singleton obx1= Singleton.getInstanciar();

        obx1.nombre="Sparrow";
 Singleton obx2= Singleton.getInstanciar();
        System.out.println(obx2.nombre );

    }


}
