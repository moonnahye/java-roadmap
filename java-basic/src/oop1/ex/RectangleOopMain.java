package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 8;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        System.out.println("넚이 :"+ area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이 : "+ perimeter);

        boolean squere = rectangle.isSquare();
        System.out.println("정사각형 여부: "+squere);
    }
}
