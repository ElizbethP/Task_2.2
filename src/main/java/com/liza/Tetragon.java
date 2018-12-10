package com.liza;

public class Tetragon implements ITetragon {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public Tetragon(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public float calcArea() {

        float p = (a + b + c + d) / 2;
        float s = (float) Math.sqrt((p - a) * (p - b) * (p - c) * (p - d));
        return s;

    }

    @Override
    public float calcPerimeter() {

        return a + b + c + d;
    }

    @Override
    public float[] getSides() {
        return new float[]{a, b, c, d};
    }

    @Override
    public boolean areOppositeSidesEqual() {
        if ((a == c) && (b == d)) {
            return true;
        }
        return false;
    }
}
