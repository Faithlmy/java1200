
/*
 * ∏¥”√¿‡
 * */

package lmy1;


class WS
{
	private String s ;
	WS()
	{
		System.out.println("WS.WS()");
		s = "Con";
	}
	public String toString ()
	{
		return s;
	}
}
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
