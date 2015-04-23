/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;

/**
 *
 * @author Parisan
 */
public class Fondo extends JPanel{
  
 
    @Override
    public void paintComponent(Graphics g) {
        Dimension tam = getSize();
        
     ImageIcon image = new ImageIcon(new ImageIcon(getClass().getResource("/recursos/dibujo.png")).getImage());
     g.drawImage(image.getImage(), 0, 0, tam.width, tam.height,null);
        
    }
    
}   

