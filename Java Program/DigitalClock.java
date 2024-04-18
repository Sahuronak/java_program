import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class DigitalClock extends JFrame {
    JLabel l1,l2;
    SimpleDateFormat d1;

    DigitalClock(String s1){

    }
    DigitalClock(){}
    void setComponents(){
        l1=new JLabel("Time");
        setLayout(null);
        add(l1);
        l1.setBounds(100,100,100,100);

        d1 = new SimpleDateFormat("hh:mm:ss  a");
        String time= d1.format(Calendar.getInstance().getTime());
        l1.setText(time);
        setTime();

    }
    public void setTime(){
        String time;
        while (true) {
        time= d1.format(Calendar.getInstance().getTime());
         l1.setText(time);
         try{
            Thread.sleep(1000);
        }
        catch(Exception e){

        }   
        }
        

    }
    public static void main(String[] args) {
        DigitalClock d1= new DigitalClock("Digital Clock");
        d1.setVisible(true);
        d1.setSize(600,600);
        d1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d1.setComponents();


    }
    
}
