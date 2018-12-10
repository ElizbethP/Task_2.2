package com.liza;

public interface ITriangle extends I2dGeometricFigure {
    boolean exists();

    int getTriangleRatio();

    int TYPE_USUAL = 0;//обычный
    int TYPE_ISOSCELES = 1;//равнобедренный
    int TYPE_EQUILATERAL = 2;//равносторонний

}
