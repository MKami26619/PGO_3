import java.util.Scanner;

public class ZAD_1_SAMOLOT {
    private final String model;
    private final int numberOfSeats;

    public ZAD_1_SAMOLOT(String model, int numberOfSeats) {
        this.model = model;
        this.numberOfSeats = numberOfSeats;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj model samolotu: ");
        String model = scanner.nextLine();
        System.out.print("Podaj ilość miejsc w samolocie: ");
        int numberOfSeats = scanner.nextInt();

        ZAD_1_SAMOLOT airplane = new ZAD_1_SAMOLOT(model, numberOfSeats);
        System.out.println("Model samolotu: " + airplane.getModel());
        System.out.println("Ilość miejsc w samolocie: " + airplane.getNumberOfSeats());
    }
}
