import java.util.Scanner;

public class Multi2Array {
    public static void main(String[] args) {
        //  int arr[][]=new int[3][4];
        //  arr[0][0]=9;
        //  arr[0][1]=3;
        //  arr[0][2]=4;
        //  arr[0][3]=2;
        //  arr[1][3]=9;
        //  arr[1][0]=9;
        //  arr[1][1]=3;
        //  arr[1][2]=7;
        //  arr[2][0]=2;
        //  arr[2][1]=3;
        //  arr[2][2]=4;
        //  arr[2][3]=0;

        int arr[][]={{1,2,0},{3,4,3},{4,5,5}};

         for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         }
         System.out.println(" JAGGED ARRAY: ");
    //Jagged Array:if it is creating a odd number in 2-D array then it is called jagged array.In other words, it is an array of arrays with different number of columns.
         int[][] arr1=new int[3][];
         arr1[0]=new int[3];
         arr1[1]=new int[4];
         arr1[2]=new int[2];
         //intialsing jagged array
        int count=0;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                arr1[i][j]=count++;
                System.out.print("i : "+arr1[i][j]+" , ");
            }
            System.out.println();
            System.out.print(count+" ");
            System.out.println();
        }
        System.out.println();
        //PRINTING DATA OF JAGGED ARRAY
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    //Addition of two matrices in java
    //the sum of two matrices
    int a[][]={{1,2,3},{3,4,5}};
    int b[][]={{22,11,32},{44,32,11}};
    // creating a blank matrices for sum of array
    int c[][]=new int[2][3];
        //loop for adding matrices
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.println(c[i][j]+" ");
            }
            System.out.println();//new line
        }
    //multiplication of two matrices in Java
        int d[][]={{1,2,3},{2,3,4},{4,5,6}};
        int e[][]={{9,8,7},{8,7,6},{5,6,8}};
        int f[][]= new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                f[i][j]=0;
                for(int k=0; k<3; k++){
                    f[i][j] += d[i][j]*e[i][j]; 
                }
                System.out.print(f[i][j]+" ");
            }
            System.out.println();
        }
    // addition of two matrices:
                int mat1[][]= new int [3][3];
                int mat2[][]= new int [3][3];
                int mat3[][]= new int [3][3];
            Scanner sc= new Scanner(System.in);
            System.out.println(" Enter the number of matrices 1: ");
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    mat1[i][j]= sc.nextInt();
                }
            }
            System.out.println(" Enter the number of matrices 2: ");
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        mat2[i][j]= sc.nextInt();
                    }
            }
            System.out.println(" Adding both matrices to third mat:  ");
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    mat3[i][j]= mat1[i][j]+ mat2[i][j];
                }
        }
        System.out.println(" The new Matrices is:  ");
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    System.out.print( mat3[i][j]+" ");
                }
        }
    }

}
