class WrapperClass {
    public static void main(String[] args) {
        Integer e1= Integer.valueOf("1101",2);
        int s= e1.intValue();
        System.out.println(s);
       int x= e1.parseInt("543");
       String y= e1.toString(3);
        System.out.println(x);
        System.out.println(y);
    }
}
