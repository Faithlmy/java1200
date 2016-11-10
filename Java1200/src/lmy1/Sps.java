
/*
 * 复用类
 * */

package lmy1;


public class Sps
{
	private String v1, v2, v3;
	private WS ws = new WS();
	private int i;
	private float f ;
	public String toString()
	{
		return
				"v1 = "+ v1 + " "+
				"v2 = "+ v2 + " "+
				"v3 = "+ v3 + "\n"+
				"i= "+ i + " " + "f = " + f +" "+
				"ws = " + ws;
	}
	public static void main(String[] args) {
		Sps s = new Sps();
		System.out.println(s);
	}
}

class WS
{
	private String s ;
	WS()
	{
		System.out.println("WS.WS()");
		s = "Con";
	}
	public String toString ()//特殊的方法
	{
		return s;
	}
}

//继承
// Cleanser中所有的方法都必须是public的
class Cleanser
{
	private String s = "cle";
	public void app(String a)
	{
		s += a;
	}
	public void dil()
	{
		app("dil()");
	}
	public void apply()
	{
		app("apply()");
	}
	public void scrub()
	{
		app("scrub()");
	}
	public String toString()
	{
		return s;
	}
	public static void main(String[] args) {
		Cleanser c = new Cleanser();
		c.scrub();
		c.apply();
		c.dil();
		System.out.println(c);
	}
}
 class De extends Cleanser
{
	public void scrub()
	{
		app("De.scrub");
		super.scrub();
	}
	public void foam()
	{
		app("foam()");
	}
	public static void main(String[] args) {
		De d = new  De();
		d.apply();
		d.dil();
		d.scrub();
		d.foam();
		System.out.println(d);
	}
}





