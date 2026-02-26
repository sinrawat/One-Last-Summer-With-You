public class Scene {

    private String backgroundPath;
    private String[] characterNames;
    private String[] dialogues;
    private Choice[] choices;

    public Scene(String backgroundPath,
            String[] characterNames,
            String[] dialogues,
            Choice[] choices) {

        this.backgroundPath = backgroundPath;
        this.characterNames = characterNames;
        this.dialogues = dialogues;
        this.choices = choices;

        // ✅ กัน mismatch ตั้งแต่ตอนสร้าง
        if (characterNames != null && dialogues != null) {
            if (characterNames.length != dialogues.length) {
                System.out.println("⚠ Warning: characterNames and dialogues length mismatch!");
            }
        }
    }

    public String getBackgroundPath() {
        return backgroundPath;
    }

    // ✅ กัน ArrayIndexOutOfBounds
    public String getCharacterName(int index) {
        if (characterNames == null || index < 0 || index >= characterNames.length) {
            return "";
        }
        return characterNames[index];
    }

    // ✅ กัน dialogue index เกิน
    public String getDialogue(int index) {
        if (dialogues == null || index < 0 || index >= dialogues.length) {
            return "";
        }
        return dialogues[index];
    }

    public int getDialogueLength() {
        if (dialogues == null) {
            return 0;
        }
        return dialogues.length;
    }

    public Choice[] getChoices() {
        return choices;
    }
}