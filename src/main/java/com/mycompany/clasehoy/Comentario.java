/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasehoy;

/**
 *
 * @author repty
 */
public class Comentario {
 
    String Comentario;
    usuario Autor;

    public Comentario () {
    }
    public Comentario (String Contenido,usuario Perfil) {
        this.Comentario= Contenido;
        this.Autor= Perfil;
    }
    public usuario getPerfil() {
        return Autor;
    }
    public void setPerfil (usuario Perfil) {
        this.Autor=Perfil;
    }
    public String getContenido() {
        return Comentario;
    }
    public void setContenido (String Contenido) {
        this.Comentario= Contenido;
    }

    }

