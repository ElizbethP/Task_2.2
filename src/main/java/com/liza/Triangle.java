package com.liza;

public class Triangle implements ITriangle {

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


    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideA;
    }

    public Triangle(int sideA) {
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideA;
    }


    @Override
    public boolean exists() {
        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideC + sideB > sideA)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getTriangleRatio() {
        if (exists() == true) {
            if ((sideA == sideB) && (sideB == sideC)) {
                return TYPE_EQUILATERAL;
            } else if ((((sideA == sideB) && (sideA != sideC)) || ((sideC == sideB)
                    && (sideC != sideA)) || ((sideA == sideC) && (sideA != sideB)))) {
                return TYPE_ISOSCELES;
            } else {
                return TYPE_USUAL;
            }
        } else {
            return -1;
        }
    }


    @Override
    public float calcArea() {
        int p = (sideA + sideC + sideB) / 2;
        return exists() == true ? (float) Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)) : -1;
    }

    @Override
    public float calcPerimeter() {

        return exists() == true ? sideA + sideB + sideC : -1;
    }


    @Override
    public float[] getSides() {
        return new float[]{sideA, sideB, sideC};
    }
}
