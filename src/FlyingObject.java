public class FlyingObject implements FlyingInterface{
    final private String name;
    private boolean isSpy;
    MessageInteface message;
    FlyingObject(String name, boolean isspy){
        this.name = name;
        this.isSpy = isspy;
        this.message = new MessageHandler();
    }

    @Override
    public void fly(Places Position){
        message.printMessage(Position.toString());
    }

    private void changeSpy(){
        isSpy = !(isSpy);
        message.printMessage(String.valueOf(isSpy));
    }

    public boolean getIsSpy(){
        return isSpy;
    }

    public String getName(){
        return name;
    }
}
