public class copyConstructor_demo {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Hritik");
        s1.password = "@3dsf2weda";
        s1.roll = 12321;
        Student1 s2 = new Student1(s1.toString());
        s2.roll = 2222;
    }
}
class Student1{
    int roll;
    String name;
    String password;

    // this is a copy constructor
    Student1(Student1 s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
    }
    Student1(String name){
        this.name = name;  
        System.out.println(name);
        System.out.println(roll);
        System.out.println(password);
    }
}
