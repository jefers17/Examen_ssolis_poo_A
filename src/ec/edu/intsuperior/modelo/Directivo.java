/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author User
 */
public  abstract class Directivo extends Persona {
   private String categoria;

    public Directivo(String categoria, String nombre, int edad) {
        super(nombre, edad);
        this.categoria = categoria;
    }

    
      
       

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
