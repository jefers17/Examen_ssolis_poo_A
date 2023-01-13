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
public abstract class Empleado extends Directivo{
    
    private  Double sueldo_bruto;

    public Empleado(Double sueldo_bruto, String categoria, String nombre, int edad) {
        super(categoria, nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    

    
   

    public Double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(Double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
   
        
    
}
