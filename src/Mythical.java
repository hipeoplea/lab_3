import java.sql.PreparedStatement;
import java.util.Objects;

public class Mythical extends Creature implements MythicalInterface {

    public Mythical(String name, int height, String position) {
        super(name, height, position);
    }

    @Override
    public String toString() {
        return "Мифическое существо " + super.getName()
                + " ростом " + super.getHeight()
                + " текущее местоположение: " + super.getPosition();
    }

    @Override
    public boolean equals(Mythical obj) {
        return (super.getName().equals( obj.getName())) && (super.getHeight() == obj.getHeight());
    }

    @Override
    public int hashCode() {
        int result = super.getName().hashCode();
        result = 31 * result + (super.getHeight());
        return result;
    }

}
