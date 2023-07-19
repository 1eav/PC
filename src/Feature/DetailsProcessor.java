package Feature;

public class DetailsProcessor {
    private final double ProcessorFrequency;
    private final int NumberOfCores;
    private final String ProcessorManufacturer;

    public DetailsProcessor(double processorFrequency, int numberOfCores, String processorManufacturer) {
        ProcessorFrequency = processorFrequency;
        NumberOfCores = numberOfCores;
        ProcessorManufacturer = processorManufacturer;
    }

    public double getProcessorFrequency() {
        return ProcessorFrequency;
    }

    public int getNumberOfCores() {
        return NumberOfCores;
    }

    public String getProcessorManufacturer() {
        return ProcessorManufacturer;
    }

    @Override
    public String toString() {
        return "Частота процессора: " + getProcessorFrequency() + "\n" +
                "Количество ядер: " + getNumberOfCores() + "\n" +
                "Производитель процессора: " + getProcessorManufacturer();
    }
}