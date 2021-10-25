package flowers;

import java.util.Random;

public enum Color {
    BLACK, RED, ROSE, YELLOW, WHITE;
    public static Color getRandom() {
        return Color.values()[new Random().nextInt(Color.values().length)];
    }
}
