public class EndingManager {

    public static EndingType getEnding(int heart) {

        if (heart >= 80) {
            return EndingType.TRUE_LOVE;
        }
        if (heart >= 50) {
            return EndingType.ROMANTIC;
        }
        if (heart >= 20) {
            return EndingType.CLOSE_FRIEND;
        }
        if (heart >= 0) {
            return EndingType.NORMAL_FRIEND;
        }
        if (heart >= -19) {
            return EndingType.AWKWARD;
        }
        return EndingType.BAD;
    }
}