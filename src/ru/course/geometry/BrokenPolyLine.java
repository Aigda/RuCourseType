package ru.course.geometry;

public class BrokenPolyLine extends PolyLine{

    public BrokenPolyLine(Point... points) {
        super(points);
    }

    @Override
    public double length()
    {
        double sum = 0, len1, len2;
        for (int i = 0; i < points.length - 1; i++) {
            len1 = points[i].x - points[i + 1].x;
            len2 = points[i].y - points[i + 1].y;
            sum += Math.sqrt(len1 * len1 + len2 * len2);

        }
        len1 = points[1].x - points[points.length-1].x;
        len2 = points[1].y - points[points.length-1].y;
        sum += Math.sqrt(len1 * len1 + len2 * len2);
        return sum;
    }

}

