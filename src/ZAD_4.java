public class ZAD_4 {
    private String model;
    private int numberOfSeats;
    private Engine engine;

    public ZAD_4(String model, int numberOfSeats, Engine engine) {
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

    private static class Engine {
        private int horsePowers;
        private int productionYear;

        public Engine(int horsePowers, int productionYear) {
            this.horsePowers = horsePowers;
            this.productionYear = productionYear;
        }

        public int getHorsePowers() {
            return horsePowers;
        }

        public void setHorsePowers(int horsePowers) {
            this.horsePowers = horsePowers;
        }

        public int getProductionYear() {
            return productionYear;
        }

        public void setProductionYear(int productionYear) {
            this.productionYear = productionYear;
        }
    }
}
