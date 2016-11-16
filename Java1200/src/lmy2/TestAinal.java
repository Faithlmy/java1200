package lmy2;



/*面向对象一：封装与隐藏
 * 1、当创建类之后，调用对象 与 方法的时候会出现不满足实际情况的状况，我们靠不让对象来直接作用属性，
 * 而是通过“对象方法 ”的形式来控制对象属性 的访问，实际情况中，对属性 的要求就可以通过方法来体现。
 * 
 * 二、权限修饰符： public   protected    缺省     private              
 * */

public class TestAinal {
	public static void main(String[] args) {
		Animal a1 = new Animal();
//		a1.name = "花花";
//		a1.legs = 4;
//		a1.setLegs(4);
//		a1.info();
		a1.eat();
	}

}

class Animal{
	//变量被私有化之后，只有在本，类中可以被调用，出了本类，就不能被调用
		private String name;
		private int legs;
		
		public void eat(){
			System.out.println("动物进食");
		}
		public void sleep(){
			System.out.println("动物睡觉");
		}
		public void info(){
			System.out.println("name:  " + name +"   "+ "legs:  " + legs);
		}
		public void setLegs(int l){
			if(l > 0 && l%2 ==0){
				legs = 1;
			}else{
				System.out.println("您输入有误！");
			}
		}
		public int getLegs(){
			return legs;
		}
		public String getName(){
			return name; 
		}
}
