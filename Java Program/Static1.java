class Static1{
    static void fun1(){
        System.out.println("fun1");
    }
    void fun2(){
        System.out.println("fun2");
    }
    public static void main(String []args){
        //static function call
        fun1();
        System.out.println("main function");
        //non-static function call by creating object
        Static1 s1=new Static1();
        s1= new Static1();// new create another area in a memory
        s1.fun2();
        Static1 s2= new Static1();
        s2.fun2();// create another object but refrencing to same function
        // function from other class with static method
        AnotherClass.fun1();
        AnotherClass.a=5;

        //create object of another class with non static method
        AnotherClass e1= new AnotherClass();
        e1.fun2();
        e1.fun1();
        e1.b=4;


    }
}
class AnotherClass{
    static int a;
    int b;
    static void fun1(){
        System.out.println("Another Class fun1");
        System.out.println(a);
    }
    void fun2(){
        System.out.println("Another class fun2");
        System.out.println(b);
    }
}