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

//Metodo buscarContacto con datos, si no existe y vacio    
    @Test
    public void testBuscarContacto_ControladorAgenda(){
        ControladorAgenda controlador = new ControladorAgenda();
        controlador.guardarContacto("Juan", "3001234567");
        assertEquals("Telefono de Juan: 3001234567", controlador.buscarContacto("Juan"));
    }    
    
    @Test
    public void testBuscarContactoNoExiste_ControladorAgenda(){
        ControladorAgenda controlador = new ControladorAgenda();
        controlador.guardarContacto("Juan", "3001234567");
        assertEquals("El contacto Sebastian no fue encontrado", controlador.buscarContacto("Sebastian"));
    }
    
    @Test
    public void testBuscarContactoVacio_ControladorAgenda(){
        ControladorAgenda controlador = new ControladorAgenda();
        assertEquals("Debe ingresar el nombre a buscar", controlador.buscarContacto(""));
    }        
}
