package ru.umkonline.geometricfigures;


public class GeometricFigures {
    public static void main(String[] args) {
        System.out.println("Project Geomerticfigures");

        Rectangle rectan = new Rectangle(5,5,10,15);
        Circle circ = new Circle(7,7,12);

        System.out.println("Perimeter of rectangle: " + rectan.getPerimeter() + ", area of rectangle: " + rectan.getArea());
        System.out.println("Perimeter of circle: " + circ.getPerimeter() + ", area of circle: " + circ.getArea());
        rectan.drawOnScreen(2.5f);
        rectan.drawOnScreen(0, "black", "white");

        Figure figure = new Rectangle(5,5,10,15);

        System.out.println(figure.getPerimeter());


        System.out.println("work with square: ");

        Square square = new Square(5,5,3);
        System.out.println("Perimeter of square: " + square.getPerimeter() + ", area of square: " + square.getArea());

    }
}
