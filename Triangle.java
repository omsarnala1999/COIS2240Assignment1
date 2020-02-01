import java.lang.Math;
class Triangle extends GeometricObject
{
	double side1,side2,side3;
	
	public Triangle(double s1, double s2, double s3)
	{
		side1 = s1;
		side2 = s2;
		side3 = s3;	
	}
	
	
	@Override
	public double getPerimeter() 
	{
		double perimeter = side1 + side2 + side3;		
		return perimeter;
	}
	
	
	@Override
	public double getArea() 
	{
		double s = getPerimeter()/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;		
	}

	
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled +"\nTriangle:- \nside1: "+ side1 + "\nside2: "+ side2 + "\nside3: " + side3 ;

	}
}