class ThreadClass{
    public static void main(String[] args) {
        Process1 p1= new Process1();
        Process2 p2= new Process2();
        p1.start();
        p2.start();
    }
}
class Process1 extends Thread{
    public void run(){
        System.out.println("This is run function 1: ");
        for(int i=0; i<10; i++){
            System.out.println("Process1: "+i);
        }
    }
   
}
class Process2 extends Thread{
    
    public void run(){
        System.out.println(" this is process 2 method:");
        for (int i=0; i<11; i++){
            System.out.println("Process2: "+i);
        }
    }
}
