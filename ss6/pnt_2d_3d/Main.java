public class Main {
    public static void main(String[] args) {

        Point2D p2 = new Point2D(2, 3);
        System.out.println(p2);

        float[] xy = p2.getXY();
        System.out.println("X = " + xy[0] + ", Y = " + xy[1]);

        System.out.println("-----------");

        Point3D p3 = new Point3D(1, 2, 3);
        System.out.println(p3);

        float[] xyz = p3.getXYZ();
        System.out.println("X = " + xyz[0] + ", Y = " + xyz[1] + ", Z = " + xyz[2]);
    }
}