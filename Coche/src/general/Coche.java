/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

/**
 * <h1>Coche</h1>
 * 
 * <p>Clase abstracta que sirve como plantilla para otros tipos de coche</p>
 * 
 * @author Carlos Eduardo González Anguiano
 * @version 1.0.0
 * @since 01-09-2017
 */
public abstract class Coche {
    
    /**
    * <h3>propietario<h3>
    * 
    * Método abstracto para implementar la venta de un coche
    */
    private String propietario;
    public abstract void comprar(String propietario);

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
}
