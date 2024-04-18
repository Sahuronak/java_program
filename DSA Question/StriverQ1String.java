import java.util.*;
public class StriverQ1String {
    public static void main(String[] args) {
        /*Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.
            1, if the character is an uppercase alphabet (A - Z).
            0, if the character is a lowercase alphabet (a - z).
            -1, if the character is not an alphabet.*/
                Scanner sc= new Scanner(System.in);
                char ch= sc.next().charAt(0);
        
                if(ch>'A'&& ch<'Z'){
                    System.out.println("1");
                }
                else if(ch>'a'&& ch<'z'){
                    System.out.println("0");
                }
                else{
                    System.out.println("-1");
                }

    }
     /*Data type refers to the type of value a variable has and the way the computer interprets it.
    Each data type has a different size. You’ve studied 5 different data types and the sizes of the data types:
    Integer: 4 bytes
    Long: 8 bytes
    Float: 4 bytes
    Double: 8 bytes
    Character: 1 byte */
    public static int dataTypes(String type) {
        switch(type){
        case "Interger":
        return 4;
        case "Long":
        return 8;
        case "Float":
        return 4;
        case "Character":
        return 1;
    } 
    return 0;
}
/*Programming languages have some conditional / decision-making statements that execute when some specific condition is fulfilled.
If-else is one of the ways to implement them.
You are given two numbers 'a' and 'b'.
Compare the numbers and print the relation.
Print “smaller”, “greater” or “equal” when ‘a’ is smaller than ‘b’, greater than ‘b’, or equal to ‘b’ respectively.(*/

}
