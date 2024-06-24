package ar.com.codoacodo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        		/*
		ATAJOS DE ECLIPSE:
		*****************
		
		https://adictosaltrabajo.com/2010/05/25/atajos-eclipse/
		
		Tipos de datos:
		**************
		
		Primitivos    objeto
		
		int           Integer
		string		  String
		char		  Character
		byte		  Byte
		short 		  Short
		long		  Long
		float		  Float
		double		  Double
		boolean		  Boolean
		
		Clases:
		*******
		
		Clases definidas (Api) con métdos preestablecidos 
		*String
		*Math
		*Array
		
		Clases propias (objetos de tipo Animal con metodos propios como ladrar()
		
		
		Metodos (Api):
		**************
		
		**Matemáticos:
		
		Math.sqrt(n);
		Math.pow(base, exponente);
		Math.PI;
		Math.round(decimal);
		
		**De cadenas:
		
		Link a varios métotos importantes: https://tinchicus.com/2019/04/12/java-metodos-para-la-clase-string/
		
		.length();  cantidad de caracteres de la cadena o posición
		.charAT(n); contenido de una posición particular.
		.substring(0, 2); subcadena de otra cadena desde posición 0 a posición 2.
		.equal(cadena);
		.equalIgnoreCase(cadena);
		
		 
		 */
		
		//Clases y métodos definidos:
		
		//Math
		
		Double valor = 87.2;
		Double raiz = Math.sqrt(valor);
		
		System.out.println("El número redondeado a entero de la raiz de " + valor + " es: " + (int)Math.round(raiz));
		System.out.println("\nEl número " + valor + " redondeado a entero al elevarlo al cubo es " + (int)Math.round(Math.pow(valor, 3)));
		System.out.println("\nEl área del circulo formado por el radio de " + (int)Math.round(valor) + "cm es de: " + (int)Math.PI*Math.pow((int)Math.round(valor), 2) + "cm al cuadrado" );
		
		//Cadenas
		
		String frase = "Messi es el mejor jugador del mundo";
		Integer cantNombre = frase.length();
		System.out.println( "\n" + "Cantidad de letras de la frase: " + cantNombre);

		System.out.println("En la posición 2 de la frase esta la letra: " + frase.charAt(2) + "\n");
		
		String elDiezArgentino = frase.substring(0, 5);
		System.out.println("Maradona y " + elDiezArgentino + " son los mejores jugadores Argentinos de la historia del fútbol");
		
		Boolean comparacion = frase.equals(elDiezArgentino);
		System.out.println("La igualdad de las frases es: " + comparacion);
		
		
		/*  
		 
		Estructuras:
		************
		
		//if
		
		if(valor < 100){
			System.out.println("El valor es menor a 100");	
		}
		
		else {
			System.out.println("Pruebe otro valor");	
		} 
				 
		   */
		
		//Ejemplos:
		
		if(valor < 100){
			System.out.println("\nEl valor es menor a 100");	
		}
		
		else {
			System.out.println("\nPruebe otro valor");	
		}
		
		
		
		//Switch
		
		/*
		switch(expresion) {
		   case x:
		      bloque de instrucciones
		   break;
		   case y:
		      bloque de instrucciones
		   break;
		   default:
		      bloque de instrucciones
		}
		*/
		
		String dia = "Domingo";
      
        switch (dia){
            case "Lunes":
                System.out.println("Ufff!, que la fuerza te acompañe");
            break;
            case "Miérccoles":
                System.out.println("Estamos a mitad de semana");
            break;
            case "Viernes":
                System.out.println("Mañana empieza el fin de semana");
            break;
            case "Sábado": case "Domingo":
                System.out.println("Disfruta del fin de semana");
            break;
            default:
                System.out.println("Que tengas un buen día");
            break;
        }
        
        
        //Bucles
        
        
        /*
		
		//For
		
		for (inicialización del iterador ; hasta  ; incremento){
             <bloque de instrucciones>
		}
		*/
		
		for (int i=1; i<=10; i++){
            System.out.println("posición n°: " + i);
        }
		
		//for each
		String []paises = {"Argentina", "Bolivia", "Colombia", "Ecuador", "Perú", "México", "Uruguay", "Paraguay", "Chile"};
		
		for (String i: paises ) {
			System.out.println("\npais: " + i);
		}
		
		
		
		//While
		
		/* 
		 while (condición) {
              <  bloque de instrucciones >
		}
		 */
		 
		Integer numero=15;
		
        while (numero>-1){
            System.out.println("El numero es "+ numero);
            numero += -3;
        }
         
        
		//Do while
	
        /*
		do {
		   <bloque de instrucciones>
		} 
		while (condición);
		
		*/
        
        
        do {
            System.out.println("El numero es "+ numero);
            numero += -3;
        }
        while (numero>-18);
        
        
        
        //Arrays:
        
        //Declaración de un array
        
        //forma 1:
        
        String [] paisesLatinos = new String[10];
        
        paisesLatinos[0] = "Argentina";
        
        System.out.println(paisesLatinos[0]);
        
        
        //forma 2:
        
        Integer[] numeros = {1, 5, 9};
        
        String [] pLatinos = {"Argentina", "Bolivia", "Colombia", "Ecuador"};


        //ArrayList - objeto - sin límite

        //Link a metodos de arrayList: https://www.w3schools.com/java/java_ref_arraylist.asp

        //importación de su clase

        // import java.util.ArrayList; Lo declaramos en la parte superior

        // declaramos el objeto de tipo arrayList

        ArrayList<String> paisesLatinosArray = new ArrayList<String>();

        paisesLatinosArray.add("Argetnina");
        paisesLatinosArray.add("Bolivia");
        paisesLatinosArray.add("Chile");
        paisesLatinosArray.add("Colombia");

        System.out.println(paisesLatinosArray);

        // agregar un elemento al principio

        paisesLatinosArray.add(0, "Perú"); 

        System.out.println(paisesLatinosArray);

        //acceder a un aposición particular

        paisesLatinosArray.get(3);

        if (paisesLatinosArray.get(3) == "Chile"){
            System.out.println("El pais es: Chile" );
        }

        //modificar un elemento

        paisesLatinosArray.set(0, "México");

        System.out.println(paisesLatinosArray);


        //borrar un elemento

        paisesLatinosArray.remove(0);

        System.out.println(paisesLatinosArray);

        //borrar todo el ArrayList

        //paisesLatinosArray.clear();


        //tamaño del arrayList

        System.out.println(paisesLatinosArray.size());

        //Recorrido del arrayList

        for (int i = 0; i < paisesLatinosArray.size(); i++) {
            System.out.println(paisesLatinosArray.get(i));
        }

        for (String i : paisesLatinosArray) {
            System.out.println(i);
        }

        //Métodos array

        //import java.util.Collections; agregar para usar el metodo sort para ordenar.

        Collections.sort(paisesLatinosArray); 

        System.out.println(paisesLatinosArray);


        //Ingreso de datos por consola:

        //Scanner

        //import java.util.Scanner; importar arriba para usar

        Scanner nombrePersona = new Scanner(System.in); //declaro el objeto tipo scanner
        System.out.println("Ingrese su nombre:");

        String usuario = nombrePersona.nextLine();
        System.out.println("Bienvenido: " + usuario);

        //otros ingresos:

        /* 
         nextLine(); texto
         nextint(); entero
         nextDouble(); decimal

         Necesitan crear un objeto de tipo Scanner y tener importada la clase.
         */

    }
}
