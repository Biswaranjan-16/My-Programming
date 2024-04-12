package Interface;

import java.awt.*;
import javax.swing.*;


class Rectangle implements Drawable {

 public void draw() {
    
     JFrame frame = new JFrame();
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(400, 400);
     frame.setVisible(true);

    
     JPanel panel = new JPanel() {
         @Override
         protected void paintComponent(Graphics g) {
             super.paintComponent(g);
          
             g.setColor(Color.BLUE);
             g.fillRect(100, 100, 200, 200);
         }
     };

     
     frame.add(panel);
 }
} 

