/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcarlostoso.sistemarolesbasicojpa.persistencia;

import com.jcarlostoso.sistemarolesbasicojpa.logica.Usuario;
import java.util.List;

/**
 *
 * @author bynot
 */
public class ControladoraPersistencia {
    //se crean instrancias de las JPAController
    
    UsuarioJpaController usuarioJPA= new UsuarioJpaController();
    RolJpaController rolJPA = new RolJpaController();

    public List<Usuario> traerUsuarios() {
        return usuarioJPA.findUsuarioEntities();
        
    }
    
    
}
