package com.example.encapsulamento;

public class Main {
    public static void main(String[] args) {
        // Instanciar a classe.
        Cliente cliente1 = new Cliente("Marta", 20);
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        
        // Instanciar a classe.
        Aluno aluno1 = new Aluno("José", "jose@gmail.com");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("E-mail: " + aluno1.getEmail());
        
        // Instanciar a classe.
        Livro livro1 = new Livro("O Alquimista", "Paulo Coelho", 300, 55.60);

        Livro livro2 = new Livro("Maktub", "Paulo Coelho", 282, 52);

        System.out.println("\n- Livro 1 -");
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Número de páginas: " + livro1.getNumeroPaginas());
        System.out.println("Preço: " + livro1.getPreco());
        
        System.out.println("\n- Livro 2 -");
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Número de páginas: " + livro2.getNumeroPaginas());
        System.out.println("Preço: " + livro2.getPreco());
    }
}