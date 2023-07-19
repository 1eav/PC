package Feature;

public class DetailsRam {
    private final int RamAmount;

    public DetailsRam(int ramAmount) { RamAmount = ramAmount; }

    public int getRamAmount() { return RamAmount; }

    @Override
    public String toString() { return "Объем оперативной памяти: " + getRamAmount(); }
}