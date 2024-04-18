public class OnerRidingPoly {
    public static void main(String[] args) {
        SportBike sb= new SportBike();
        sb.gear(4);
        sb.engine();
        sb.breaks();
        sb.mielach();
        sb.speedOfBike();
    }
}
class Bike{
    int gearNum;
    String bikeName;
    void gear(int gearNum){
       this.gearNum=gearNum;
        System.out.println(gearNum);
    }
    void breaks(){
        System.out.println("Breaks of Bike");

    }
    void engine(){
        bikeName="platinum";
        System.out.println(bikeName+ " This is name of bike and in engine");

    }

}
class SportBike extends Bike{
    void gear(int gearNum){
        super.gearNum=9;
        System.out.println(gearNum);
    }
    void mielach(){
        System.out.println(" Average");

    }
    void speedOfBike(){
        int speed =120;
        System.out.println("Speed of Bike: "+speed);

    }

}
