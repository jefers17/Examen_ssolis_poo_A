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
public class Cliente extends Empresa{

   
    private float telefono_de_contacto;

    public Cliente() {
        super(null, null, null, null, 0);
    }

    
    public Cliente(float telefono_de_contacto, String nombre_de_la_empresa, Double sueldo_bruto, String categoria, String nombre, int edad) {
        super(nombre_de_la_empresa, sueldo_bruto, categoria, nombre, edad);
        this.telefono_de_contacto = telefono_de_contacto;
    }

    

    

    
    

       public float getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(float telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }

   
   
    
        
    
}
