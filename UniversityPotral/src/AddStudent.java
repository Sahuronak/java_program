import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class AddStudent extends JFrame {
    JLabel heading, nameLabel1,fNameLabel2,rollLabel3,dobLabel4,addressLabel5,phoneLabel6,maiLabel7, sshLabel8, hSLabel9, aadharLabel10,courseLabel11, branchLabel12;
    JTextArea nameArea1,fNameArea2,rollArea3,dobAreal4,addressArea5,phoneArea6,maiArea7, sshArea8, hSArea9, aadharArea10,courseArea11, branchArea12;
    JButton submitB1,cancelB2;
    AddStudent(String r){
        super(r);
        setSize(800,700);
        setLocation(350,50);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        //heading 
        heading = new JLabel("NEW STUDENT DETAIL");
        heading.setBounds(300,30,300,20);
        heading.setFont(new Font("Tahona",Font.BOLD,18));
        add(heading);
        //Name Label
        nameLabel1 = new JLabel("NAME: ");
        nameLabel1.setBounds(70,70,100,20);
        add(nameLabel1);
        //Name text Area
        fNameArea2 = new JTextArea();
        fNameArea2.setBounds(200,70,100,20);
        fNameArea2.setBackground(Color.lightGray);
        fNameArea2.setForeground(Color.black);
        add(fNameArea2);
        //Father Name Area
        fNameLabel2 = new JLabel("Father Name: ");
        fNameLabel2.setBounds(400,70,100,20);
        add(fNameLabel2);
        //father text field
        fNameArea2 = new JTextArea();
        fNameArea2.setBounds(600,70,100,20);
        fNameArea2.setBackground(Color.lightGray);
        fNameArea2.setForeground(Color.black);
        add(fNameArea2);

        //Roll no. Label
        rollLabel3 = new JLabel("Roll no.:  ");
        rollLabel3.setBounds(70,120,100,20);
        add(rollLabel3);
        //Roll no. text Area
        rollArea3 = new JTextArea();
        rollArea3.setBounds(200,120,100,20);
        rollArea3.setBackground(Color.lightGray);
        rollArea3.setForeground(Color.black);
        add(rollArea3);
        //Date of Birth
        dobLabel4 = new JLabel("Date of Birth:  ");
        dobLabel4.setBounds(400,120,100,20);
        add(dobLabel4);
        //Date of Birth text field
        dobAreal4 = new JTextArea();
        dobAreal4.setBounds(600,120,100,20);
        dobAreal4.setBackground(Color.lightGray);
        dobAreal4.setForeground(Color.black);
        add(dobAreal4);

         //Email Id Label
         maiLabel7 = new JLabel("Roll no.:  ");
         maiLabel7.setBounds(70,120,100,20);
         add(maiLabel7);
         //Email Id text Area
         maiArea7 = new JTextArea();
         maiArea7.setBounds(200,120,100,20);
         maiArea7.setBackground(Color.lightGray);
         maiArea7.setForeground(Color.black);
         add(maiArea7);
         //Phone no. label
         phoneLabel6 = new JLabel("Date of Birth:  ");
         phoneLabel6.setBounds(400,120,100,20);
         add(phoneLabel6);
         //Phone no. text field
         phoneArea6 = new JTextArea();
         phoneArea6.setBounds(600,120,100,20);
         phoneArea6.setBackground(Color.lightGray);
         phoneArea6.setForeground(Color.black);
         add(phoneArea6);



        setVisible(true);
    }
    public static void main(String[] args) {
        AddStudent as= new AddStudent("Student Detail");
        as.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
