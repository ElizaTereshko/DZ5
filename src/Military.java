public class Military extends Air{
    boolean catapult;
    int rocket;

    public Military(int power, int speed, int weight, String model, int wing, int length, boolean catapult, int rocket) {
        super(power, speed, weight, model, wing, length);
        this.catapult = catapult;
        this.rocket = rocket;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.print(", наличие cистемы катапультирования- " + catapult + ", количество ракет на борту- " + rocket);
    }

    public void shot(){
        if (rocket != 0) {
            System.out.println("\n" + "Ракета пошла...");
        }
        else System.out.println("\n" + "Боеприпасы отсутсвуют");
    }

    public void katapulta(){
        if (catapult == false) {
            System.out.println("У вас нет такой системы");
        }
        else System.out.println("Катапультирование произошло успешно");
    }
}
