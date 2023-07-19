package com.github.tallya01.t13.domain;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.*;
import java.text.ParseException;

class CalculadoraDeIdade {
    public static int calculaIdade(String dataNasc) throws ParseException {
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascInput = sdf.parse(dataNasc);

        Calendar dataDeNascimento = new GregorianCalendar();
        dataDeNascimento.setTime(dataNascInput);

        Calendar hoje = Calendar.getInstance();
        int idade = hoje.get(Calendar.YEAR) - dataDeNascimento.get(Calendar.YEAR);

        dataDeNascimento.add(Calendar.YEAR, idade);

        if (hoje.before(dataDeNascimento)) {
            idade--;
        }

        return idade;
    }

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a data de nascimento no formado DD/MM/YYYY: ");
        String input = in.nextLine();

        int idade = calculaIdade(input);
        System.out.println("Vc tem " + idade + " anos");
    }
}