package Feature;

public class DetailsKeyboard {
    private final String Backlight;

    public DetailsKeyboard(String backlight) { Backlight = backlight; }

    public String getBacklight() { return Backlight; }

    @Override
    public String toString() { return "Подсветка клавиатуры: " + getBacklight(); }
}