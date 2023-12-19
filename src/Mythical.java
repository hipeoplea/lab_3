import java.sql.PreparedStatement;
import java.util.Objects;

public class Mythical extends Creature implements MythicalIntarface {

    public Mythical(String name, int height, Places position) {
        super(name, height, position);
    }

    @Override
    public String toString() {
        return "Мифическое существо Mythical" + super.getName()
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
