import java.util.Scanner;
public class temp {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        Temp1 t1 = new Temp1(123, sc);
        int x = t1.seter();
        System.out.print(x);

        sc.close();
    }
}
class Temp1{
    private int pass;
    String s;
    Temp1(int p, Scanner sc){
        this.pass = p;
        System.out.print("Enter User Name: ");
        s = sc.nextLine();
    }
    int seter(){
        System.out.println(s);
        return pass;
    }
}
