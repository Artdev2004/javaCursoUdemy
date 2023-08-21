package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	
	public double calculateArea() {
		
		double p, area;
		
		p = (a + b + c) / 2;
		
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		return area;
		
	}
	
	public static void largerArea( double _areaX, double _areaY) {
		if(_areaX > _areaY) {
			System.out.println("Larger Area: X");
		}else if (_areaX == _areaY){
			System.out.println("Larger Area: Y and X");
			
		}else {
			System.out.println("Larger Area: Y");
		}
	}
}
