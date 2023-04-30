//Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

//Entrada
//O arquivo de entrada contém um valor inteiro N.

//Saída
//Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int segundos = scanner.nextInt();
        int minutos = segundos/60;
        segundos -= minutos * 60;
        int horas = minutos/60;
        minutos -= horas * 60;
        System.out.println(String.format("%d:%d:%d", horas, minutos, segundos));
    }
}
