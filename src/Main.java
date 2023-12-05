public class Main {
    public static void main(String[] args) {
        People mother = new People("Мама", 170);
        People dad = new People("Папа", 185);
        People bose = new People("Боссе", 159);
        People betan = new People("Бетан", 159);
        People little = new People("Малыш", 130);
        Mythical flying = new Mythical("Карлсон", 100, "Домик на крыше");

        People sr = new People("Малыш", 130);
        System.out.println(sr.equals(little));
        System.out.println(sr.toString());
        System.out.println(sr.hashCode());

        dad.changePosition("Крыша");
        mother.make_new(Mass_media.Radio, "Обнаружен карлсон", "Какая-то фантастическая статья");
    }
}