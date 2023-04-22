public class ZAD_2_SAMOLOT {
    private final String model;
    private final int numberOfSeats;
    private final Engine engine;

    public ZAD_2_SAMOLOT(String model, int numberOfSeats, Engine engine) {
        this.model = model;
        this.numberOfSeats = numberOfSeats;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getEngineHorsePowers() {
        return engine.getHorsePowers();
    }

    public int getEngineProductionYear() {
        return engine.getProductionYear();
    }

    public boolean isEngineEcological() {
        return engine.getHorsePowers() <= 20000 && engine.getProductionYear() > 2000;
    }

    public static void main(String[] args) {
        Engine engine = new Engine(10000, 2022);
        ZAD_2_SAMOLOT samolot = new ZAD_2_SAMOLOT("Boeing 747", 416, engine);

        System.out.println("Model samolotu: " + samolot.getModel());
        System.out.println("Liczba miejsc w samolocie: " + samolot.getNumberOfSeats());
        System.out.println("Moc silnika: " + samolot.getEngineHorsePowers() + " KM");
        System.out.println("Rok produkcji silnika: " + samolot.getEngineProductionYear());
        System.out.println("Czy silnik jest ekologiczny? " + samolot.isEngineEcological());
    }
}

class Engine {
    private final int horsePowers;
    private final int productionYear;

    public Engine(int horsePowers, int productionYear) {
        this.horsePowers = horsePowers;
        this.productionYear = productionYear;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public int getProductionYear() {
        return productionYear;
    }
}
