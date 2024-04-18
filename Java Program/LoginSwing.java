import javax.swing.*;
import java.awt.event.*;

class LoginSwing extends JFrame {
    JLabel l1, l2, l3, l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2, b3;

    LoginSwing(String r) {
        super(r);
    }
    LoginSwing(){
        
    }

    void setComponent() {
        // label
        l1 = new JLabel("LOGIN");
        l2 = new JLabel("USERNAME");
        l3 = new JLabel("PASSWORD");
        l4 = new JLabel();
        // textfield
        t1 = new JTextField();
        t2 = new JPasswordField();
        // botton
        b1 = new JButton("Login");
        b2 = new JButton("Clear");
        b3= new JButton("Add");
        // layout
        setLayout(null);
        // add
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        // bound
        l1.setBounds(250, 100, 500, 30);
        l2.setBounds(100, 200, 500, 30);
        l3.setBounds(100, 350, 500, 30);
        l4.setBounds(300, 550, 500, 30);
        t1.setBounds(350, 200, 100, 30);
        t2.setBounds(350, 350, 100, 30);
        b1.setBounds(150, 500, 100, 30);
        b2.setBounds(300, 500, 100, 30);
        b3.setBounds(350, 650, 100, 30);
        b1.addActionListener(new loginActionB1());
        b2.addActionListener(new loginActionB2());
        b3.addActionListener(new loginActionAdd());


    }

    public static void main(String[] args) {
        // JFrame j1=new JFrame();
        // j1.setVisible(true);
        // j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LoginSwing ls = new LoginSwing("Welcome To Login Page");
        ls.setVisible(true);
        ls.setSize(800, 800);
        ls.setComponent();
        ls.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //login button
    class loginActionB1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s1 = t1.getText();
            String s2 = t2.getText();
            if (s1.equals("Coding") && s2.equals("Seekho")) {
                l4.setText("Login Successful");
            } else {
                l4.setText("login unsuccessful");
            }
    
        }
    
    }
    //Clear button
    class loginActionB2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            t1.setText("");
            t2.setText("");
    
        }
    
    }
    class loginActionAdd implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try{
                int a= Integer.parseInt(t1.getText());
                int b= Integer.parseInt(t2.getName());
                int c= a+b;
                l4.setText("Addition is: "+c);
            }
            catch(Exception e1){
                l4.setText("Please Enter Correctly");
            }
        }
    
    }
}

