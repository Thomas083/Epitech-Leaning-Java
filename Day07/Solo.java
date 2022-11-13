public class Solo<S> {
    private S value;

    public S getValue() {
        return value;
    }

    public void setValue(S value) {
        this.value = value;
    }

    public Solo(S value) {
        this.value = value;
    }
}