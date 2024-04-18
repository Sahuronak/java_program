public class CopyArray {
    
    public static void main(String[] args) {
        //declaring copy array
        char[] copyFrom ={'a','s','d','f','g','h','j','k','l'};
        //declaration a destination array
        char[] copyTo= new char[7];
        //copying array using System.arraycopy() method
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        //printing the destination array
        System.out.println(String.valueOf(copyTo));

    //Clone an array in Java
        int[] arr_clone={12,23,45,54,21};
        System.out.println("Printing original Way: ");
        for(int i: arr_clone){
            System.out.println(i);
        }
        System.out.println("Printing Clone of an array: ");
        int carr[]=arr_clone.clone();
        for(int i: carr){
            System.out.println(i);
        }
        System.out.println("Are you equal");
        System.out.println(arr_clone== carr);
    }
}
