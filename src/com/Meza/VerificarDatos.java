package com.Meza;

import java.util.InputMismatchException;
import java.util.Scanner;

    public class VerificarDatos {

        public static double solicitarDouble(String mensaje){
            Scanner lector = new Scanner(System.in);
            System.out.print(mensaje);
            try{
                double numero = lector.nextDouble();
                return numero;
            } catch (InputMismatchException i){
                System.out.println("El dato ingresado es invalido");
                return solicitarDouble(mensaje);
            }

        }
    }

