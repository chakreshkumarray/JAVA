package Topic2_GenericClass.Solution;

public class Counter<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
