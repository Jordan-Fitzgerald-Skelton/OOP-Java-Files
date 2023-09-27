/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeapp;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class EmployeeUI { 
    private ArrayList <Employee> employees;
    
    public EmployeeUI(){
        employees = new ArrayList<>(); 
    }
    
    //menu 
    public void menu(){
        int ans = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Add \n 2. Dialpay \n 3. Search \n 4. Delete"));
        
        switch (ans){
            case 1:
                add();
                break;
            case 2: 
                print();
                break;
            case 3:
                search();
                break;
            case 4: 
                delete();
                break;
            default:
                break;
        }
    }
        public void add(){
            int type = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like to enter a 1. Manager or 2.Floor Staff member"));
            if(type ==1){
                Manager m = new Manager();
                m.setName(JOptionPane.showInputDialog(null, "Enter name "));
                m.setDob(JOptionPane.showInputDialog(null, "Enter date of birth "));
                m.setId(JOptionPane.showInputDialog(null, "Enter manager id "));
                m.setSalary(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter salary ")));
                
                employees.add(m);
            }else if(type ==2){
                FloorStaff f = new FloorStaff();
                f.setName(JOptionPane.showInputDialog(null, "Enter name "));
                f.setId(JOptionPane.showInputDialog(null, "Enter staff id "));
                f.setDob(JOptionPane.showInputDialog(null, "Enter date of birth "));
                f.setHourlyRate(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter hourly rate of pay ")));
                
                employees.add(f);
            }
        }
        
        public void print(){
            for(Employee e:employees){
                JOptionPane.showMessageDialog(null, e.getDetails());
            }
            /*
            for(int i = 0; i < employees.size(); i++){
                Employee e = employees.get(i);
                if(e instanceof Manager){
                    JOptionPane.showMessageDialog(null, "Name:" +e.getName()+ "DOB:" + e.getDob()+"ID:" + e.getId()+ "Salary:" +((Manager) e).getSalary());
                }else if(e instanceof FloorStaff){
                    JOptionPane.showMessageDialog(null, "Name:" +e.getName()+ "DOB:" + e.getDob()+"ID:" + e.getId()+ "Hourly Rate:"+ ((FloorStaff) e).getHourlyRate());
                }
            }
                */
        }
        
        public void search(){
            if(employees.isEmpty()){
                JOptionPane.showMessageDialog(null, "Sorry, there are no employees to search");
            }else{
                String searchterm = JOptionPane.showInputDialog(null, "Please enter an id to search");
                for(Employee e:employees){
                    if(e.getId().equals(searchterm)){
                        JOptionPane.showInputDialog(null, e.getDetails());
                    }
                }
            }
        }
        
        public void delete(){
            if(employees.isEmpty()){
                JOptionPane.showMessageDialog(null, "There are no employees to delete ");
            }else{
                String searchterm = JOptionPane.showInputDialog(null, "Please enter an id to delete");
                for(int i = 0; i < employees.size();i++){
                    Employee e = employees.get(i);
                    if(e.getId().equals(searchterm)){
                        employees.remove(e);
                        if(i>0){
                            i = i-1;
                        }
                    }
                }
            }
        }
}