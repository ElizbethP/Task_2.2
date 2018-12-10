package com.liza;

public class FigureFactory {
    public FigureFactory() {
    }

    public I2dGeometricFigure FigureFactory(int[] sides) {
        if (sides.length == 3) {


            for (int i = 0; i < sides.length; i++) {
                for (int j = 0; j < sides.length; j++) {
                    if (sides[i] < sides[j]) {
                        int buffer = sides[j];
                        sides[j] = sides[i];
                        sides[i] = buffer;
                    }
                }
            }
            if ((sides[0] == sides[1]) && (sides[1] == sides[2])) {
                return new Triangle(sides[0]);
            } else if ((((sides[0] == sides[1]) && (sides[0] != sides[2])) || ((sides[2] == sides[1])
                    && (sides[2] != sides[0])) || ((sides[0] == sides[2]) && (sides[0] != sides[1])))) {

                return new Triangle(sides[0], sides[2]);
            } else {
                return new Triangle(sides[0], sides[1], sides[2]);
            }

        } else if (sides.length == 4) {
            return new Tetragon(sides[0],sides[1],sides[2],sides[3]);
        } else return null;

    }

}





