public class Drone extends FlyingObject {
    boolean exists;
    boolean init;
    static MessageInteface message;

    Drone(String name) {
        super(name, true);
        message = new MessageHandler();
        init = false;
    }

    public static class Enjine {
        private final int model;

        public Enjine(int model) {
            this.model = model;
        }

        public void getModel() {
            message.printMessage("Model=" + model);
        }

    }

    public void changeExists(boolean value) {
        exists = value;
        init = true;
    }

    public boolean getExists() throws DontKnowExeption {
        if (!init) {
            throw new DontKnowExeption(getName());
        }
        return exists;
    }

}
