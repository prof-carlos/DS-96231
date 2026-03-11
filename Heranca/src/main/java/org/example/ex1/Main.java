package org.example.ex1;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marta", 42, "03/11/2025", "cartão de crédito");
        Funcionario funcionario1 = new Funcionario("Maria", 55, "ASDF", "Recepcionista", 3000);

        System.out.println(cliente1.toString());
        System.out.println(funcionario1.toString());
    }
}