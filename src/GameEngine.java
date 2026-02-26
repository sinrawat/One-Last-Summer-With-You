import java.util.ArrayList;

public class GameEngine {

    private ArrayList<Scene> scenes;
    private GameState gameState;
    private boolean endingTriggered = false;

    public GameEngine() {
        scenes = new ArrayList<>();
        gameState = new GameState(0, 0);
        loadScenes();
    }

    public boolean isEndingScene() {
        return endingTriggered;
    }

    private void loadScenes() {

        scenes.add(new Scene("assets/bg/scene1.gif",
                new String[]{"", ""},
                new String[]{
                        "เสียงจักจั่นดังแข่งกับแสงแดดยามเช้า",
                        "ฤดูร้อนปีสุดท้ายของม.ปลาย เริ่มต้นขึ้นโดยที่ฉันไม่รู้เลยว่ามันจะเปลี่ยนทุกอย่าง"
                }, null));

        scenes.add(new Scene("assets/bg/scene1.gif",
                new String[]{"ครู", "นัตสึมิ", ""},
                new String[]{
                        "วันนี้เรามีนักเรียนย้ายมาใหม่",
                        "สวัสดีค่ะ ฉันชื่อโฮชิโนะ นัตสึมิ ฝากตัวด้วยนะคะ",
                        "เธอเดินมานั่งข้างฉัน พร้อมรอยยิ้มที่ทำให้หัวใจเต้นแรงอย่างประหลาด"
                },
                new Choice[]{
                        new Choice("ฮารุ... ยินดีที่ได้รู้จักนะ", 10),
                        new Choice("แค่ฮารุ", 3),
                        new Choice("อืม...", -5)
                }));

        scenes.add(new Scene("assets/bg/scene1.gif",
                new String[]{"", "นัตสึมิ"},
                new String[]{
                        "หลังเลิกเรียน เธอชวนฉันขึ้นดาดฟ้า",
                        "ที่นี่สวยจัง... นายมาบ่อยไหม?"
                },
                new Choice[]{
                        new Choice("ตั้งแต่วันนี้คงมาบ่อยขึ้น", 15),
                        new Choice("ก็มาคนเดียวบางครั้ง", 5),
                        new Choice("ไม่เคยขึ้นมาเลย", -5)
                }));

        scenes.add(new Scene("assets/bg/scene1.gif",
                new String[]{"", ""},
                new String[]{
                        "ไม่กี่วันต่อมา โรงเรียนจัดทัศนศึกษาไปทะเล",
                        "บนรถบัส เธอหลับพิงไหล่ฉันโดยไม่รู้ตัว",
                        "ฉันไม่ได้ขยับเลย กลัวว่าช่วงเวลานี้จะหายไป"
                }, null));

        scenes.add(new Scene("assets/bg/scene1.gif",
                new String[]{"นัตสึมิ"},
                new String[]{"ลงน้ำกันไหม!"},
                new Choice[]{
                        new Choice("จับมือเธอแล้ววิ่งลงไปด้วยกัน", 15),
                        new Choice("หัวเราะแล้วบอกว่าใครจะกลัว!", 5),
                        new Choice("ขอนั่งดูเฉย ๆ ก็พอ", -10)
                }));

        scenes.add(new Scene("assets/bg/scene1.gif",
                new String[]{"นัตสึมิ", ""},
                new String[]{
                        "วันนี้สนุกจังเลยนะ",
                        "ข้อความนั้นทำให้ฉันยิ้มอยู่หน้าจอมือถือคนเดียว"
                }, null));

        scenes.add(new Scene("assets/bg/scene1.gif",
                new String[]{"นัตสึมิ"},
                new String[]{"ฉันจะย้ายกลับหลังซัมเมอร์จบลง"},
                new Choice[]{
                        new Choice("ทำไมเพิ่งบอกฉัน...", 5),
                        new Choice("งั้นเวลาที่เหลือ ฉันจะทำให้ดีที่สุด", 20),
                        new Choice("ก็แค่ย้ายเมืองเองนี่", -20)
                }));

        scenes.add(new Scene("assets/bg/scene1.gif",
                new String[]{"", ""},
                new String[]{
                        "คืนงานดอกไม้ไฟมาถึงเร็วกว่าที่คิด",
                        "เสียงผู้คนรอบตัวค่อย ๆ เลือนหาย เหลือแค่เรา"
                }, null));

        scenes.add(new Scene("assets/bg/scene1.gif",
                new String[]{"นัตสึมิ"},
                new String[]{"ถ้าวันนี้เป็นคืนสุดท้าย นายจะเสียใจไหม?"},
                new Choice[]{
                        new Choice("ฉันรักเธอ", 25),
                        new Choice("จับมือเธอแน่น ๆ", 10),
                        new Choice("เงียบ แล้วมองดอกไม้ไฟแทน", -25)
                }));

        scenes.add(new Scene("assets/bg/scene1.gif",
                new String[]{"", ""},
                new String[]{
                        "เช้าวันสุดท้ายมาถึง",
                        "ฤดูร้อนปีนั้น กลายเป็นความทรงจำที่ไม่มีวันลืม"
                }, null));

        scenes.add(new Scene("assets/bg/scene1.gif",
                new String[]{""},
                new String[]{"TRUE LOVE END"}, null));

        scenes.add(new Scene("assets/bg/scene1.gif",
                new String[]{""},
                new String[]{"ROMANTIC END"}, null));

        scenes.add(new Scene("assets/bg/scene1.gif",
                new String[]{""},
                new String[]{"CLOSE FRIEND END"}, null));

        scenes.add(new Scene("assets/bg/scene1.gif",
                new String[]{""},
                new String[]{"NORMAL FRIEND END"}, null));

        scenes.add(new Scene("assets/bg/scene1.gif",
                new String[]{""},
                new String[]{"AWKWARD END"}, null));

        scenes.add(new Scene("assets/bg/scene1.gif",
                new String[]{""},
                new String[]{"BAD END"}, null));
    }

    public Scene getCurrentScene() {
        return scenes.get(gameState.getCurrentSceneIndex());
    }

    public void selectChoice(int index) {
        Choice c = getCurrentScene().getChoices()[index];
        gameState.addHeart(c.getHeartEffect());
        gameState.nextScene();
    }

    public void nextScene() {

        // ถ้าอยู่ในฉากจบแล้ว → ห้ามไปต่อ
        if (endingTriggered) {
                return;
        }

        // ถ้าจบ Scene 9 → คำนวณ Ending
        if (gameState.getCurrentSceneIndex() == 9) {

                endingTriggered = true;

                EndingType ending = EndingManager.getEnding(gameState.getHeart());

                switch (ending) {
                case TRUE_LOVE -> gameState.setSceneIndex(10);
                case ROMANTIC -> gameState.setSceneIndex(11);
                case CLOSE_FRIEND -> gameState.setSceneIndex(12);
                case NORMAL_FRIEND -> gameState.setSceneIndex(13);
                case AWKWARD -> gameState.setSceneIndex(14);
                case BAD -> gameState.setSceneIndex(15);
                }

                return;
        }

        gameState.nextScene();
   }

    public GameState getGameState() {
        return gameState;
    }

    public void saveGame() {
        SaveManager.save(gameState);
    }

    public void loadGame() {
        GameState loaded = SaveManager.load();
        if (loaded != null) gameState = loaded;
    }
}