import java.util.*;
public class geter_seter {
    public static void main(String args[]){
        // Animal1 a1 = new Animal1();
        // a1.geter(18,"@ge2131#f", "Hrithik");
        // a1.seter();

        copyConstructor c1 = new copyConstructor("Harit");
        copyConstructor c2 = new copyConstructor(c1);
        // c2.age("Rohit");
    }
}
class Animal1{
    private int age;
    private String pass;
    public String name;
    void geter(int age, String pass, String name){
        this.age = age;
        this.pass = pass;
        this.name = name;
    }
    void seter(){
        System.out.println("This is age of " + age + " of there name is '"+ name +"'\n That use a password of "+ pass);
    }
}

class copyConstructor{
    String name;
    float age;
    copyConstructor(String name){
        this.name = name;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Your age ? ");
            age = sc.nextInt();
        }
    }

    copyConstructor(copyConstructor S1){
        this.name = S1.name;
        this.age = S1.age;
        System.out.print(name + " and " + age);
    }
    
}
