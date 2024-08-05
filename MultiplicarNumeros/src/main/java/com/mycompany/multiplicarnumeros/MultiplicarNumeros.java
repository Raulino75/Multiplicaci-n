package com.mycompany.multiplicarnumeros;

import java.util.Scanner;

public class MultiplicarNumeros {

    public static int multiplicar(int valorA, int valorB) {
        return valorA * valorB;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1 = 0;
        int valor2 = 0;
        System.out.println("Ingrese dos valores a multiplicar");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        int resultado = multiplicar (valor1, valor2);
        System.out.println("El resultado es " + resultado);

    }

}

