public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(3, 5);
        Point point2 = new Point(23, 12);
        Point point3 = new Point(54, 44);
        Line line1 = new Line(point1, point3);
        Line line2 = new Line(point1, point2);


        line1.name = "pierwszego";


        line2.name = "drugiego";


        Compare compare = new Compare();

       Line result = compare.comp(line1, line2);

        System.out.println("Długoć odcinka " + result.name + " = " + result.lenght + ". Zaczyna się w punkcie " +
                result.p.x + "x" + result.p.y + "y" + " a kończy w punkcie " + result.k.x + "x" + result.k.y + "y");


    }
}
