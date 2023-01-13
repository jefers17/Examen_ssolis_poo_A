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
public abstract class Empresa extends Empleado{
    private String nombre_de_la_empresa;

    public Empresa(String nombre_de_la_empresa, Double sueldo_bruto, String categoria, String nombre, int edad) {
        super(sueldo_bruto, categoria, nombre, edad);
        this.nombre_de_la_empresa = nombre_de_la_empresa;
    }

    public String getNombre_de_la_empresa() {
        return nombre_de_la_empresa;
    }

    public void setNombre_de_la_empresa(String nombre_de_la_empresa) {
        this.nombre_de_la_empresa = nombre_de_la_empresa;
    }

   
    
    
}
