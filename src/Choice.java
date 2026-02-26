public class Choice {

    private String text;
    private int heartEffect;

    public Choice(String text, int heartEffect) {
        this.text = text;
        this.heartEffect = heartEffect;
    }

    public String getText() {
        return text;
    }

    public int getHeartEffect() {
        return heartEffect;
    }
}