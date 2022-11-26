package Repaso;

public class Cuadrado extends Figura_Reto5{

    //Atributos
    private float lado;

    //Metodos

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }
    
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    @Override
    public void calcularArea() {
        float area= lado*lado;
        System.out.println("El area del cuadrado de lado "+lado+ " es " +area);
        
    }


   


   

    
}
