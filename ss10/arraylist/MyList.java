public class MyList {
    int size = 0;
    Object[] elements;

    public MyList() {
        elements = new Object[5];
    }

    public void add(Object e) {
        if (size == elements.length) {

            Object[] newArr = new Object[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newArr[i] = elements[i];
            }
            elements = newArr;
        }

        elements[size] = e;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index lỗi");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        size--;
    }

    public int size() {
        return size;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}