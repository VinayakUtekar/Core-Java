class Employee{
    private int eid;
    private String ename;
    private double salary;
    
    public Employee(int eid,String ename,double salary){
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
    }
    
    public void showdata(){
        System.out.println("id = " + eid );
        System.out.println("name = " + ename );
        System.out.println("salary = " + salary );
    }
}
    
    
class SalesPerson extends Employee{
    private double comm;
    
    public SalesPerson(int eid, String ename,double salary,double comm){
        super(eid,ename,salary);
        this.comm = comm;	
    }
    
    public void show(){
        super.showdata();
        System.out.print("comm = "+comm);
    }
    
}
    
class P4{
    public static void main(String args[]){
        SalesPerson sp = new SalesPerson(10,"amit",5000,10000);
        sp.show();
    }
}