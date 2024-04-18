public class ExceptionHandling {
    public static void main(String[] args) {
        try{
        int dibba= (5/0);
        System.out.println(dibba);
        }
        catch(Exception e1){
            System.out.println(e1);
        }
        System.out.println(" this is line after exception");
        String k= null;
        System.out.println(k);
        int db=10000;
        int cb=2000;
        try{
        if(db<cb){
            System.out.println("Arthemtic error");
        }else{
            int ans=db-cb;
            System.out.println(ans);
        }
    }catch(ArithmeticException e1){
        System.out.println(e1);
    }
    }
}

