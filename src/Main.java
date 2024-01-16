public class Main {
    public static void main(String[] args) {
        People mother = new People("Мама", 170);
        People dad = new People("Мама", 170);
        People bose = new People("Боссе", 159);
        People betan = new People("Бетан", 159);
        People little = new People("Малыш", 130);
        Mythical flying = new Mythical("Карлсон", 100, Places.KarlsonHouse);

        System.out.println(mother.equals(dad));

        dad.keepSilence(flying);
        mother.keepSilence(flying);
        System.out.println('\n');

        mother.article(MassMedia.Radio, "Обнаружен", flying, "Какая-то фантастическая статья");
        dad.see(Places.KarlsonHouse.toString());
        betan.climb(Places.Roof);
        System.out.println(betan.getPosition());
        little.show(Places.RoofHouse.toString());



        // Lab 4
        Police police = new Police(){
                @Override
                public String givesObject(People o, Object a){
                    if (a.equals(flying)){
                        return "Пивной бочёнок найден" + o.toString();
                    }
                    return "Увы " + o.toString() + "передал нам неверный объект";
                }
        };

        

    }
}