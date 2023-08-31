import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;


public class Ejercicios28deagosto {

	/*

	- 	Realice cada punto en el orden que desee
	- 	El ejericio debe ser realizado con los conceptos vistos en clase
	- 	Como parte del ejercicio se proveen 5 metodos utilitarios a los cuales hay que definir los tipos de datos que considere
		es el mas conveniente para el tipo de dato a manejar. Cada uno de estos metodos devuelve un array con el dato que se quiere analizar.
		Por ejemplo el metodo pesos devuelve un array con los valores {70,58,3,55,63...}.
		NOTA: Estos metodos se encuentran comentados, descomente solo el metodo del punto que este trabajando para evitar error de compilacion.
  - 	No es necesario crear nuevos metodos, todos los puntos pueden ser programados en el metodo main
  -   Adicionalmente y al final de la clase se ha incluido como ejemplo el metodo  public static String[] getDirecciones(String[] data). Ese metodo se usa para
    extraer las direcciones de cada persona, las cuales son imprimidas utilizando un for desde el main

	1. Pesos:
		Imprimir los pesos
		Calcular la media de los pesos

	2. Estaturas:
		Imprimir estaturas
		Encontrar el menos alto
		Encontrar el mas alto

	3. Generos
		Contar cuantas personas tienen genero Masculino (M), y cuantas con Femenino (F)

	4. Nombres Completos
		Generar una cadena que contenga todos los nombres de las personas separados por comas asi:
		Juan Pérez,María García, Carlos Pérez

	5. Edades:
		Imprimir las edades de cada persona
		Encontrar cual es la persona con menos año
*/

