public class Ejercicio1 {
    public static void main(String[] args) {
      
      double[] Celcius = {0,100,25,10};
      double[] Fahrenheit = {32,100,40};
      
      System.out.println("-----Celcius a Fahrenheit-----");
      //Conversor de grados celcius a grados fahrenheit
      for (int i = 0; i < Celcius.length; i++) {
        double CelciusConvertido = (Celcius[i]*1.8)+32;
        System.out.println(Celcius[i]+"°C son equivalentes a "+CelciusConvertido+"°F");
      }
      
      System.out.println("\n-----Fahrenheit a Celcius-----");
      //Conversor de grados fahrenheit a grados celcius
      for (int i = 0; i < Fahrenheit.length; i++) {
        double FahrenheitConvertido = (Fahrenheit[i]-32)/1.8;
        System.out.println(Fahrenheit[i]+"°F son equivalentes a "+FahrenheitConvertido+"°C");
      }
      

  }
}
