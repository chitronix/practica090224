package com.mycompany.clasehoy;
public class VISUALIZACION {
    usuario Espectador;
    video Video;
    public VISUALIZACION () {
    }
    public VISUALIZACION (video video,usuario viewer) {
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
