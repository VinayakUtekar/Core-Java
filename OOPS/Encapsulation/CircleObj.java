class Circle{
    //variable (instence variable)(state)
    double radius;
    //final double pi = 3.14;
    //Method
    void setData(double r){
    //setData-> camel casing notation    
        radius = r;   
    }

    //Method
    void area(){
        double res = 3.14 * radius * radius;
    }
    //Method
    void circumference(){
        double res = 2 * 3.14 * radius;
    }
    //Method
    void showData(){
        System.out.println(" Radius = " + radius );
        System.out.println(" AREA = " + res);
        System.out.println(" CIRCUMFERENCE = " + res);
    }
}
public class CircleObj{
    public static void main(String args[]){
        double radius = Double.parseDouble(args[0]);

        //object 1
        Circle c = new Circle(); //new used for memory/address alloaction  Circle() here ()is constructor
        c.setData(radius);
        c.showData();
        c.area();
        c.circumference();
    }
}