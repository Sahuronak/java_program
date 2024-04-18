class ConstructorForm {
    public static void main(String[] args) {
        Demo d1= new Demo();
        d1.fun1();
        func2();
        //there are three type of constructor
        //1.Default, 2.non-parametrices constructor, 3.parametrice constructor

    }
    static void func2(){
        System.out.println(" this is function 2 in main class");
    }
}
class Demo{
    Demo(){
        System.out.println(" this is a demo function in Demo Class");

    }
    void fun1(){
        System.out.println("this is function 1: ");
    }
}
