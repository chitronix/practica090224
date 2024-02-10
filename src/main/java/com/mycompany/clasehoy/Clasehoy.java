/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasehoy;

/**
 *
 * @author repty
 */
public class Clasehoy {

    public static void main(String[] args) {
      usuario usu1= new usuario("Christofer");
      video vid1= new video ("Mi primera chamba", 6000,"Https://youtube.com/v1");
      usu1.subirVideo(vid1);
      usu1.mostrarInfoUsuario();
    }
}
