public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.print();

        list.remove(1);

        list.print();

        System.out.println("Size: " + list.size());
    }
}