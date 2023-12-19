public enum Places {
    House("Дом"),
    KarlsonHouse("Домик Карлсона"),
    Roof("Крыша"),
    Window("Окно"),
    Tube("Труба"),
    RoofHouse("Домик на крыше");

    private final String title;
    Places(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
