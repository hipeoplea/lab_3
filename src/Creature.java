public abstract class Creature implements CreatureInterface{
    private final String name;
    private final int height;
    private String position;
    public Creature(String name, int height, String position){
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

    public String getPosition() {
        return position;
    }
    @Override
    public void changePosition(String newPosition){
        System.out.println(this.name + " переместился из " +this.position + " в " + newPosition);
        this.position = newPosition;
    }
}
