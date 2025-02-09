package com.dio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int conta;
        int agencia;
        String nome;
        double saldo;

        while (true) {
            System.out.print("Insira o número da sua conta: ");
            if (scanner.hasNextInt()) {
                conta = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Por favor, insira um número válido para a conta.");
                scanner.nextLine();
            }
        }

        while (true) {
            System.out.print("Insira o número da sua agência: ");
            if (scanner.hasNextInt()) {
                agencia = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Por favor, insira um número válido para a agência.");
                scanner.nextLine();
            }
        }

        System.out.print("Insira o nome do titular: ");
        nome = scanner.nextLine();


        while (true) {
            System.out.print("Insira o seu saldo: ");
            if (scanner.hasNextDouble()) {
                saldo = scanner.nextDouble();
                if (saldo >= 0) {
                    break;
                } else {
                    System.out.println("O saldo não pode ser negativo. Tente novamente.");
                }
            } else {
                System.out.println("Por favor, insira um valor numérico válido para o saldo.");
                scanner.nextLine();
            }
        }

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. ", nome);
        System.out.printf("Sua agência é %d, conta %d e seu saldo é R$ %.2f, ", agencia, conta, saldo);
        System.out.println("o saldo já está disponível para saque.");

        scanner.close();
    }
}