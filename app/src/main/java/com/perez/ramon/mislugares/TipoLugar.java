package com.perez.ramon.mislugares;

/**
 * Created by Ramon on 31/07/2017.
 */

public enum TipoLugar {
    OTROS("Otros", 5),
    RESTAURANTE("Restaurante", 2),
    BAR("Bar",6),
    COPAS("Copas", 0),
    ESPACTACULO("Espectaculo", 0),
    HOTEL("Hotel", 0),
    COMPRAS("Compras",2),
    EDUCACION("Educacion", 0),
    DEPORTE("Deporte", 0),
    NATURALEZA("Naturaleza",0),
    GASOLINERA("Gasolinera",0);

    private final String texto;
    private final int recurso;

    TipoLugar(String texto, int recurso){
        this.texto = texto;
        this.recurso = recurso;
    }
     public String getTexto(){
         return texto;
     }

     public int getRecurso(){
         return recurso;
     }
}
