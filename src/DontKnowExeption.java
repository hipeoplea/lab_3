public class DontKnowExeption extends Exception{
    private final String name;

    DontKnowExeption(String name){
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "It is unknown for " + name;
    }
}
