public class MultiThreadingClass {
    public static void main(String[] args) {
        Pro1 p1= new Pro1();
        Pro2 p2= new Pro2();
        Thread t1= new Thread(p1);
        Thread t2= new Thread(p2);
        t1.start();
        t2.start();
    }
}
class Pro1 implements Runnable{
    public void run(){
        System.out.println("This is run function 1: ");
        for(int i=0; i<10; i++){
            System.out.println("Process1: "+i);
        }
    }
   
}
class Pro2 implements Runnable{
    
    public void run(){
        System.out.println(" this is process 2 method:");
        for (int i=0; i<11; i++){
            System.out.println("Process2: "+i);
        }
    }
}
