package Topic3_GenericInterFace.SpecificType;

public class StringContainer implements Container2<String> {

    private String item;

    @Override
    public void add(String item) {
        this.item = item;
    }

    @Override
    public String get() {
        return item;
    }
}
