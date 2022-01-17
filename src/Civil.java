import java.util.Scanner;

public class Civil extends Air {
    int countPass;
    boolean business;

    public Civil(int power, int speed, int weight, String model, int wing, int length, int countPass, boolean business) {
        super(power, speed, weight, model, wing, length);
        this.countPass = countPass;
        this.business = business;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.print(", количество пассажиров-" + countPass + ", наличие бизнес-класса- " + business);
    }

    public void content(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "Введите количество пассажиров:");
        int t = scanner.nextInt();
        if(t <= countPass) {
            System.out.println("Самолёт загружен");
        }
        else System.out.println("Вам нужен самолёт побольше");
    }
}
