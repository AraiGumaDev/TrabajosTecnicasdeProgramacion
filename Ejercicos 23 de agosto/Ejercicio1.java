import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
      
      double[] Celcius = {0,100,25,10};
      double[] Fahrenheit = {32,100,40};

      //No se como hacer para poder imprimir esto en consola
      //me tira un error de incopatibilidad de tipos :c
      for (double i = 0; i < Celcius.length; i++) {
        double conversión = (Celcius[i]*1.8)+32;
        System.out.print(conversión);
      }
      
      System.out.println("Hello world");
  }
}