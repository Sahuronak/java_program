class Array1 {

    public static void main(String[] args) {
        // java program to initialize,declare and instantiate array
        // int a[]= new int[5];
        // a[0]=10;
        // a[1]=20;
        // a[2]=30;
        // a[3]=40;
        // a[4]=50;
        int a[]={10,20, 30,40, 50};
        // traversing array
            //for loop
        for(int i=0; i<a.length; i++){// length is the property of array
            System.out.print(a[i]+" ");
        }

        System.out.println();
            //for-each loop
        for(int i: a){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.print(" the value of minimum array: ");
        min(a);

        //support anonymous array 
        anonymousArr(new int[]{23,34,54,64,67});
        System.out.println();

        //Returning Array from method
        int arr[]=get();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
 //1-method    //passing array to a method
     public static void min(int a[]){
        int min=a[0];
        for(int i=0; i<a.length; i++){
            if(min>a[i])
                min=a[i];
        }
        System.out.println(min);
     }
//2-method      //Anonymous Array feature in Java
     public static void anonymousArr(int ab[]){
        for(int aa: ab){
            System.out.println(aa);
        }
     }

//3-method      //Returning Array from method
     static int[] get(){
        return new int[]{1,2,3,4,5,6,4,3,2};
     }
}