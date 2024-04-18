import java.io.*;
public class FileH1 {
    public static void main(String[] args) throws IOException {
        File f1= new File("about.txt");
        f1.createNewFile();
        System.out.println("Exist: "+f1.exists());
        System.out.println("absolute path: "+f1.getAbsolutePath());
        System.out.println("Execute: "+f1.canExecute());
        System.out.println("length: "+f1.length());
        System.out.println("Can read: "+f1.canRead());
        System.out.println("Can write : "+f1.canWrite());
    }
}
