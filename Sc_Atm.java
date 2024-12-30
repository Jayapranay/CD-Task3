class ATM{
public synchronized void checkBalance(String name){
    System.out.println(name+" is checking balance ");}
    public synchronized void withdraw(String name, int amount){
        System.out.println(name+" is withdrawing "+amount+"/-");
}}
class Customer extends Thread{
    ATM at;
    public String name;
    public int balance;
    public Customer(ATM atm, String nm, int bal){
     at=atm;
     name=nm;
     balance=bal;
}
public void useAtm(){
    System.out.println(name+" is checking balance");
    System.out.println(name+" is withdrawing "+balance+"/-");
}
@Override
public void run() {
     useAtm();
}
}
public class Sc_Atm {
    public static void main(String[] args) {
        ATM a=new ATM();
        Customer c1=new Customer(a,"jay",1000);
        Customer c2=new Customer(a,"vijay",2000);
       
        c1.start();
        c2.start();
     

    }
}
