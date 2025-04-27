class Rectangle{
    //variable (instence variable)(state)
    double length, breadth;
    
    //Method
    void setData( double l , double b){
        length = l;
        breadth = b;
    }
    
    //Method
    void Display(){
        System.out.println("\n Length =" + length + " " + " Breath =" + breadth );
    }
    
    //Method
    void area(){
        double res = length * breadth;
        System.out.println("\n AREA = " + res);
    }
    //Method
    void perimeter(){
        double res = 2*( length + breadth);
        System.out.println("\n PERIMETER = " + res);
    }
}
class RectangleObj{
    public static void main(String args[])
    {
        double length = Double.parseDouble(args[0]);
        double breadth = Double.parseDouble(args[1]);

        //object 1
        Rectangle r = new Rectangle(); //new used for memory/address alloaction  Rectangle() here ()is constructor
        r.setData(length,breadth);
        r.Display();
        r.area();
        r.perimeter();

    }
}