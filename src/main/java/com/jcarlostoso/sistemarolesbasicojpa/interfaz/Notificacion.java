/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcarlostoso.sistemarolesbasicojpa.interfaz;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author bynot
 */
public class Notificacion {
    
    private String mensaje;
    private String tipo;
    private String titulo;

    public Notificacion() {
    }

    public Notificacion(String mensaje, String tipo, String titulo) {
        this.mensaje = mensaje;
        this.tipo = tipo;
        this.titulo = titulo;
        
    }
    
    public void notificacion (){
        JOptionPane optionPanel = new JOptionPane(this.mensaje);
        if(this.tipo.equals("Info")){
           optionPanel.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if(this.tipo.equals("Error")){
            optionPanel.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optionPanel.createDialog(this.titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
    
    
}
