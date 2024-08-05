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

    public List<Usuario> traerUsuarios() {
        return  controlPersistencia.traerUsuarios();
        
    }
        
    public List<Rol> traerRoles() {
       return controlPersistencia.traerRoles();
    }

    public void crearUsuario(String usuario, String contra, String rolRecibido) {
        //crea una intacia de usuario
        
        Usuario usu = new Usuario();
        usu.setNombreUsuario(usuario);
        usu.setContrasena(contra);
        
        Rol  rolEncontrado = new Rol();
        
            rolEncontrado = this.traerRol(rolRecibido);
        if(rolEncontrado !=null){   
          usu.setRol(rolEncontrado);
        }
        
        controlPersistencia.crearUsuario(usu);
    }

    private Rol traerRol(String rolRecibido) {
            List <Rol> listaRoles = controlPersistencia.traerRoles();
            for(Rol rol : listaRoles){
                if(rol.getNombreRol().equals(rolRecibido)){
                    return rol;
                }
            }
            return null; 
    }

    public void borrarUsuario(int idUsuer) {

        controlPersistencia.borrarUsuario(idUsuer);
    }
    
}
