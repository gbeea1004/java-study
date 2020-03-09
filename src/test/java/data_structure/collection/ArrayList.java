package data_structure.collection;

import java.util.Arrays;

public class ArrayList implements List {
    private static final int DEFAULT_VALUE = 10;
    private Object[] elementData;
    private int size;

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

    private void rangeCheckForSize() {
        if (size == elementData.length) {
            elementData = Arrays.copyOf(elementData, size() * 2);
        }
    }

    private void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("범위를 정확히 입력하세요.");
        }
    }

    @Override
    public void add(Object object) {
        rangeCheckForSize();
        elementData[size++] = object;
    }

    @Override
    public void add(int index, Object element) {
        rangeCheckForAdd(index);

        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
    }

    @Override
    public Object get(int index) {
        return elementData[index];
    }

    @Override
    public int size() {
        return size;
    }
}
