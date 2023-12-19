public class Main {
    public static void main(String[] args) {
        People mother = new People("Мама", 170);
        People dad = new People("Папа", 185);
        People bose = new People("Боссе", 159);
        People betan = new People("Бетан", 159);
        People little = new People("Малыш", 130);
        Mythical flying = new Mythical("Карлсон", 100, Places.KarlsonHouse);


        dad.keepSilence(flying);
        mother.keepSilence(flying);
        System.out.println('\n');

        mother.article(MassMedia.Radio, "Обнаружен", flying, "Какая-то фантастическая статья");
        dad.see(Places.KarlsonHouse.toString());
        betan.climb(Places.Roof);
        System.out.println(betan.getPosition());
        little.show(Places.RoofHouse.toString());
    }
}