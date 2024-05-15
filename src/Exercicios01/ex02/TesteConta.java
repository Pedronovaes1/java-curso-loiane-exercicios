package Exercicios01.ex02;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        Scanner scan = new Scanner(System.in);

        conta.pedirValores();
    }
}
