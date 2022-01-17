public class Transport {
    int power;
    int speed;
    int weight;
    String model;

    public Transport(int power, int speed, int weight, String model) {
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.model = model;
    }

    public void printInformation(){
        double powerV;
        powerV = (double) power * 0.74;
        System.out.print("Мощность-" + power + " л.с, " + "мощность-" + powerV + " кВ, " + "максимальная скорость-" + speed + " км/ч, " +
                "масса-" + weight + " кг, " + "марка-" + model + ", ");
    }
}
