/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcarlostoso.sistemarolesbasicojpa.logica;

import com.jcarlostoso.sistemarolesbasicojpa.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author bynot
 */
public class ControladoraLogica {
    
    ControladoraPersistencia controlPersistencia ;

    public ControladoraLogica() {
        controlPersistencia = new ControladoraPersistencia();
    }

    public String validarUsuario(String usuario, String contra) {
        String mensaje = "";
        List <Usuario> listaUsuarios = controlPersistencia.traerUsuarios();
        
        return mensaje;
    }
    
}
