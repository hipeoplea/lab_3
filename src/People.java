public class People extends Creature implements PeopleInterface {

    public People(String name, int height) {
        super(name, height, Places.House);
    }

    @Override
    public void say(String message) {
        System.out.println(this.getName() + " сказал " + message);
    }

    @Override
    public void hear(String message) {
        System.out.println(this.getName() + " услышал " + message);
    }

    @Override
    public void climb(Places place) {
        changePosition(place);
    }

    @Override
    public void show(String message) {
        System.out.println(this.getName() + " показал " + message);
    }

    @Override
    public void see(String message) {
        System.out.println(this.getName() + " увидел " + message);
    }

    @Override
    public void keepSilence(Creature creature) {
        System.out.println(this.getName() + " не рассказал о " + creature.getName());
    }

    @Override
    public String toString() {
        return "Человек " + super.getName()
                + " ростом " + super.getHeight()
                + " текущее местоположение: " + super.getPosition();
    }

    @Override
    public boolean equals(People o) {
        return (super.getName().equals( o.getName())) && (super.getHeight() == o.getHeight());
    }

    @Override
    public int hashCode() {
        int result = super.getName().hashCode();
        result = 31 * result + (super.getHeight());
        return result;
    }

    public void article(MassMedia media, String title, Creature creature, String text) {
        System.out.println(media + "\n" + title + " " + creature.getName() + "\n" + text + "\n" + "от " + this.getName());
    }

}
