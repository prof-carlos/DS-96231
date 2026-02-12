package org.example;

import java.util.Scanner;

// COMENTÁRIO.

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String loginSalvo = "Marta";
        String senhaSalva = "123";
        String login;
        String senha;

        do {
            System.out.println("Digite seu login: ");
            login = ler.nextLine();

            System.out.println("Digite sua senha: ");
            senha = ler.nextLine();

            if (login.equals(loginSalvo) && senha.equals(senhaSalva)) {
                System.out.println("Bem-vindo, usuário logado!");
            } else {
                System.out.println("Nome de usuário ou senha inválidos.");
            }
        } while (!login.equals(loginSalvo) || !senha.equals(senhaSalva));
    }
}