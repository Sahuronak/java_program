public class InterfaceClass {
    public static void main(String[] args) {
        Masale m= new Masale();
        m.rescipe();
        m.incredient();
    }
}
interface GaramMasala{
    public static final int Dahna = 50;
    public static final int mirchi = 25;
    public static final int haldi = 10;
    public static final int namak = 12;
    static void rescipe(){

    }
    static void incredient(){

    }
    static void soldCapacity(){

    }
    static void otherMaterialForm(){

    }

}
class Masale implements GaramMasala{
    static void rescipe(){
        System.out.println("Step of recipe");
        System.out.println(Dahna);

    }
    static void incredient(){
        System.out.println(" this is incrident place");
        System.out.println(haldi);
    }
    static void otherMaterialForm(){
        System.out.println(mirchi);
        System.out.println(" this other material block");
    }

}
