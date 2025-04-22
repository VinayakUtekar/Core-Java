class AreaPerimeter{
	public static void main(String args[]){
		double length = Double.parseDouble(args[0]);
		double breadth = Double.parseDouble(args[1]);
		if ((length > 0) & (breadth> 0)){ 
			double area = length * breadth;
			System.out.println("\n AREA = " + area);
			double perimeter = 2 * ( length + breadth);
			System.out.println("\n PERIMETER = " + perimeter);
		}
		else{
			System .out.println("\n INVALID INPUT");
		}
	}
}