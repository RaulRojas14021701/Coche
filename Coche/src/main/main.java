/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import general.Tesla;

/**
 * <h1>Coche</h1>
 * 
 * <p>La aplicación de consola Coche simula algunas acciones de los coches a través de métodos,
 * a la vez ejemplifica algunos casos de sobreescritura y sobrecarga de métodos</p>
 * 
 * @author Carlos Eduardo González Anguiano
 * @version 1.0.0
 * @since 01-09-2017
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception Error por pasar una carga mayor a 100% o menor a 0
     */
    public static void main(String[] args) throws Exception {
        //Ahora el constructor por default genera un error
        //Tesla teslita = new Tesla();
        //teslita.comprar("Saunas");
        
        Tesla t1 = new Tesla("Roberto");
        t1.comprar("Carlos");
        Tesla t2 = new Tesla("Gregorio", 75);
        t2.comprar("Rebecca");
        t1.encender();
        t2.encender();
        t1.cargar(50);
        t2.cargar(50);
    }
    
}
