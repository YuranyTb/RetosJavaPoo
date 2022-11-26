package Sena;

import java.util.Scanner;

public class Aprendiz {

    Scanner leer = new Scanner (System.in);

    // Atributos
    private String Estudiantes;
    String Instructores; 
    public String Equipos="portatil";
    public String Cuadernos;
    public int Tablero;

    //Metodos/Operaciones

        public void registrarcuadernos(){
       
        System.out.println("El cuaderno que registro anteriormente es "+Cuadernos+" Ingrese el cuaderno que actualmente va a utilizar ");
        Cuadernos=leer.nextLine();
        
        System.out.println("El cuaderno que ingreso es "+Cuadernos);
        //Limpiar buffer

        leer.nextLine();

        System.out.println("El equipo que registro anteriormente es "+Equipos+" Ingrese el equipo que actualmemnte va a registrar" );
        Equipos=leer.nextLine();
        System.out.println("El equipo que ingreso es "+Equipos);

        leer.close();
    }



    
}
