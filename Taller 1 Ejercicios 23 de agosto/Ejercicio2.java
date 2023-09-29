public class Ejercicio2 {
    public static void main(String[] args) {
      
      int[] listado = {40,50,60,24,66,12,98};
      int suma = 0;
      
      for (int i = 0; i < listado.length; i++) {
        suma+=listado[i];
      }
      
      int promedio = suma/listado.length ;
      
      System.out.println("El promedio de todos los elementos es: " + (promedio));
      for (int j = 0; j < listado.length; j++) {
        if ((Integer.valueOf(listado[j]))<promedio){
            System.out.println(listado[j] + " esta por debajo del promedio");
          }
        else {
            System.out.println(listado[j] + " es igual o esta por encima del promedio");
          }
      } 
    }
}
