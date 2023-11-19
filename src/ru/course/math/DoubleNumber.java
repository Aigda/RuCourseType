package ru.course.math;

public class DoubleNumber extends Number implements ISumable {

    double d;

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public DoubleNumber(double d) {
        this.d = d;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return this.d;
    }



    @Override
    public DoubleNumber sum(int i) {

        DoubleNumber doubleNumber = new DoubleNumber(0);
        doubleNumber.setD((this.doubleValue() + (double) i));
        return doubleNumber;
    }

    @Override
    public DoubleNumber sum(Fraction fraction) {
        DoubleNumber doubleNumber = new DoubleNumber(0);
        doubleNumber.setD(this.doubleValue() + fraction.doubleValue());
        return doubleNumber;
    }

    @Override
    public DoubleNumber sum(DoubleNumber dNumber) {
        DoubleNumber doubleNumber = new DoubleNumber(0);
        doubleNumber.setD(this.doubleValue() + dNumber.doubleValue());
        return doubleNumber;
    }


    public DoubleNumber sum(IntegerNumber i2) {
        DoubleNumber doubleNumber = new DoubleNumber(0);
        doubleNumber.setD(this.doubleValue() + i2.doubleValue());
        return doubleNumber;
    }

    @Override
    public String toString() {
        return "DoubleNumber{" +
                "d=" + d +
                '}';
    }
}
