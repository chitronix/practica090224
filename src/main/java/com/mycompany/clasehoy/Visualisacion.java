/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasehoy;

/**
 *
 * @author repty
 */
public class Visualisacion {
    usuario Espectador;
    video Video;
    public Visualisacion () {
    }
    public Visualisacion (video video,usuario viewer) {
        this.Espectador= viewer;
        this.Video= video;
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



