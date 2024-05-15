package Exercicios01.ex02;

import java.util.Scanner;

public class ContaCorrente {
    String numConta;
    double saldo = 0;
    String status;
    double limite;


    void verificarNumeroConta(){
        if (numConta.length() != 8){
            System.out.println("Número não é válido");
        }
    }
    void pedirValores(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        numConta = sc.nextLine();

        System.out.println("Digite o saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Digite o status: ");
        status = sc.nextLine();
    }

    void realizarSaque(double valor){
        if (saldo == 0){
            System.out.println("Saldo insuficiente");
        }else if(saldo < valor){
            System.out.println("Saldo insuficiente");
        }else if (saldo > valor){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso, seu saldo é de: " + saldo );
        }
    }

    void depositar(double valor){
        if (status == "e" || status == "E"){
            saldo += valor;
            System.out.println("Depositado com sucesso em cheque especial");
        }else{
            saldo += valor;
            System.out.println("Depositado com sucesso em cheque especial.");
            System.out.println("Seu saldo atual: " + saldo);
        }
    }
}
