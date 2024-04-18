import java.util.Scanner;

public class MultiThreadAccount {
    public static void main(String[] args) {
        System.out.println("Enter your withdraw amount");
        Account a1= new Account(10000);
        Customer c1= new Customer(a1, "Sakshi");
        Customer c2= new Customer(a1, "Ronak");
        Thread t1= new Thread(c1);
        Thread t2= new Thread(c2);
        t1.start();
        t2.start();
    }
}

class Account{
    int balance;
    Account(int b){
        balance=b;
    }
    public boolean inSufficient(int wd){
        if(balance> wd){
            System.out.println("Balance is greater amount");
            return true;
        }else{
            System.out.println("Balance is in less amount");
            return false;
        }
    }
    public void withDrawal(int wd){
        balance=balance-wd;
        System.out.println("Current Balance: "+balance);

    }
}

class Customer implements Runnable{
    Account h1;
    String name;
    Customer(Account g1, String s1){
        h1=g1;
        name=s1;

    }
    public void run(){
        Scanner sc= new Scanner(System.in);
        synchronized(h1){
        int amount= sc.nextInt();
        if(h1.inSufficient(amount)){
            System.out.println("Amount is withdraw");
            h1.withDrawal(amount);
        }else{
            System.out.println(name+ "InSufficient Balance");
        }
    }

    }

}
