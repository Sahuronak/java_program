import java.awt.*;
import javax.swing.*;

public class Splash extends JFrame implements Runnable {
    Thread t1;

    Splash(String f) {//constructor
        super(f);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image copy.png"));
        Image i2 = i1.getImage().getScaledInstance(1200, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        add(image1);
        t1 = new Thread(this);
        t1.start();

        int x = 1;
        for (int i = 2; i <= 600; i += 4, x += 1) {

            setLocation(600 - ((i + x) / 2), 350 - (i / 2));// location of main screen
            setSize(i + 3 * x, i + x / 2);// length and width of screen
        }
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        setVisible(true);// visible or not
    }

    public void run() {
        try {
            Thread.sleep(7000);
            setVisible(false);
            // next frame
            new LoginPage("Login Page");
        } catch (Exception e) {
            System.out.println(" not found");
        }
    }

    public static void main(String[] args) {
        Splash sp = new Splash("University Portal");
        sp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}