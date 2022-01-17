import java.util.Scanner;

public class Passenger extends Land{
    String body;
    int countPass;

    public Passenger(int power, int speed, int weight, String model, int countWheel, int fuel, String body, int countPass) {
        super(power, speed, weight, model, countWheel, fuel);
        this.body = body;
        this.countPass = countPass;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.print("тип кузова-" + body + " , " + "количество пассажиров-" + countPass);
    }

    int s;
    int t;

    public void rezult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "Введите время пути, ч:");
        t = scanner.nextInt();
        s = speed * t;
    }

    private void top(){
        fuel = fuel * s / 100;
    }

    public void print () {
        rezult();
        top();
        System.out.println("За время " + t + " ч автомобиль " + model + ", двигаясь с максимальной скоростью " + speed + "км/ч проедет " +
                s + "км и израсходует " + fuel + " литров топлива.");
    }
}
