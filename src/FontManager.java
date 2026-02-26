import java.awt.*;
import java.io.File;

public class FontManager {

    private static Font regularFont;
    private static Font boldFont;

    public static void loadFont() {

        try {
            regularFont = Font.createFont(
                    Font.TRUETYPE_FONT,
                    new File("assets/fonts/Anuphan-Regular.ttf")
            );

            boldFont = Font.createFont(
                    Font.TRUETYPE_FONT,
                    new File("assets/fonts/Anuphan-Bold.ttf")
            );

            System.out.println("✅ โหลดฟอนต์สำเร็จ");

        } catch (Exception e) {

            System.out.println("❌ โหลดฟอนต์ไม่สำเร็จ");
            e.printStackTrace();

            regularFont = new Font("SansSerif", Font.PLAIN, 18);
            boldFont = new Font("SansSerif", Font.BOLD, 18);
        }
    }

    public static Font getRegular(float size) {
        return regularFont.deriveFont(size);
    }

    public static Font getBold(float size) {
        return boldFont.deriveFont(size);
    }
}