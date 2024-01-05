package Geometric_package;

import java.util.ArrayList;
import java.util.List;

public class Shape_Testing {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(12, 45);
        Rectangle rectangle2 = new Rectangle(12, 45);
        Triangle triangle1 = new Triangle(30, 40, "Programming is fun", "Iron");
        Triangle triangle2 = new Triangle(30, 40, "Energy = milk * coffee squared", "Wood");
        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(triangle1.equals(triangle2));
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(triangle1);
        System.out.println(triangle2);
        System.out.println(rectangle1.getSize());
        System.out.println(rectangle2.getSize());
        System.out.println(triangle1.getSize());
        System.out.println(triangle2.getSize());
        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle1);
        shapes.add(rectangle2);
        shapes.add(triangle1);
        shapes.add(triangle2);
        for(int i=0;i<shapes.size();i++){
            System.out.println(shapes.get(i));
            System.out.println(shapes.get(i).getSize());
            if(shapes.get(i) instanceof Triangle){
                Triangle triangle = (Triangle) shapes.get(i);
                triangle.displayTriangleHeight();
            }
            else if(shapes.get(i) instanceof Rectangle){
                Rectangle rectangle = (Rectangle) shapes.get(i);
                rectangle.displayRectangleHeigth();
            }
            else{
                System.out.println("Tip obiect necunoscut");
            }
        }
    }
}
//operatorul instanceof verifica daca un obiect apartine unei anumite clase.
//este folosit doar pentru downcasting