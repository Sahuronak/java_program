import java.net.*;
import java.io.*;
public class Server {
    ServerSocket server_s;
    Socket socket_s;
    
    BufferedReader br;
    PrintWriter pw;
    //contructor
    public Server(){
        try{
            server_s=new ServerSocket(3333);
            System.out.println("Server is ready to accept connection");
            System.out.println("Waiting......");
            socket_s= server_s.accept();
            br= new BufferedReader(new InputStreamReader(socket_s.getInputStream()));
            pw= new PrintWriter(socket_s.getOutputStream());

            startReading();
            startWriting();

        }catch(Exception e){
            e.printStackTrace();

        }

    }
    public void startReading() {
        // thread ko read karke deta rahega
        Runnable r1=()->{ 
                       System.out.println("Reading.....");
        while (true) {
            try {
                String msg= br.readLine();
                if(msg.equals("exit")){
                    System.out.println("Client terminated  the chat");
                    break;
                }
                System.out.println("Client : "+msg);
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
    System.out.println("This is Server going to start....");
    new Server();
    }
    
}
