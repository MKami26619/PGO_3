public class ZAD_1 {
        private String model;
        private int liczbaMiejsc;

        public Samolot(String model, int liczbaMiejsc) {
            this.model = model;
            this.liczbaMiejsc = liczbaMiejsc;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getLiczbaMiejsc() {
            return liczbaMiejsc;
        }

        public void setLiczbaMiejsc(int liczbaMiejsc) {
            this.liczbaMiejsc = liczbaMiejsc;
        }
    }

}
