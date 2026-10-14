/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
/**
 *
 * @author juans
 */
public class Agenda {
    private ArrayList<Contacto> contactos;
    

    public Agenda() {
        contactos = new ArrayList<>();
    }  
    
    public void guardarContacto(String nombre, String telefono){
        Contacto nuevo = new Contacto(nombre, telefono);
        contactos.add(nuevo);
    }
    
    public String buscarTelefono(String nombre){
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)){
                return c.getTelefono();
            }
        }
        return null;
    }
    
}
