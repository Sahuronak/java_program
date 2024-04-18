public class Arrays {
    public static void main(String[] args) {
        int s=2;
        for(int i=0; i<args.length; i++){
            s+=s+Integer.parseInt(args[i]);
            s+=s+Integer.parseInt(args[i]);
            System.out.println(s);
        }
        System.out.println(s);
    }
}
