/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Agenda;
/**
 *
 * @author juans
 */
public class ControladorAgenda {
    private Agenda agenda;
    
    public ControladorAgenda() {
        agenda = new Agenda();
    }

    public String guardarContacto(String nombre, String telefono){
        nombre = nombre.trim();
        telefono = telefono.trim();

        if (nombre.isEmpty() || telefono.isEmpty()){
            return "Debe ingresar el nombre y el telefono";
        }
        agenda.guardarContacto(nombre, telefono);
        return "Contacto " + nombre + " guardado correctamente";
    }    
}
