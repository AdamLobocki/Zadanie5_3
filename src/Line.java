import java.lang.Math;
public class Line {


    Point p;
    Point k;

    double lenght;

    String name;

    public Line(Point p, Point k) {
        this.p = p;
        this.k = k;
    }

    double math(){
      lenght = (k.x - p.x)*(k.x - p.x) + (k.y - p.y)*(k.y - p.y);
      lenght = Math.sqrt(lenght);
      return lenght;
    }




}
