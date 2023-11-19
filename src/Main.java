import ru.course.geometry.*;
import ru.course.math.*;

public class Main {
    public static void main(String[] args) {


        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);
        Point p3 = new Point(3,1);
        PolyLine polyLine = new PolyLine(p1,p2,p3);
        BrokenPolyLine brokenPolyLine = new BrokenPolyLine(p1,p2,p3);

        System.out.println(polyLine.length());
        System.out.println(brokenPolyLine.length());

        IntegerNumber i1 = new IntegerNumber(2);
        Fraction f1 = new Fraction(3,5);
        DoubleNumber d1 = new DoubleNumber(2.3);
        System.out.println(" " + i1.sum(f1).sum(d1));

        DoubleNumber d2 = new DoubleNumber(3.6);
        Fraction f2 = new Fraction(49,12);
        IntegerNumber i2 = new IntegerNumber(3);
        Fraction f2_2 = new Fraction(3,2);
        System.out.println(" " + d2.sum(f2).sum(i2).sum(f2_2));


        Fraction f3 = new Fraction(1,3);
        IntegerNumber i3 = new IntegerNumber(1);
        System.out.println(" " + f3.sum(i3));




    }
}