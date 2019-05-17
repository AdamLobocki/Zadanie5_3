public class Compare {


    Line comp(Line line1, Line line2) {

        line1.lenght = (line1.k.x - line1.p.x) * (line1.k.x - line1.p.x) + (line1.k.y - line1.p.y) * (line1.k.y - line1.p.y);
        line1.lenght = Math.sqrt(line1.lenght);

        line2.lenght = (line2.k.x - line2.p.x) * (line2.k.x - line2.p.x) + (line2.k.y - line2.p.y) * (line2.k.y - line2.p.y);
        line2.lenght = Math.sqrt(line2.lenght);


        if (line1.lenght > line2.lenght) {

            return line1;
        } else
            return line2;

    }


}
