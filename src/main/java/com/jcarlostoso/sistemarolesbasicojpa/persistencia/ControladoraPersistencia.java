/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcarlostoso.sistemarolesbasicojpa.persistencia;

import com.jcarlostoso.sistemarolesbasicojpa.logica.Rol;
import com.jcarlostoso.sistemarolesbasicojpa.logica.Usuario;
import com.jcarlostoso.sistemarolesbasicojpa.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public List<Rol> traerRoles() {
       
        return rolJPA.findRolEntities();
    }

    

    public void crearUsuario(Usuario usu) {
        usuarioJPA.create(usu);
    }

    public void borrarUsuario(int idUsuer) {
        try {
            usuarioJPA.destroy(idUsuer);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
}
