    public class Encaptulation_Constructors {
        // It's defined as wrapping up of data under a single unit or use to hiding a data
        // _____________
        // |Data |method|
        // |_____|______|
        public static void main(String args[]){
            Student s1 = new Student();
        }
    }

    class Student{
        private String name;
        // parameterized constructor
        Student(String name){
            this.name = name;
            System.err.println("User's name is " + name);
        }

    //Non parameterized constructor
        Student() {
            System.err.println("Constructor is called...");
        }
        
    }
