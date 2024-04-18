public class OverLoadingPoly {
    public static void main(String[] args) {
       OverLoadingPoly ff= new OverLoadingPoly();
       ff.funct1();
       ff.funct1(3);
       ff.funct1(4, 5);
       ff.funct1(7, "app: ", 9.00f);
    }
    void funct1(){
        System.out.println("Function one");
    }
    void funct1(int x){
        System.out.println(x);
    }
    void funct1(int x, int y){
        x=23;
        y=34;
        System.out.println(x+y);
    }
    void funct1(int m,String n, Float f){
        m=45;
        n="Sakshi";
        f=7.3f;
        System.out.println(m+n+f);
    }
}
