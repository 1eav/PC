package Feature;

public class DetailsHdd {
    private final int MemoryAmount;

    public DetailsHdd(int memoryAmount) { MemoryAmount = memoryAmount; }

    public int getMemoryAmount() { return MemoryAmount; }

    @Override
    public String toString() { return "Объем памяти диска: " + getMemoryAmount(); }
}