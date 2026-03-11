package org.example.atv1;

public class Main {
    public static void main(String[] args) {

        Processador processador = new Processador("Intel", "i3", 3.5);
        Memoria memoria = new Memoria("Kingston", "x-PRO", "16 GB");

        PlacaMae placaMae = new PlacaMae("ASRock", "PRO-777", "LGA 1155");
        DispositivoDeArmazenamento dispositivoDeArmazenamento = new DispositivoDeArmazenamento("Western Digital", "500GBCS", "500 GB", "NVME");


        System.out.println(processador.toString());
        System.out.println(memoria.toString());
        System.out.println(placaMae.toString());
        System.out.println(dispositivoDeArmazenamento.toString());
    }
}
