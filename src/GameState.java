import java.io.Serializable;

public class GameState implements Serializable {

    private static final long serialVersionUID = 1L;

    private int heart;
    private int currentSceneIndex;
    private int dialogueIndex;

    public GameState(int heart, int currentSceneIndex) {
        this.heart = heart;
        this.currentSceneIndex = currentSceneIndex;
        this.dialogueIndex = 0;
    }

    public int getHeart() {
        return heart;
    }

    public void addHeart(int value) {
        heart += value;
    }

    public int getCurrentSceneIndex() {
        return currentSceneIndex;
    }

    public int getDialogueIndex() {
        return dialogueIndex;
    }

    public void nextDialogue() {
        dialogueIndex++;
    }

    public void resetDialogue() {
        dialogueIndex = 0;
    }

    public void nextScene() {
        currentSceneIndex++;
        dialogueIndex = 0;
    }

    public void setSceneIndex(int index) {
        this.currentSceneIndex = index;
        this.dialogueIndex = 0;
    }
}