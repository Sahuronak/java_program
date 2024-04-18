import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrontMenuPage extends JFrame implements ActionListener {
    JMenuBar m1,m2;
    FrontMenuPage(String r){
        super(r);
        //set size
        setSize(1600,850);
        //set image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image copy.png"));
        Image i2 = i1.getImage().getScaledInstance(1600, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        add(image1);
        //menu bar
        //first menu bar item
        m1= new JMenuBar();
        JMenu newInfor= new JMenu(" New Information");
        newInfor.setForeground(Color.RED);
        m1.add(newInfor);
        //menu item
        //1 stNew information menu item
        JMenuItem facultyInfo= new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.BLACK);
        facultyInfo.setForeground(Color.WHITE);
        newInfor.add(facultyInfo);
        //2nd New Information menu item
        JMenuItem StudentInfo= new JMenuItem("New Student Information");
        StudentInfo.setBackground(Color.BLACK);
        StudentInfo.setForeground(Color.WHITE);
        newInfor.add(StudentInfo);
       //finish new information

        //second menu bar item
        JMenu details= new JMenu(" View Detail");
        details.setForeground(Color.BLUE);
        m1.add(details);
        //menu item
        //2 st details menu item
        JMenuItem facultyDetail= new JMenuItem("Faculty Detail");
        facultyDetail.setBackground(Color.BLACK);
        facultyDetail.setForeground(Color.WHITE);
        details.add(facultyDetail);
        //2nd details menu item
        JMenuItem StudentDetail= new JMenuItem("Student Detail");
        StudentDetail.setBackground(Color.BLACK);
        StudentDetail.setForeground(Color.WHITE);
        details.add(StudentDetail);
       //finish details

       //Apply for leave
       JMenu leaveApply= new JMenu("Apply Leave");
       leaveApply.setForeground(Color.RED);
        m1.add(leaveApply);
        //menu item
        //1 st Leave menu item
        JMenuItem facultyLeave= new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.BLACK);
        facultyLeave.setForeground(Color.WHITE);
        leaveApply.add(facultyLeave);
        //2nd Leave menu item
        JMenuItem StudentLeave= new JMenuItem("Student Leave");
        StudentLeave.setBackground(Color.BLACK);
        StudentLeave.setForeground(Color.WHITE);
        leaveApply.add(StudentLeave);
       //finish Leave

       //Leave Detail menu
       JMenu leaveDetail= new JMenu("Leave Detail");
       leaveDetail.setForeground(Color.BLUE);
        m1.add(leaveDetail);
        //menu item
        //1 st LeaveDetail menu item
        JMenuItem facultyLeaveDetail= new JMenuItem("Faculty Leave Detail");
        facultyLeaveDetail.setBackground(Color.BLACK);
        facultyLeaveDetail.setForeground(Color.WHITE);
        leaveDetail.add(facultyLeaveDetail);
        //2nd LeaveDetail menu item
        JMenuItem StudentLeaveDetail= new JMenuItem("Student Leave Detail");
        StudentLeaveDetail.setBackground(Color.BLACK);
        StudentLeaveDetail.setForeground(Color.WHITE);
        leaveDetail.add(StudentLeaveDetail);

        //Exams
        JMenu exams= new JMenu("Examination");
        exams.setForeground(Color.RED);
        m1.add(exams);
        //menu item
        //1 st exam menu item
        JMenuItem ExamResult= new JMenuItem("Examination Result");
        ExamResult.setBackground(Color.BLACK);
        ExamResult.setForeground(Color.WHITE);
        exams.add(ExamResult);
        //2nd exam menu item
        JMenuItem examMarks= new JMenuItem("Feed Exam Marks");
        examMarks.setBackground(Color.BLACK);
        examMarks.setForeground(Color.WHITE);
        exams.add(examMarks);

        //Update Information
        JMenu updateInfo= new JMenu("Update Information");
        updateInfo.setForeground(Color.blue);
        m1.add(updateInfo);
        //menu item
        //1 st Update menu item
        JMenuItem facultyUpdate= new JMenuItem("Faculty Detail update");
        facultyUpdate.setBackground(Color.BLACK);
        facultyUpdate.setForeground(Color.WHITE);
        updateInfo.add(facultyUpdate);
        //2nd Update menu item
        JMenuItem studentUpdate= new JMenuItem("Student Detail Update");
        studentUpdate.setBackground(Color.BLACK);
        studentUpdate.setForeground(Color.WHITE);
        updateInfo.add(studentUpdate);

        //Fee details
        JMenu feeDetail= new JMenu("Fee ");
        feeDetail.setForeground(Color.RED);
        m1.add(feeDetail);
        //menu item
        //1 st Fee menu item
        JMenuItem feeStructure= new JMenuItem("Fee Structure");
        feeStructure.setBackground(Color.BLACK);
        feeStructure.setForeground(Color.WHITE);
        feeDetail.add(feeStructure);
        //2nd Fee menu item
        JMenuItem feeForm= new JMenuItem("Fee Form");
        feeForm.setBackground(Color.BLACK);
        feeForm.setForeground(Color.WHITE);
        feeDetail.add(feeForm);

        //Utility
        JMenu utility= new JMenu("Utility ");
        utility.setForeground(Color.BLUE);
        m1.add(utility);
        //menu item
        //1 st Utility menu item
        JMenuItem notePad= new JMenuItem("Note Pad");
        notePad.setBackground(Color.BLACK);
        notePad.setForeground(Color.WHITE);
        notePad.addActionListener(this);
        utility.add(notePad);
        //2nd Utility menu item
        JMenuItem calci= new JMenuItem("Calculator");
        calci.setBackground(Color.BLACK);
        calci.setForeground(Color.WHITE);
        calci.addActionListener(this);
        utility.add(calci);

        //Exit
        JMenu exit= new JMenu("Exit ");
        exit.setForeground(Color.RED );
        m1.add(exit);
        //menu item
        //1 st Exit menu item
        JMenuItem ex= new JMenuItem("exit");
        ex.setBackground(Color.BLACK);
        ex.setForeground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        //Set menu one:
        setJMenuBar(m1);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        String msg=e.getActionCommand();
        if(msg.equals("exit")){
            setVisible(false);
        }
        else if(msg.equals("Calculator")){
            try{
                ProcessBuilder pb = new ProcessBuilder("calc.exe");
                pb.start();
               // Runtime.getRuntime().exec("calc.exe"); -----> Depricated method of api

            }catch(Exception ex){
                System.out.println("Not Found");
            }
        }
        else if(msg.equals("Note Pad")){
            try{
                ProcessBuilder pbs = new ProcessBuilder("notepad.exe");
                pbs.start();
              //  Runtime.getRuntime().exec("notepad.exe");

            }catch(Exception ex){
                System.out.println("Not Found");
            } 
        }
    }
    public static void main(String[] args) {
        FrontMenuPage fp= new FrontMenuPage("University Portal");
        fp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
