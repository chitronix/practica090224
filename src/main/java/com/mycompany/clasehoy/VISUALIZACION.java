package com.mycompany.clasehoy;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author repty
 */
public class VISUALIZACION {
    usuario Espectador;
    video Video;
    public VISUALIZACION () {
    }
    public VISUALIZACION (video video,usuario viewer) {
        this.Espectador= viewer;
        this.Video= Video;
    }    
    public video getVideo() {
            return Video;
        }
    public void setVideo (video Video) {
            this.Video= Video;
        }
    public usuario getViewer() {
            return Espectador;
        }
    public void setViewer (usuario Vierwer) {
            this.Espectador= Vierwer;
        }
}  
