public class Main {
    public static void main(String[] args) {
        Passenger Car = new Passenger(200, 240, 1200, "Honda", 4, 13, "купе", 4);
        Car.printInformation();
        Car.print();
        Truck Car1 = new Truck(420, 120, 25000, "МАЗ", 10, 40, 10);
        Car1.printInformation();
        Car1.cargo();
        Military Car2 = new Military(1000,2600, 25000, "Истребитель Су-27", 15, 650, false, 0);
        Car2.printInformation();
        Car2.shot();
        Car2.katapulta();
        Civil Car3 = new Civil(800, 2000, 20000, "MC-27", 36, 300, 150, true);
        Car3.printInformation();
        Car3.content();
    }
}
