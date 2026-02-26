import java.awt.*;
import javax.swing.*;

public class BlurPanel extends JPanel {

    public BlurPanel() {
        setOpaque(false);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(0, 0, 0, 120));
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}