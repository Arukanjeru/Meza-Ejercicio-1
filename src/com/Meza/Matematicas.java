package com.Meza;

public class Matematicas {


    public static double ElevarNumero(double base, double raiz) {
        double resul = Math.pow(base, raiz);
        return resul;
    }

    public static double RaizCuadrada(double base, double raiz) {
        double resul = (double) Math.pow(base, (1/raiz));
        return resul;
    }

    public static boolean NumeroPrimo(double base) {
        boolean primo = true;

        for (int i = 2; i < base; i++) {
            if(base % i == 0){
                primo = false;
                return primo;
            }
        }
        return primo;
    }
}