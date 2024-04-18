import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
     Socket socket_s;
     BufferedReader br;
    PrintWriter pw;
    public Client(){
        
        try {
            System.out.println("Sending request to server");
            socket_s= new Socket("192.168.43.13", 3333);

             br= new BufferedReader(new InputStreamReader(socket_s.getInputStream()));
            pw= new PrintWriter(socket_s.getOutputStream());

            startReading();
            startWriting();


        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    } public void startReading() {
        // thread ko read karke deta rahega
        Runnable r1=()->{ 
                       System.out.println("Reading.....");
        while (true) {
            try {
                String msg= br.readLine();
                if(msg.equals("exit")){
                    System.out.println("Server terminated  the chat");
                    break;
                }
                System.out.println("Server : "+msg);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        };
        new Thread(r1).start();


    }
    public void startWriting() {
        // thread - user se data lekear client tk send karega.
        Runnable r2=()->{
            System.out.println("writing......");
            while (true) {
            try {
                BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
                String content =br1.readLine();
                pw.println(content);
                pw.flush();
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            }
        };
        new Thread(r2).start();
    }
   

    public static void main(String[] args) {
        System.out.println("THis is client");
        new Client();
    }
}
