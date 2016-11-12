package lmy4;

public class Cylinder extends Circle {
	private double length;
	
	public void str(){
		System.out.println("À÷º¦");
		
	}
	
	public Cylinder(){
		length = 1;
	}
	
	public double getLength(){
		return length;
	}
	public void setLength( double length){
		this.length = length;
	}
	
	public double findVolume(){
		//return Math.PI * this.getRadius() * this.getRadius() * length;
	return findArea() * length;
	}

}
