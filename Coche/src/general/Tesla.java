/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

/**
 * <h1>Tesla</h1>
 * 
 * <p>Clase que hereda de Coche, crea un auto eléctrico de marca Tesla</p>
 * 
 * @author Carlos Eduardo González Anguiano
 * @version 1.0.0
 * @since 01-09-2017
 */
public class Tesla extends Coche{

    private int carga;
    private String modelo;
    
    //Ejemplo de sobrecarga de métodos en un constructor

    /**
    * <h3>Constructor</h3>
    * Este constructor inicializa la clase con solo el modelo
    * 
    * @param modelo String del modelo de Tesla que es el auto
    */
    public Tesla(String modelo) {
        this.modelo = modelo;
        this.carga = 0;
    }

    /**
    * <h3>Constructor</h3>
    * Este constructor inicializa la clase con el modelo y la carga del auto
    * Tesla, no permite que se ingrese una carga mayor a 100 o menor a 0;
    * 
    * @param modelo Nombre del modelo de Tesla que es el auto
    * @param carga Número que señala el porcentaje al que está cargado el auto
    * @throws java.lang.Exception
    */
    public Tesla(String modelo, int carga) throws Exception {
        if(carga<0 || carga>100){
            throw new Exception();
        }
        this.carga = carga;
        this.modelo = modelo;
    }
    
    //Ejemplo de sobreescritura de método abstracto
    
    /**
    * <h3>comprar</h3>
    * Implementacion del método abstracto comprar de Carro, reasigna al propietario
    * e imprime la compra en pantalla
    * 
    * @param propietario Nombre de la persona que compro el coche
    */
    
    @Override
    public void comprar(String propietario) {
        this.setPropietario(propietario);
        System.out.println(propietario + " ha comprado el auto");
    }
    
    /**
    * <h3>encender</h3>
    * Imprime que el auto ha sido encendido en caso de tener una carga mayor al 10%
    */
    public void encender(){
        if(this.carga < 10){
            System.out.println("El auto no tiene carga suficiente");
        } else {
            System.out.println("El auto se ha encendido");
            this.carga -= 10;
        }
    }
    
    /**
    * <h3>cargar</h3>
    * Suma a la carga actual del carro Tesla la carga adicional del parametro carga
    * 
    * @param carga Valor que se le quiere sumar a la carga
    */
    public void cargar(int carga){
        if(carga < 0 || carga + this.carga > 100){
            System.out.println("No se puede sobrecargar la batería");
        } else {
            this.carga += carga;
            System.out.println("Batería cargada al " + this.carga);
        }
        
    }

    // Getters y Setters
    
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    
    
}
