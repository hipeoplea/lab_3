public abstract class Creature implements CreatureInterface{
    private final String name;
    private final int height;
    private Places position;
    public Creature(String name, int height, Places position){
        this.name = name;
        this.height = height;
        this.position = position;
    }

    public String getName(){
        return name;
    }
    public int getHeight() {
        return height;
    }

    public Places getPosition() {
        return position;
    }
    @Override
    public void changePosition(Places newPosition){
        System.out.println(this.name + " переместился из " +this.position + " в " + newPosition.toString());
        this.position = newPosition;
    }
}
