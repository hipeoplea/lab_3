public class Plane extends FlyingObject {
    Engine enjinemodel;


    public Plane(String name, String enjinemodel) {
        super(name, false);
        this.enjinemodel = new Engine(enjinemodel);
    }

    public class Engine {
        public final String model;
        boolean properly;

        public Engine(String model) {
            this.model = model;
            this.properly = true;
        }

        public void changeProperly() {
            properly = !properly;
        }
        public boolean isProperly(){
            return properly;
        }

        public String getModel() {
            return model;
        }

    }
}
