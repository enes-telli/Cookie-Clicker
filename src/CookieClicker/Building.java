
package CookieClicker;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Building {
    
    public String name; // gereksiz gibi, koda etkisi yok
    public int price;
    public int count;
    public double cps;
    public JButton button;
    public JLabel label;
    
    public Building(String name, int price, double cps, JButton button, JLabel label)
    {
        this.name = name;
        this.price = price;
        this.count = 0;
        this.cps = cps;
        this.button = button;
        this.label = label;
    }

}
