/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author jasme
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //print student details 
        Student s1= new Student();
        s1.setName("Jasmeet");
        s1.setAge(19);
        Student s2= new Student();
        s2.setName("Stef");
        s2.setAge(20);
        Student s3= new Student();
        s3.setName("George");
        s3.setAge(21);
        
        Student[] list= new Student[3]; //array of object student with students in it
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName()+" "+list[i].getAge());
        }
        
        
        
    }
    
}
