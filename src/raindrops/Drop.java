/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raindrops;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author aidanmartin
 */
public class Drop {

    {
    radius = 5;
    minRadius = 5;
    maxRadius = 106;
    
    opacity = 240;
    minOpacity = 40;
    maxOpacity = 240;
    
    red = 60;
    green = 179;
    blue = 113;
            
    }
    
    public void draw(Graphics graphics){
        graphics.setColor(new Color(red, green, blue, opacity));
        graphics.drawOval(red, red, red, red);
    }
    
    
    int radius;
    int minRadius;
    int maxRadius;
    
    int opacity;
    int minOpacity;
    int maxOpacity;
    
    int red;
    int green;
    int blue;
   
}
