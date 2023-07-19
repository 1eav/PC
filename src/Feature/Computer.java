package Feature;

public class Computer {
    private final Processor processor;
    private final String vendor;
    private final Ram ram;
    private final Hdd hdd;
    private final Screen screen;
    private final Keyboard keyboard;
    private final String name;
    private double totalWeight = 3525;

    public Computer(Processor processor, String vendor, Ram ram, Hdd hdd, Screen screen, Keyboard keyboard, String name) {
        this.processor = processor;
        this.vendor = vendor;
        this.ram = ram;
        this.hdd = hdd;
        this.screen = screen;
        this.keyboard = keyboard;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Характеристики ПК" + "\n" +
                "Процессор: " + processor + vendor + "\n" +
                "Тип оперативной памяти: " + ram + "\n" +
                "Тип жесткого диска: " + hdd + "\n" +
                "Монитор: " + screen + "\n" +
                "Клавиатура: " + keyboard + "\n" +
                "Название: " + name + "\n" +
                "Вес: " + totalWeight;
    }
}