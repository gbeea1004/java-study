package data_structure.collection;

public class ArrayList implements List {
    private static final int DEFAULT_VALUE = 10;
    private Object[] elementData;
    private int currentIndex;

    ArrayList() {
        this.elementData = new Object[DEFAULT_VALUE];
    }

    ArrayList(int size) {
        if (size == 0) {
            this.elementData = new Object[DEFAULT_VALUE];
        } else if (size > 0) {
            this.elementData = new Object[size];
        } else {
            throw new IllegalArgumentException("size 값은 0 이상이어야 합니다.");
        }
    }

    @Override
    public void add(Object object) {
        elementData[currentIndex++] = object;
    }

    @Override
    public Object get(int index) {
        return elementData[index];
    }
}
