//Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

////Entrada
//O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

//Saída
//Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer valorInicial = scan.nextInt();
        Integer valor = valorInicial;
        int cem = 0, cinquenta =0, vinte = 0, dez = 0, cinco = 0, dois = 0, um = 0;
        if (valor >= 100) {
            cem = valor/100;
            valor = valor - cem * 100;
        }
        if (valor >= 50) {
            cinquenta = valor/50;
            valor = valor - cinquenta * 50;
        }
        if (valor >= 20) {
            vinte = valor/20;
            valor = valor - vinte * 20;
        }
        if (valor >= 10) {
            dez = valor/10;
            valor = valor - dez * 10;
        }
        if (valor >= 5) {
            cinco = valor/5;
            valor = valor - cinco * 5;
        }
        if (valor >= 2) {
            dois = valor/2;
            valor = valor - dois * 2;
        }
        if (valor >= 1) {
            um = valor;
        }

        System.out.println(valorInicial);
        System.out.println(String.format("%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00", cem, cinquenta, vinte, dez, cinco, dois, um));
    }
}
