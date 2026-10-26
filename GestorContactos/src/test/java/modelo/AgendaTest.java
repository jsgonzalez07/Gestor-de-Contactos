/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author juans
 */
public class AgendaTest {
    @Test
    public void testGuardarContacto_Agenda(){
        Agenda agenda = new Agenda();
        agenda.guardarContacto("Juan", "3001234567");
        assertEquals("3001234567", agenda.buscarTelefono("Juan"));
    }    
}
