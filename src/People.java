import java.util.Objects;

public class People extends Creature implements PeopleInterface {
    public Boolean KnowsSecret;
    public MessageInteface mess;

    public People(String name, int height) {
        super(name, height, Places.House);
        this.mess = new MessageHandler();
        this.KnowsSecret = false;
    }

    public People(String name, int height, Boolean Secret){
        this(name, height);
        this.KnowsSecret = Secret;
    }

    public  void saySecret(People o){
        o.changeNew();

    }

    private void changeNew(){
        KnowsSecret = true;
    }
    @Override
    public void say(String message) {
        mess.printMessage(this.getName() + " сказал " + message);
    }

    @Override
    public void hear(String message) {
        mess.printMessage(this.getName() + " услышал " + message);
    }

    @Override
    public void climb(Places place) {
        changePosition(place);
    }

    @Override
    public void show(String message) {
        mess.printMessage(this.getName() + " показал " + message);
    }

    @Override
    public void see(Object message) {
        mess.printMessage(this.getName() + " увидел " + message.toString());
    }

    @Override
    public void keepSilence(Creature creature) {
        mess.printMessage(this.getName() + " не рассказал о " + creature.getName());
    }

    @Override
    public String toString() {
        return "Человек " + super.getName()
                + " ростом " + super.getHeight()
                + " текущее местоположение: " + super.getPosition();
    }



    @Override
    public int hashCode() {
        int result = super.getName().hashCode();
        result = 31 * result + (super.getHeight());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        People other = (People) obj;
        return Objects.equals(getName(), other.getName());
    }

    public void article(MassMedia media, String title, Creature creature, String text) {
        mess.printMessage(media + "\n" + title + " " + creature.getName() + "\n" + text + "\n" + "от " + this.getName());
    }

}
