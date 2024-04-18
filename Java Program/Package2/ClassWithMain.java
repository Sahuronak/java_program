package Package2;
import Package1.*;
class ClassWithMain {
    public static void main(String[] args) {
       System.out.println("Here we are displaying value of two variable which are private: "); 
       ClassWithoutMain12 cl= new ClassWithoutMain12();
       cl.setDisplay(5, 2);
       System.out.println(" this is display function.");
       cl.displayFunction();
    }
}
