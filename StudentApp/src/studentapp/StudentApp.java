/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class StudentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        int age;
        String dob;
        String idnumber;
        String programme;
        
        Student s = new Student();
        
        s.setName("j");
        s.setAge(19);
        s.setDob("18/12/2002");
        s.setIdnumber("x21366771");
        s.setProgramme("BSHC");
        
        JOptionPane.showMessageDialog(null, s.getDetails());
        Student s2 = new Student("joe", 22, "22/121995","123456", "BSHC");
        JOptionPane.showMessageDialog(null, "Student Details:"+s2.getName()+ ", " + s2.getAge() + ", "+ s2.getDob() +  ", " + s2.getIdnumber() + ", "+ s2.getProgramme());
        
        //int g1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first grade"));
        //int g2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second grade"));
        s2.computeGrade(66.5,24.4);
        double grade= s2.getGrade();
        JOptionPane.showMessageDialog(null, "The grade for the student Joe = "+grade);
        
    }
    
}


