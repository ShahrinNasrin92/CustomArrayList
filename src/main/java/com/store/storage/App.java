package com.store.storage;


public class App
{
    public static void main( String[] args )
    {
        
        Student st1=new Student("1","Ana");
        Student st2=new Student("2","Joyee");
        Student st3=new Student("3","Abc");
        
        Department dpt1=new Department("4","CSE");
        Department dpt2=new Department("5","EEE");
        Department dpt3=new Department("6","ICE");
        //System.out.println(dpt1.getDeptName());
        
        CustomArrayList<Student> studentList=new CustomArrayList<Student>();
        studentList.addStudent(st1);
        studentList.addStudent(st2);
        studentList.addStudent(st3);
        studentList.addStudent(st1);
        studentList.addStudent(st2);
        studentList.addStudent(st3);
        
		/*
		 * System.out.println(st1.getStName()); System.out.println(st2.getStName());
		 * System.out.println(st3.getStName());
		 */
        studentList.remove(1);
        System.out.println(studentList.get(0).getStName());
        System.out.println(studentList.get(1).getStName());
        
        System.out.println(studentList.get(2).getStName());
        System.out.println(studentList.get(6).getStName());
        
        

       
        
      // System.out.println(studentList.get(0).getStName());
       
       CustomArrayList<Department>departmentList=new CustomArrayList<Department>();
       departmentList.addStudent(dpt1);
       departmentList.addStudent(dpt2);
       departmentList.addStudent(dpt3);
     
       

       departmentList.remove(1);
       System.out.println(departmentList.get(0).getDeptName());
       System.out.println(departmentList.get(1).getDeptName());
      // System.out.println(departmentList.get(2).getDeptName());
       
        
       
        
    }
}
