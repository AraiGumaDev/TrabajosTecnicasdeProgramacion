import java.util.*;

public class EjerciciosSeptiembre11 {
    public static void main(String[] args) {
     
      record cliente (Integer id, 
                      String nombreCliente,
                      String apellidoCliente,
                      String horaLLegada,
                      String horaSalida){}
                      
      Deque<cliente> listaEspera = new ArrayDeque<cliente>();
      
      System.out.println("En cola de espera: "+listaEspera.size());
      listaEspera.addLast(new cliente(3454889,"Juan","Pérez","",""));
      System.out.println("En cola de espera: "+listaEspera.size());
      
      listaEspera.addLast(new cliente(232434,"María","García","",""));
      System.out.println("En cola de espera: "+listaEspera.size());
      
      System.out.println(listaEspera.removeFirst());
      System.out.println("En cola de espera: "+listaEspera.size());
      System.out.println(listaEspera.removeFirst());
      System.out.println("En cola de espera: "+listaEspera.size());
      
      listaEspera.addLast(new cliente(3487387,"Carlos","Pérez García","",""));
      System.out.println("En cola de espera: "+listaEspera.size());
      
      System.out.println(listaEspera.removeFirst());
      System.out.println("En cola de espera: "+listaEspera.size());
    
      listaEspera.addLast(new cliente(8478347,"Ana","Martínez","",""));
      System.out.println("En cola de espera: "+listaEspera.size());
      
      listaEspera.addLast(new cliente(5457557,"Luisa","Hernández","",""));
      System.out.println("En cola de espera: "+listaEspera.size());
      
      listaEspera.addLast(new cliente(9248934,"Javier","Lopez","",""));
      System.out.println("En cola de espera: "+listaEspera.size());
      
      listaEspera.addLast(new cliente(3489483,"Laura","Ramírez","",""));
      System.out.println("En cola de espera: "+listaEspera.size());
      
      System.out.println(listaEspera.removeFirst());
      System.out.println("En cola de espera: "+listaEspera.size());
      System.out.println(listaEspera.removeFirst());
      System.out.println("En cola de espera: "+listaEspera.size());
      System.out.println(listaEspera.removeFirst());
      System.out.println("En cola de espera: "+listaEspera.size());
      
      listaEspera.add(new cliente(3498398,"Martín","Torres","",""));
      System.out.println("En cola de espera: "+listaEspera.size());
      
      System.out.println(listaEspera.removeFirst());
      System.out.println("En cola de espera: "+listaEspera.size());
      System.out.println(listaEspera.removeFirst());
      System.out.println("En cola de espera: "+listaEspera.size());

  
      listaEspera.add(new cliente(9090909,"Sofia","Vargas","",""));
      
      System.out.println(listaEspera.removeFirst());
      System.out.println("En cola de espera: "+listaEspera.size());
      
      listaEspera.add(new cliente(9389384,"Daniel","Sánchez","",""));
      System.out.println("En cola de espera: "+listaEspera.size());
      


  }
}