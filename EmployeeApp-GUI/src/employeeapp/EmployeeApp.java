/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeeapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class EmployeeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmployeeGUI myGUI = new EmployeeGUI();
        myGUI.setVisible(true);
    }
}
        
        /*String ans;
        EmployeeUI myUI = new EmployeeUI();
        do{
        myUI.menu();
        ans = JOptionPane.showInputDialog(null, "Would you like to go back to the menu");
        
        }while(ans.equalsIgnoreCase("yes"));
    }*/
/*        // TODO code application logic here
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Which type of Employee do you wish to enter? 1.Basic, 2.Manager, 3.Floor Staff"));
        /*if (num == 1) {
            //get data from user
            String name = JOptionPane.showInputDialog(null, "Please enter Employee name");
            String id = JOptionPane.showInputDialog(null, "Please enter Employee ID");
            String dob = JOptionPane.showInputDialog(null, "Please enter Employee DOB");

            //make new basic employee object with data from user
            Employee e = new Employee(name, id, dob);
            //print data to user for confirmation

            JOptionPane.showMessageDialog(null, e.getDetails());

        } else
        if (num == 2) {
            //get data from the user
            double salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Employee Salary"));
            String name = JOptionPane.showInputDialog(null, "Please enter Employee name");
            String id = JOptionPane.showInputDialog(null, "Please enter Employee ID");
            String dob = JOptionPane.showInputDialog(null, "Please enter Employee DOB");
            //Make new manager object with employee data
            Manager m = new Manager(salary, name, id, dob);
            //print data to user for confirmation

            JOptionPane.showMessageDialog(null, m.getDetails());
            m.computePay();
            JOptionPane.showMessageDialog(null,"The weekly pay for that employee is "+m.getPay());
        } else if (num == 3) {
            //get data from user
            double rate = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Employee Hourly Rate"));
            String name = JOptionPane.showInputDialog(null, "Please enter Employee name");
            String id = JOptionPane.showInputDialog(null, "Please enter Employee ID");
            String dob = JOptionPane.showInputDialog(null, "Please enter Employee DOB");
            //create new Floor Staff employee using data from user
            FloorStaff f = new FloorStaff(rate, name, id, dob);
            //print data to user for confirmation
            JOptionPane.showMessageDialog(null, f.getDetails());
            f.computePay();
            JOptionPane.showMessageDialog(null,"The weekly pay for that employee is "+f.getPay());
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, that is an invalid entry,please try again");
        }
    }
*/
