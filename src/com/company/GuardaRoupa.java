package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

    private Map<Integer, List<Vestuario>> volume;
    private Integer contador;

    public GuardaRoupa() {
        this.volume = new HashMap<Integer, List<Vestuario>>();
    }

    public Integer guardaVestuarios(List<Vestuario> listaVestuario){

        // diferencia primeiro elemento quando o map esta vazio ou nao
        if(this.volume.isEmpty())
            this.contador = 0;
        else
            this.contador++;

        this.volume.put(this.contador, listaVestuario);

        return this.contador;

    }

    public void mostrarVestuarios(){

        this.volume.forEach((key, value) -> System.out.println("Volume: " + key.toString()
                                                                + "\n\tVestuarios: " + Arrays.toString(value.toArray())));

    }

    public List<Vestuario> devolverVestuario(Integer id){

        return this.volume.remove(id);

    }




}
