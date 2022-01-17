public class Air extends Transport{
    int wing;
    int length;

    public Air(int power, int speed, int weight, String model, int wing, int length) {
        super(power, speed, weight, model);
        this.wing = wing;
        this.length = length;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.print("размах крыльев-" + wing + " м, " + "минимальная длина взлётно-посадочной полосы-" + length + " м ");
    }
}
