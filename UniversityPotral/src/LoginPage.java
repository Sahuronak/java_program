import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.*;
public class LoginPage extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField f1;
    JPasswordField p1;
    JButton b1, b2;

    LoginPage(String r){
        super(r);
       
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        //Label Field
         //label 1:
        l1= new JLabel("LOGIN ");
        l1.setBounds(250,30,100,50);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Tahona",Font.BOLD,20));
        add(l1);
         //label 2:
        l2= new JLabel("User Name");
        l2.setForeground(Color.WHITE);
        l2.setBounds(150,100,100,50);
        add(l2);
         //label 3:
        l3= new JLabel("Password");
        l3.setForeground(Color.WHITE);
        l3.setBounds(150,150,100,50);
        add(l3);

        //text fields
        f1 = new JTextField();
        f1.setBounds(300,110,100,30);
        add(f1);

        //Password field
        p1= new JPasswordField();
        p1.setBounds(300,160,100,30);
        add(p1);

        //Button field
        b1= new JButton("Login");
        b1.setBounds(150,250,100,30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        b2= new JButton("Clear");
        b2.setBounds(300,250,100,30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        //Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("imageLogin.png"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(0,0,600,500);
        add(image1);

        setVisible(true);
        setSize(600,500);
        setLocation(500,150);

    }
    public void actionPerformed(ActionEvent e) {
        //login button
        if(e.getSource()== b1){
            String userName= f1.getText();
            String password= p1.getText();
            //4.Executing my sql query

            String query="select * from b1 WHERE userName='"+userName+"'password= '"+password+"'";
            System.out.println("query"+query);
            //Execute mysql query
            try{
                System.out.println("line conn try check kare");
                ConnectionJdbc cJdbc= new ConnectionJdbc();
                System.out.println("line 82");
                ResultSet rs=cJdbc.s.executeQuery(query);
                System.out.println("line:84");
                if(rs.next()){
                    System.out.println("line:86");
                    setVisible(false);
                    //new project();
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid credantial");
                    setVisible(false);
                }

            }catch(Exception em){
                System.out.println("invalid");
            }
        }
        //clear button
        else if(e.getSource()== b2){
           f1.setText("");
           p1.setText("");
        }
    }
    public static void main(String[] args) {
        LoginPage lg= new LoginPage("Login Page");
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
