class InheritanceType {
    public static void main(String[] args) {
        Nokia n=new Nokia();
        n.camera();
        n.clock();
        n.setting=34;
        n.message();
        n.calling(45,"same as");
        System.out.println(n.setting);
        n.message();
        
}
}
class Phone{
    private int app;
    int setting;
    String file;
    Phone(){
        System.out.println("call phone");
    }
    void calling(int app, String file){
        this.app=app;
        this.file=file;
        System.out.println("This is calling function");
    }
    void message(){
        System.out.println(app);
        System.out.println(file);
        System.out.println("This is message function");
    }
    void camera(){
        System.out.println("This is camera function for photo");
    }
    void clock(){
        System.out.println("This is watch for showing time");
    }
}
class Nokia extends Phone{
     //super(); excute from parent class
    
    void whatapp(){
        System.out.println("Contact your relative through Whatapp");
    }
    void snakeGame(){
        
        System.out.println("This snake can never die");
    }
    void calling(){
        System.out.println();
    }

}


