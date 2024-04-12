package Interface;

import java.awt.*;
import javax.swing.*;


class Circle implements Drawable {
 
 public void draw() {
    
     JFrame frame = new JFrame();
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(400, 400);
     frame.setVisible(true);

  
     JPanel panel = new JPanel() {
         @Override
         protected void paintComponent(Graphics g) {
             super.paintComponent(g);
            
             g.setColor(Color.RED);
             g.fillOval(100, 100, 200, 200);
         }
     };

     
     frame.add(panel);
 }
}

