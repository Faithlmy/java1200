package lmy4;

public class TestCircle {
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		
		double area = c.findVolume();
		System.out.println(area);
		
		
		c.setLength(1.3);
		c.setRadius(2.8);
		System.out.println(c.findVolume());
		c.str();
	}

}
