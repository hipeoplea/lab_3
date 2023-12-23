import java.sql.PreparedStatement;
import java.util.Objects;

public class Mythical extends Creature {

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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Mythical other = (Mythical) obj;
        return Objects.equals(getName(),  other.getName());
    }

    @Override
    public int hashCode() {
        int result = super.getName().hashCode();
        result = 31 * result + (super.getHeight());
        return result;
    }

}
