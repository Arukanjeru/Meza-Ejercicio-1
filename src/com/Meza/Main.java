package com.Meza;

public class Main {

    public static void main(String[] args) {
        double base, raiz;
        boolean primo;

        System.out.println("A continuacion debera ingresar dos numeros");
        System.out.println("Este programa le devolvera el numero: elevado, raiz y si es primo");
        base = VerificarDatos.solicitarDouble("Ingrese la base: ");
        raiz = VerificarDatos.solicitarDouble("Ingrese la raiz: ");


        double resul1 = Matematicas.ElevarNumero(base, raiz);
        System.out.println("Elevado: " + resul1);

        double resul2 = Matematicas.RaizCuadrada(base, raiz);
        System.out.println("Raiz: " + resul2);

        primo = Matematicas.NumeroPrimo(base);
        if(primo == false){
            System.out.println("No es primo");
        }else{
            System.out.println("Es primo");
        }


    }



}


