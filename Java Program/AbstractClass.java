public class AbstractClass {
    public static void main(String[] args) {
        Horse h= new Horse();
        h.breath();
        h.walk();
        h.reproduce();
        h.circulation();
        h.categories();
        h.legs(4);
    }
}
//Abstract class
abstract class Animal{
    //abstract function
    abstract void categories();
    abstract int legs(int x);
    int eats;
    Animal(){
        System.out.println("Animal parent Constructor");
    }
    void walk(){
        System.out.println("They can walk");

    }
    void breath(){
        System.out.println("they are Breathing");

    }
    void reproduce(){
        System.out.println("they can reproduce");

    }
    void circulation(){
        System.out.println("They are warm blooded");

    }

}
class Horse extends Animal{
    //constructor
    Horse(){
       // super();------> hota hai phele se
        System.out.println(" This is Horse as a child Constructor");
    }
    void categories(){
        System.out.println("This is Horse");
    }
    //overriding
    int legs(int x){
        System.out.println(x);
        return x;

    }

}