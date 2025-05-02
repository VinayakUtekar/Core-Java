package OOPS.Inheritance;

public class Person{
    private int id;
    private String name;
    private String address;
    
    public Person(int id,String name,String address){
    this.id = id;
    this.name = name;
    this.address = address;
    }
    
    public void showdata(){
    System.out.println("id = " + id );
    System.out.println("name = " + name );
    System.out.println("address = " + address );
    }
    }
    
    
    class Teacher extends Person{
    private double salary;
    
    public Teacher(int id, String name,String address,double salary){
    super(id,name,address);
    this.salary = salary;	
    }
    
    public void show(){
    super.showdata();
    System.out.print("salary = "+salary);
    }
    }
    
    
    class Hod extends Teacher{
    private String dept;
    
    public Hod(int id, String name,String address,double salary,String dept){
    super(id,name,address,salary);
    this.dept = dept;	
    }
    
    public void show(){
    super.showdata();
    System.out.print("Department = "+dept);
    }
    }
    
    class P6{
    public static void main(String args[]){
    Teacher t = new Teacher(10,"Amit","Thane",8900);
    t.show();
    
    Hod h = new Hod(11,"Varun","Thane",10000,"cs");
    h.show();
    
    }
    }
     {
    
}
