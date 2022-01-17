import java.util.Scanner;

public class Truck extends Land{
    int carrying;

    public Truck(int power, int speed, int weight, String model, int countWheel, int fuel, int carrying) {
        super(power, speed, weight, model, countWheel, fuel);
        this.carrying = carrying;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.print("грузоподъёмность-" + carrying + " т");
    }

    public void cargo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "Введите количество груза, т:");
        int t = scanner.nextInt();
        if(t <= carrying) {
            System.out.println("Грузовик загружен");
        }
        else System.out.println("Вам нужен грузовик побольше");
    }
}
