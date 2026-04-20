public class MyListTest {
    public static void main(String[] args) {
        MyList list = new MyList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.print();

        list.remove(1);

        list.print(); 

        System.out.println("Size: " + list.size());
    }
}