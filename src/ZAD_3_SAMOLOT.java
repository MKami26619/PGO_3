public class ZAD_3_SAMOLOT {
    private String model;
    private int numberOfSeats;
    private Engine engine;

    public ZAD_3_SAMOLOT(String model, int numberOfSeats, Engine engine) {
        this.model = model;
        this.numberOfSeats = numberOfSeats;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getProductionYear() {
        return engine.getProductionYear();
    }

    public int getHorsePowers() {
        return engine.getHorsePowers();
    }

    public boolean isEcological() {
        return engine.getHorsePowers() <= 20000 && engine.getProductionYear() > 2000;
    }
}

