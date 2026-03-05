package com.example.relacionamento;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa(1,"Marta", 23, "715646546",
                "marta@gmail.com", Sexo.FEMININO,
                new Endereco("Rua A", "30", "Fundo",
                        "4065465", "Salvador", UnidadeFederativa.BAHIA));

        System.out.println(pessoa1.toString());
    }
}
