package com.perez.ramon.mislugares;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramon on 31/07/2017.
 */

public class Lugares {

    protected static List<Lugar> vectorLugares = ejemploLugares();

    static Lugar elemento(int id){
        return vectorLugares.get(id);
    }

    static void anyade(Lugar lugar){
        vectorLugares.add(lugar);
    }

    static int nuevo(){
        Lugar lugar = new Lugar();
        vectorLugares.add(lugar);
        return  vectorLugares.size() - 1;
    }

    static void borrar(int id){
        vectorLugares.remove(id);
    }

    public static int size(){
        return vectorLugares.size();
    }

    public static ArrayList<Lugar> ejemploLugares(){
        ArrayList<Lugar> lugares = new ArrayList<>();
        lugares.add(new Lugar("Escuela politecnica","Direccion"
                ,1234566,2423424,TipoLugar.COMPRAS,42423442,
                "http://www.pornhub.com","El mejor sitio de porno",3));
        lugares.add(new Lugar("Escuela politecnica","Direccion"
                ,1234566,2423424,TipoLugar.COMPRAS,42423442,
                "http://www.pornhub.com","El mejor sitio de porno",3));
        return lugares;
    }

}