	public static void main(String[] args) {
		String[] data = new String[11];

		data[0] = "Nombres, Apellidos, Fecha de Nacimiento (DIA/MES/AÑO, Direccion, Nivel Academico, Ocupacion, Genero, Peso en kilogramos, Estatura en metros";
		data[1] = "Juan,Pérez,15/03/1985,Calle 123,Medellin,Licenciatura en Ingeniería,Ingeniero de Software,M,70,1.75";
		data[2] = "María,García,28/07/1992,Calle 123,Medellin,Maestría en Psicología,Psicóloga Clínica,F,58,1.68";
		data[3] = "Carlos,Pérez Garcia,10/03/2023,Calle 123,Medellin,,,M,3,0.80";
		data[4] = "Ana,Martínez,05/09/2009,Calle 14,Villa,Bachiller,Estudiante,Femenino,55,1.60";
		data[5] = "Luisa,Hernández,20/06/1989,Carrera 789,Envigado,Doctorado en Economía,Profesora Universitaria,F,63,1.70";
		data[6] = "Javier,López,12/04/1975,Calle San Juan,Medellin,Licenciatura en Arquitectura,Arquitecto Independiente,M,75,1.82";
		data[7] = "Laura,Ramírez,18/04/1998,Avenida 6,Ciudad Metropolitana,Bachiller,Estudiante,F,52,1.65";
		data[8] = "Martín,Torres,30/02/1998,Avenida 6,Aldea,Bachiller,Estudiante,M,68,1.78";
		data[9] = "Sofia,Vargas,22/07/1995,Avenida 6,Rionegro,Bachiller,Estudiante,F,60,1.63";
		data[10] = "Daniel,Sánchez,08/12/1999,Avenida 6,Rionegro,Bachiller,Estudiante,M,72,1.79";



		//El metodo getDirecciones y el siguiente for se incluye como ejemplo de impresión de las direcciones
		
		System.out.println("----Direcciones----");
		String[] direcciones = getDirecciones( data );
		for ( String direccion : direcciones ) {
			System.out.println(direccion);
		}


		//1. Pesos:
		double pesosAcumulados = 0;
		System.out.println("----Pesos en KG----");
		Integer[] pesos = getPesos(data);
		for ( Integer peso : pesos ) {
			System.out.println(peso);
			pesosAcumulados += peso;
		}
		double mediaPesos = (pesosAcumulados/(data.length-1));
		System.out.println("La media de todos los pesos es: "+mediaPesos);



		//2. Estaturas:

		System.out.println("----Estaturas----");
		Double[] estaturas = getEstaturas( data );
		Double masBajo = null;
		Double masAlto = 0D;
		for ( Double estatura : estaturas ) {
			System.out.println(estatura);
      if (masBajo == null){
        masBajo = estatura;
      } else {
        if (estatura <= masBajo  ){
			    masBajo = estatura;
		    }
      }
			if (estatura > masAlto  ){
			  masAlto = estatura;
		  }
		}
    System.out.println("La persona más baja es: "+masBajo);
    System.out.println("La persona más alta es: "+masAlto);
    

		//3. Generos

		System.out.println("----Generos----");
		Character[] generos = getGeneros( data );
	  Integer totalM = 0;
	  Integer totalF = 0;
		for ( Character genero : generos ) {
			System.out.println(genero);
			if (genero == 'M'){
			  totalM++;
			} else if (genero == 'F') {
			  totalF++;
			}
		}
    System.out.println("El total de hombres es: "+totalM);
    System.out.println("El total de mujeres es: "+totalF);



		//4. Nombres Completos
		System.out.println("----Nombres Completos----");
		String cadenaDeNombres = "";
		String[] nombresCompletos = getNombresCompletos( data );
		for ( String nombreCompleto : nombresCompletos ) {
			System.out.println(nombreCompleto);
			cadenaDeNombres = cadenaDeNombres.concat(nombreCompleto.concat(", "));
		}
		System.out.println(cadenaDeNombres);

		//5. Edades:
		System.out.println("----Fechas de Nacimiento----");
		LocalDate[] fechasDeNacimiento = getFechasDeNacimientos(data);
		Long menosAños = null;
		for (LocalDate fechaDeNacimiento : fechasDeNacimiento) {
		  //System.out.println(fechaDeNacimiento);
      
      Long anosDiferencia = ChronoUnit.YEARS.between(fechaDeNacimiento,LocalDate.now());
		  System.out.println(anosDiferencia +" años");
		  if (menosAños==null){
		    menosAños = anosDiferencia;
		  } else if (menosAños>anosDiferencia){
		    menosAños = anosDiferencia;
		  }  
    }
    System.out.println("La persona que menos años tiene, tiene: "+menosAños);

	}


	public static Integer[] getPesos(String[] data){

		Integer[] pesos = new Integer[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			Integer peso = Integer.valueOf(datum[8]);
			pesos[i-1] = peso;
		}
		return pesos;
	}

	public static Double[] getEstaturas(String[] data){

		Double[] estaturas = new Double[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			Double estatura = Double.valueOf(datum[9]);
			estaturas[i-1] = estatura;
		}
		return estaturas;
	}

	public static Character[] getGeneros(String[] data){

		Character[] generos = new Character[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			Character genero = datum[7].charAt( 0 );
			generos[i-1] = genero;
		}
		return generos;
	}

	public static String[] getNombresCompletos(String[] data){

		String[] nombresCompletos = new String[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			String nombreCompleto = datum[0] + " " + datum[1];
			nombresCompletos[i-1] = nombreCompleto;
		}
		return nombresCompletos;
	}


  public static LocalDate[] getFechasDeNacimientos(String[] data){

		LocalDate[] fechasDeNacimiento = new LocalDate[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			String fechaDeNacimiento = datum[2];
			fechasDeNacimiento[i-1] = LocalDate.parse( fechaDeNacimiento, DateTimeFormatter.ofPattern("dd/MM/uuuu"));
		}
		return fechasDeNacimiento;
	}

	public static String[] getDirecciones(String[] data){

		String[] direcciones = new String[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			String direccion = datum[3] ;
			direcciones[i-1] = direccion;
		}
		return direcciones;
	}
}
