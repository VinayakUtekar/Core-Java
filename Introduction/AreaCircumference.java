class AreaCircumference{
	public static void main(String args[]){
		final  double pi=3.14159;
		double radius = Double.parseDouble(args[0]);
		if (radius > 0){ 
			double area = pi * radius *radius;
			System.out.println("\n AREA = " + area);
			double circum = 2 * pi * radius;
			System.out.println("\n CIRCUMFERENCE = " + circum);
		}
		else 
			System .out.println("\n INVALID RADIUS");
		}
}