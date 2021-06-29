package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> ids = new ArrayList<>();

        // crio o guarda-roupas
        GuardaRoupa guardaRoupas = new GuardaRoupa();

        System.out.println("Guardando roupa 1...");
        List<Vestuario> vest1 = new ArrayList<Vestuario>();

        vest1.add(new Vestuario("Ardidas", "Camiseta"));
        vest1.add(new Vestuario("Adidas", "Tênis com luzinha pisca-pisca"));

        ids.add(guardaRoupas.guardaVestuarios(vest1));

        System.out.println("Guardando roupa 2...");
        List<Vestuario> vest2 = new ArrayList<Vestuario>();

        vest2.add(new Vestuario("Vans", "Moleton"));
        vest2.add(new Vestuario("Vans", "Tênis de skate"));
        vest2.add(new Vestuario("Vans", "Boné de aba reta"));

        ids.add(guardaRoupas.guardaVestuarios(vest2));

        System.out.println("conteúdo do guarda-roupas:");
        guardaRoupas.mostrarVestuarios();

        System.out.println("\n\nDevolvendo roupas...");
        for (Integer id: ids) {
            List<Vestuario> devolvidos = guardaRoupas.devolverVestuario(id);
            System.out.println("ID: "+ id);
            System.out.println("\t"+Arrays.toString(devolvidos.toArray()));
        }

        System.out.println("\n\nConteúdo do guarda-roupas apos devolução:");
        guardaRoupas.mostrarVestuarios();

    }

}
