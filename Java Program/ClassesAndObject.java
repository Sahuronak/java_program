class KuchBhiBanaLo{
    private int x;//phir humne ek instate variable bana liya
    private static int y; //ab ek static bhi bana liya
    //sawal y hai ki hum isko access kese kar skte hai
    //phir mujhe yad aaya ki koi function bana kar usme dal do
    //lo phir mene ek function bhi bana liya jiska nam mene
    void thatri(){
        //rakh diya kyuki mujhe aaj kl gaali ka bhoot chad raha hai
        // baato ki alwa isme mujhe ab value bhi rakhi padegi
        x=7;
        y=69;//y koi position nhi hai

    }
    //hum in value ko uper bhi print kara skte thi par mujhe chul mach rhi ki dursa function hi banana hai.y banana kela bala nhi hai kher choro
    void besh(){
        System.out.println(x);
        System.out.println(y);
    }
}
class ClassesAndObject {
    public static void main(String[] args) {
        System.out.println("Jo to aaye main function");
        System.out.println(" ab print kar rhe dursi class ki function: so dekh loo ho rhe ka nhi");
        // ab object banaye le rhe kyeki static to hai nhi hai
        KuchBhiBanaLo leoBanaLao= new KuchBhiBanaLo();
        // jo dekho jadu besh ne phele 0 print karo
        leoBanaLao.besh();
        // magar jese hi gaali mili
        leoBanaLao.thatri();
        // ja ne value print kar dai
        System.out.println(" jo mil gao output");
        leoBanaLao.besh();
    }
}
