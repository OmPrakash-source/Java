public class polymorprism {
    public static void main(String[] args) {
        // Calculator cal = new Calculator();
        // System.out.println(cal.sum((float)34.34,34));

        Deer deer = new Deer();
        deer.eat();
    }
}
// parameter overloading (Static Polymorphism)
// class Calculator{
//     int sum(int n1, int n2){
//         return n1+n2;
//     }
//     float sum(float n1, float n2){
//         return n1+n2;
//     }
//     float sum(float n1, float n2, float n3){
//         return n1+n2+n3;
//     }
// }

// Parent and child class both contain the same function with a different definition.
// use in INHARETENCE where child class override a property of parent class by using a same parameter or function with same name 

class Animal_1{
    void eat(){
        System.out.println("eat anything ...");
    }
}
class Deer extends Animal_1{
    void eat(){
        System.err.println("eat only grass!!!!");
    }
}