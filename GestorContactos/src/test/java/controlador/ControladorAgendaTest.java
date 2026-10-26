/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author juans
 */
public class ControladorAgendaTest {
//Metodo guardarContacto con datos y vacio        
    @Test
    public void testGuardarContacto_ControladorAgenda(){
        ControladorAgenda controlador = new ControladorAgenda();
        assertEquals("Contacto Juan guardado correctamente", controlador.guardarContacto("Juan", "3001234567"));
    }

    @Test
    public void testGuardarContactoVacio_ControladorAgenda(){
        ControladorAgenda controlador = new ControladorAgenda();
        assertEquals("Debe ingresar el nombre y el telefono", controlador.guardarContacto("", "3001234567"));
    }

    
}
