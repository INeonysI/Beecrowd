//Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

//Entrada
//O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

//Saída
//Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

//Obs: Utilize ponto (.) para separar a parte decimal.

import java.util.Scanner;
public class Ex1021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double valorDouble = scan.nextDouble();
        Integer notas =  (int) Math.floor(valorDouble);
        valorDouble -= notas;
        int moedas = (int) Math.floor(valorDouble * 100);


        int cem = 0, cinquenta =0, vinte = 0, dez = 0, cinco = 0, dois = 0, um = 0, cinquentaCents = 0, vinteCincoCents = 0, dezCents = 0, cincoCents = 0, umCents = 0;
        if (notas >= 100) {
            cem = notas/100;
            notas -= cem * 100;
        }
        if (notas >= 50) {
            cinquenta = notas/50;
            notas -= cinquenta * 50;
        }
        if (notas >= 20) {
            vinte = notas/20;
            notas -= vinte * 20;
        }
        if (notas >= 10) {
            dez = notas/10;
            notas -= dez * 10;
        }
        if (notas >= 5) {
            cinco = notas/5;
            notas -= cinco * 5;
        }
        if (notas >= 2) {
            dois = notas/2;
            notas -= dois * 2;
        }
        if (notas >= 1) {
            um = notas;
        }

        if (moedas >= 50) {
            cinquentaCents = 1;
            moedas -= 50;
        }
        if (moedas >= 25) {
            vinteCincoCents = 1;
            moedas -= 25;
        }
        if (moedas >= 10) {
            dezCents = moedas/10;
            moedas -= 10 * dezCents;
        }
        if (moedas >= 5) {
            cincoCents = 1;
            moedas -= 5;
        }
        if (moedas >= 1) {
            umCents = moedas;
        }

        System.out.println(String.format("NOTAS:\n" +
                "%d nota(s) de R$ 100.00\n" +
                "%d nota(s) de R$ 50.00\n" +
                "%d nota(s) de R$ 20.00\n" +
                "%d nota(s) de R$ 10.00\n" +
                "%d nota(s) de R$ 5.00\n" +
                "%d nota(s) de R$ 2.00\n" +
                "MOEDAS:\n" +
                "%d moeda(s) de R$ 1.00\n" +
                "%d moeda(s) de R$ 0.50\n" +
                "%d moeda(s) de R$ 0.25\n" +
                "%d moeda(s) de R$ 0.10\n" +
                "%d moeda(s) de R$ 0.05\n" +
                "%d moeda(s) de R$ 0.01", cem, cinquenta, vinte, dez, cinco, dois, um, cinquentaCents, vinteCincoCents, dezCents, cincoCents, umCents));
    }
}
