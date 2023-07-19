package Feature;

public class DetailsScreen {
    private final String ScreenDiagonal;

    public DetailsScreen(String ScreenDiagonal) { this.ScreenDiagonal = ScreenDiagonal; }

    public String getScreenDiagonal() { return ScreenDiagonal; }

    @Override
    public String toString() { return "Экран монитора: " + getScreenDiagonal(); }
}