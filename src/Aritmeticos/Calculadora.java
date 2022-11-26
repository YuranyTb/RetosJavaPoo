package Aritmeticas;

import java.util.Scanner;

public class Calculadora {
    Scanner leer = new Scanner(System.in);
    //Atributos
    int num1;
    int num2;
    int suma;
    int resta;
    double numeroaelevar;
    int exponente1;
    int exponente2;
    String total;


    public void sumadedosNumeros(){

        System.out.println("Ingrese el numero 1");
        num1= leer.nextInt();

        System.out.println("Ingrese el numero 2");
        num2= leer.nextInt();

        suma=num1+num2;
        System.out.println("La suma de los dos numeros es "+suma);

        }

        public int restadedosNumeros(int num1, int num2){
        resta=num1-num2;
        System.out.println("La resta de los dos numeros es "+resta);
        return resta;
        }   
        
        public int numeroMayor(int num1, int num2){

            if (num1>num2){
            System.out.println("El numero mayor es el Numero1 " +num1);
            return num1;
        }  
            else{
            System.out.println("El numero mayor es el Numero2 " +num2);
            return num2; 
        }   
    } 

        public int numeroMenor(int num1, int num2){

            if (num1<num2){
            System.out.println("El numero menor es el Numero1 " +num1);
            return num1;
        }  
            else{
            System.out.println("El numero menor es el Numero2 " +num2);
            return num2; 
        }      
    }

        public String numeroExponente(){

            System.out.println("Digite el primer numero");
            num1=leer.nextInt();

            System.out.println("Digite el segundo numero");
            num2=leer.nextInt();

            System.out.println("Digite el exponente al que desea elevar los numeros");
            double numeroaelevar=leer.nextDouble();

            double exponente1=(int)Math.pow(num1, numeroaelevar);
            double exponente2=(int)Math.pow(num2, numeroaelevar);

            System.out.println("El numero a elevar es "+num1+ " y su resultado es " +exponente1+ "\nEl numero a elevar es " +num2+ " y su resultado es " +exponente2);
            total=leer.next();
            return total;   
        }          
    }      


    //Metodos

    //1.Metodo sin valor de retorno que sume los dos numeros

    //2.Metodo con valor de retorno que reste los dos numeros

    //3.Metodo con valor de retorno que devuelva cual es el numero mayor

    //4.Metodo sin valor de retorno que devuelva cual es el numero menor

    //5.Metodo con valor de retorno que eleve cada numero al exponente que sea indicado por el usuario




