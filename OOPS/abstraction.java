
// can't implement object of abstract class
// it is a process to hiding a implementation process and 
// show only the essential feature
public class abstraction {
    public static void main(String[] args) {
        // Shape shape = new Shape(); // can't create like this because of abstraction
        Circle circle = new Circle(5);
        System.out.println("Circle " + circle.area());


        Triangle triangle = new Triangle(2,3);
        System.out.println("Triangle " + triangle.area());

        Rectangle rectangle = new Rectangle(2 , 3);
        System.out.println("Rectangle " + rectangle.area());
    }
}
abstract class Shape{
    abstract double area(); // this is abstract function 
    // So all class that extands this class will comparsaly to use this this function
}
class Circle extends Shape{
    double r;
    Circle(double r){
        this.r = r;
    }
    @Override
    double area(){
        return Math.PI * r * r;
    }
}
class Triangle extends Shape{

    int height;
    int base;
    Triangle(int l, int w){
        height = l;
        base = w;
    }
    @Override
    double area(){
        return 0.5 * height * base;
    }
}
class Rectangle extends Shape{
    int length;
    int width;

    Rectangle(int l, int w){
        length = l;
        width = w;
    }
    double area(){ // can't impact @Override it use for understanding
        return 2 * (length * width);
    }

}