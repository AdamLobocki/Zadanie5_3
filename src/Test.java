public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(3, 5);
        Point point2 = new Point(23, 12);
        Point point3 = new Point(54, 44);
        Line line1 = new Line(point1, point3);
        Line line2 = new Line(point1, point2);


        line1.math();
        line1.name = "pierwszego";

        line2.math();
        line2.name = "drugiego";


        Compare compare = new Compare();

        compare.comp(line1, line2);


    }
}
