package com.pluralsight.design_patterns.structural.bridge.shape;

public class BridgeDemo {

    public static void main(String[] args) {
        Color blue = new Blue();
        Shape square = new Square(blue);
        Color red = new Red();
        Shape circle = new Circle(red);
        Color yellow = new Yellow();
        Shape squareYellow = new Square(yellow);

        square.applyColor();
        circle.applyColor();
        squareYellow.applyColor();
    }
}
