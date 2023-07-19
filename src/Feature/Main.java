package Feature;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(Processor.IntelCore, " i5 11400", Ram.DDR5, Hdd.SSD, Screen.Huawei, Keyboard.A4TECH, "iRU Home 310H5SE");
        DetailsProcessor detailsProcessor = new DetailsProcessor(3.4, 8, "AMD");
        DetailsRam detailsRam = new DetailsRam(16);
        DetailsHdd detailsHdd = new DetailsHdd(2);
        DetailsScreen detailsScreen = new DetailsScreen("1920x1080");
        DetailsKeyboard detailsKeyboard = new DetailsKeyboard("Встроено");
        System.out.println(computer);
        System.out.println(detailsProcessor);
        System.out.println(detailsRam + " Гб");
        System.out.println(detailsHdd + " Тб");
        System.out.println(detailsScreen);
        System.out.println(detailsKeyboard);
    }
}