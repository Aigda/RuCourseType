package ru.course.math;

public class Fraction extends Number implements ISumable {
    private int num;
    private int denum;

    public Fraction(int num, int denum) {
        if(denum == 0) {
            throw new IllegalArgumentException("Нельзя делить на ноль");
        }
        if(denum < 0) {
            num *= -1;
            denum *= -1;
        }
        this.num = num;
        this.denum = denum;
    }

    public Fraction(int num) {
        this.num = num;
        this.denum = 1;
    }

/*
    public Fraction sum(final Fraction r)
    {
        return new Fraction(num * r.denum + denum * r.num, denum * r.denum);
    }

    public Fraction sum(int i)
    {
        return new Fraction(num * 1 + denum * i, denum * 1);
    }
*/

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

    //public Fraction sum(int i)
    //{
    //    return new Fraction(num * 1 + denum * i, denum * 1);
    //}

    public Fraction minus(final Fraction r)
    {
        return new Fraction(num * r.denum - denum * r.num, denum * r.denum);
    }

    public Fraction minus(int i)
    {
        return new Fraction(num * 1 - denum * i, denum * 1);
    }

    public String toString()
    {
        return num + "/" + denum;
    }
    public int getNum() {
        return this.num;
    }

    public int getDenum() {
        return this.denum;
    }

    public byte byteValue() {
        return (byte) this.doubleValue();
    }

    public double doubleValue() {
        return ((double) num)/((double) denum);
    }

    public float floatValue() {
        return (float) this.doubleValue();
    }

    public int intValue() {
        return (int) this.doubleValue();
    }

    public long longValue() {
        return (long) this.doubleValue();
    }

    public short shortValue() {
        return (short) this.doubleValue();
    }

    public boolean equals(Fraction frac) {
        return this.compareTo(frac) == 0;
    }

    public int compareTo(Fraction frac) {
        long t = this.getNum() * frac.getDenum();
        long f = frac.getNum() * this.getDenum();
        int result = 0;
        if(t>f) {
            result = 1;
        }
        else if(f>t) {
            result = -1;
        }
        return result;
    }

    public DoubleNumber sum(IntegerNumber i2) {
        DoubleNumber doubleNumber = new DoubleNumber(0);
        doubleNumber.setD(this.doubleValue() + i2.doubleValue());
        return doubleNumber;
    }
}