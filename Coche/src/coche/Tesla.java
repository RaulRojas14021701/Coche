/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author Alumno
 */
public class Tesla extends Coche{

    private int carga;
    private int modelo;
    
    //Ejemplo de sobreescritura de constructores

    public Tesla(int modelo) {
        this.modelo = modelo;
        this.carga = 0;
    }

    public Tesla(int modelo, int carga) {
        this.carga = carga;
        this.modelo = modelo;
    }
    
    //Ejemplo de sobreescritura de método abstracto
    
    @Override
    public void comprar(String propietario) {
        this.setPropietario(propietario);
        System.out.println(propietario + " ha comprado el auto");
    }
    
    private void encender(){
        System.out.println("El auto se ha encendido");
        this.carga -= 10;
    }
    
    private void cargar(int carga){
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
