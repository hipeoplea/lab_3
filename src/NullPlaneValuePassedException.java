public class NullPlaneValuePassedException extends RuntimeException {
    private final int Planeindex;
    public NullPlaneValuePassedException(int index) {
        this.Planeindex = index;
    }

    @Override
    public String getMessage() {
        return "Ошибка: под индексом \"%s\" передается Plane со значением null!".formatted(Planeindex);
    }
}
