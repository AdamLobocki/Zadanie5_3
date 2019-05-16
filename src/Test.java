public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(3);
        Point point2 = new Point(23);
        Point point3 = new Point(54);
        Line line1 = new Line();
        Line line2 = new Line();
        line1.x = point1.a;
        line1.y = point2.a;
        line1.math();
        line1.name = "pierwszego";
        line2.x = point1.a;
        line2.y = point3.a;
        line2.math();
        line2.name = "drugiego";



        Compare compare =new Compare();

        compare.comp(line1, line2);






    }
}
