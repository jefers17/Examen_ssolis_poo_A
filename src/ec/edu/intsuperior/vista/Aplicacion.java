/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import java.util.Scanner;



/**
 *
 * @author User
 */
public class Aplicacion {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        Cliente c1=new Cliente();
        
        
                System.out.println("Opcion 1: Empleado");
        System.out.println("Opcion 2: Cliente");
        System.out.println("Eliga una opcion");
        int op=leer.nextInt();
        if(op==1){
            System.out.println("Usted a escojido la opcion Empleado");
            System.out.println("Ingrese el nombre del empleado");
            c1.setNombre(leer.next());
            System.out.println("Ingrese el edad del empleado");
            c1.setEdad(leer.nextInt());
            System.out.println("Ingrese el sueldo bruto del empleado");
            c1.setSueldo_bruto(leer.nextDouble());
            System.out.println("Ingrese la categoria del empleado");
            c1.setCategoria(leer.next());
            System.out.println("Ingrese la empresa al que pertence el empleado");
            c1.setNombre_de_la_empresa(leer.next());
            System.out.println("Los datos igresados son"+"\n"
            +"nombre del empleado "+c1.getNombre()+"\n"
            +"Edad del empleado"+c1.getEdad()+"\n"
            +"Sueldo"+c1.getSueldo_bruto()+"\n"
                    +"categoria  "+c1.getCategoria()+"\n"
                    +"empresa"+c1.getNombre_de_la_empresa());
        }
        if(op==2){
            System.out.println("Usted a escojido la opcion Cliente");
                      System.out.println("Ingrese el nombre del cliente");
            c1.setNombre(leer.next());
            System.out.println("Ingrese el edad del cliente");
            c1.setEdad(leer.nextInt());
            
            System.out.println("Ingrese la empresa al que pertence el cliente");
            c1.setNombre_de_la_empresa(leer.next());
            System.out.println("Ingrese el numero de telefono del cliente");
            c1.setTelefono_de_contacto(leer.nextFloat());
            System.out.println("Los datos igresados son"+"\n"
            +"nombre "+c1.getNombre()+"\n"
            +"Edad "+c1.getEdad()+"\n"
            +"Telefono"+c1.getTelefono_de_contacto()+"\n"
                    +"categoria  "+c1.getCategoria()+"\n"
                    +"empresa "+c1.getNombre_de_la_empresa());
        }
        
    }
}
