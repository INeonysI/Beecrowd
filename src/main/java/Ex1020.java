//Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

//Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

//Entrada
//O arquivo de entrada contém um valor inteiro.

//Saída
//Imprima a saída conforme exemplo fornecido.

import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dias = scanner.nextInt();
        int anos = dias/365;
        dias -= anos * 365;
        int meses = dias/30;
        dias -= meses * 30;
        System.out.println(String.format("%d ano(s)\n" +
                "%d mes(es)\n" +
                "%d dia(s)", anos, meses, dias));
    }
}
