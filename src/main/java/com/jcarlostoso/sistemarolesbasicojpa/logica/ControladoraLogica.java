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

    public Usuario validarUsuario(String usuario, String contra) {
        Usuario respuesta =null;
            List <Usuario> listaUsuarios = controlPersistencia.traerUsuarios();
            
            for(Usuario usu : listaUsuarios){
                
                if(usu.getNombreUsuario().equals(usuario) && usu.getContrasena().equals(contra)){
                    respuesta = usu;
                    return respuesta;
                }
            }
        
        return respuesta;
    }

   
    
}
