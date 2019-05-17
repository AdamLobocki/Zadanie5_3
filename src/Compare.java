public class Compare {

    double lenght1;
    double lenght2;
    double longer;
    Line comp(Line line1, Line line2) {


        lenght1 = (line1.k.x - line1.p.x) * (line1.k.x - line1.p.x) + (line1.k.y - line1.p.y) * (line1.k.y - line1.p.y);
        lenght1 = Math.sqrt(lenght1);

        lenght2 = (line2.k.x - line2.p.x) * (line2.k.x - line2.p.x) + (line2.k.y - line2.p.y) * (line2.k.y - line2.p.y);
        lenght2 = Math.sqrt(lenght2);


        if (lenght1 > lenght2) {
            longer = lenght1;
            return line1;
        } else
            longer = lenght2;
            return line2;

    }


}
