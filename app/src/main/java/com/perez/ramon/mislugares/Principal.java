package com.perez.ramon.mislugares;


/**
 * Created by Ramon on 31/07/2017.
 */

public class Principal{

  public static void main(String[] args){
      for(Lugar l : Lugares.vectorLugares){
          System.out.println(l);
      }
     /* Lugar lugar = new Lugar("La Casa de Ramon"
              ,"Calle Privada Jardin, Numero 2 , CP 45032, Jalisco(MEX)"
              , 20.5944902,-103.4218819,TipoLugar.EDUCACION,36121816,"http://www.youtube.com"
              ,"Hogar dulce hogar",3);
     System.out.println("Lugar: "+ lugar.toString());
     */
  }
}
