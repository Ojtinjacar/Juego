/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 */
public class Juego1 extends JFrame {

    public Juego1() {
        add(new Panel1());
    }

    public static void main(String[] args) {
        Juego1 frame = new Juego1();
        frame.setTitle("Juego");
        frame.setSize(1000, 840);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class Panel1 extends JPanel implements ActionListener{

        private Timer timer;
        private int secuencia;
        private int x;
        private int y;
        
        public Panel1() {
      timer = new Timer(25, this);
        timer.start();
    }
        @Override
        protected void paintComponent(Graphics Grafico){
        super.paintComponent(Grafico);
        Image Fondo = cargarimagen("blue_background.png");
        Image Piso = cargarimagen("ground_loop.png");
        Image MuñecoAnimacion= cargarimagen("walking.png");
       x=0;
          while (x<1001) {
           Grafico.drawImage(Fondo, x, 0, this);
           x+=22;
          }
          x=0;
         while (x<1001) {
           Grafico.drawImage(Piso, x, 740, this);
           x+=112;
          }
         x=0;
         Grafico.drawImage(MuñecoAnimacion, x, 600, this);
         Grafico.drawImage(MuñecoAnimacion, x,y, x+116, y+134,(this.secuencia*116),0,(this.secuencia*116)+116,134, this);
            System.out.println(secuencia); 
           
           
        
        
        }

        @Override
        public void actionPerformed(ActionEvent e) {
           
          if (this.secuencia==3) {
              
            this.secuencia =0;
        }else{
         this.secuencia++;   
         
        
        }
          repaint();
    }
    public Image cargarimagen(String imagen) {
        ImageIcon aaaaa = new ImageIcon(imagen);
        Image image = aaaaa.getImage();
        return image;
    }
}}
