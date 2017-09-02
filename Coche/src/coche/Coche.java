/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author Carlos Eduardo Gonzalez Anguiano
 */
public abstract class Coche {
    private String propietario;
    public abstract void comprar(String propietario);

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
}
