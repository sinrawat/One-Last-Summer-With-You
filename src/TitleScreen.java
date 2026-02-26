import java.awt.*;
import javax.swing.*;

public class TitleScreen extends JPanel {

    private Image backgroundImage;

    public TitleScreen(GameFrame frame) {

        setLayout(null);

        // ===== โหลดภาพพื้นหลัง =====
        backgroundImage = new ImageIcon(
                getClass().getResource("/assets/bg/title_bg.jpg")
        ).getImage();

        // ===== TITLE =====
        JLabel title = new JLabel("One Last Summer With You", SwingConstants.CENTER);
        title.setFont(FontManager.getBold(52f));
        title.setForeground(new Color(255, 240, 210)); // ครีมทอง
        title.setBounds(0, 150, 1280, 80);
        add(title);

        JLabel subtitle = new JLabel("ฤดูร้อนสุดท้ายกับเธอ", SwingConstants.CENTER);
        subtitle.setFont(FontManager.getRegular(36f));
        subtitle.setForeground(new Color(255, 230, 190));
        subtitle.setBounds(0, 210, 1280, 60);
        add(subtitle);

        // ===== BUTTONS =====
        JButton start = createButton("Start Game", 320);
        JButton load = createButton("Load Game", 400);
        JButton setting = createButton("Setting", 480);
        JButton exit = createButton("Exit", 560);

        start.addActionListener(e -> frame.startGame(false));
        load.addActionListener(e -> frame.startGame(true));
        exit.addActionListener(e -> System.exit(0));

        add(start);
        add(load);
        add(setting);
        add(exit);
    }

    // ===== วาดพื้นหลัง =====
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // วาดภาพเต็มจอ
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

        // ใส่ overlay สีทองบาง ๆ
        g.setColor(new Color(255, 180, 80, 60));
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    // ===== ปุ่มธีมส้ม =====
    private JButton createButton(String text, int y) {

        JButton btn = new JButton(text) {

            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();

                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);

                // เงา
                g2.setColor(new Color(180, 95, 10));
                g2.fillRoundRect(0, 5, getWidth(), getHeight(), 50, 50);

                // ตัวปุ่ม
                g2.setColor(getBackground());
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50);

                super.paintComponent(g);
                g2.dispose();
            }
        };

        btn.setBounds(500, y, 300, 60);
        btn.setFocusPainted(false);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
        btn.setOpaque(false);

        btn.setBackground(new Color(230, 130, 20)); // ส้มหลัก
        btn.setForeground(Color.WHITE);
        btn.setFont(FontManager.getBold(24f));

        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn.setBackground(new Color(255, 160, 40)); // hover
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn.setBackground(new Color(230, 130, 20));
            }
        });

        return btn;
    }
}