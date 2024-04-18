public class ArrayClass {
    public static void main(String[] args) {
        //What is Class name of Java Array
        //In Java Array is an object, a proxy class is created whose name can be obtained by getClass(), .getNAme() method on the obejct
        int arr[]={44,42,23};
        Class c= arr.getClass();
        String name=c.getName();
        System.out.println("Class: "+c);
        System.out.println("NAme: "+name);
    }
}
