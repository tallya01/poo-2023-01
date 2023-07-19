package com.github.tallya01.t13.domain;

import java.util.Scanner;
import java.io.*;

class VerificadorDeDivisibilidade {

    public static boolean verificarDivisibilidade(double numero, double divisor) {
        return numero % divisor == 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Caso deseje usar numeros decimais, use . para separar a parte inteira da fracionaria");

        System.out.print("Digite o numero que deseja verificar: ");
        String num = in.nextLine();
        Double numero = Double.parseDouble(num);

        System.out.print("Digite o divisor: ");
        String div = in.nextLine();

        Double divisor = Double.parseDouble(div);
        boolean isDivisivel = verificarDivisibilidade(numero, divisor);

        System.out.println(numero + (isDivisivel ? " eh" : " nao eh") + " divisivel por " + divisor);
    }
}