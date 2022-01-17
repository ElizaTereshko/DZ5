public class Land extends Transport{
    int countWheel;
    int fuel;

    public Land(int power, int speed, int weight, String model, int countWheel, int fuel) {
        super(power, speed, weight, model);
        this.countWheel = countWheel;
        this.fuel = fuel;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.print("количество колес-" + countWheel + " , " + "расход топлива-" + fuel + " л/100км, ");
    }
}
