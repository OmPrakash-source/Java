public class Acessspacifier {
    public static void main(String args[]){
    Bankaccount myAcc = new Bankaccount();
    myAcc.name = "My name";
    myAcc.setPass("abcde");
    myAcc.Account();
    }
}
class Bankaccount{
    public String name;
    private String password;
    public void setPass(String pwd){
        this.password = pwd;
    }

    void Account(){
        System.out.print(name + ", ");
        System.out.print(password);
    }
    
}