
package CookieClicker;

import javax.swing.ImageIcon;

public class Upgrade {
    
    public int price;
    public int requiredCount;
    public ImageIcon icon;
    public boolean locked;
   
    public Upgrade (int price, int requiredCount, ImageIcon icon) {
        this.price = price;
        this.requiredCount = requiredCount;
        this.icon = icon;
        this.locked = true;
    }
}