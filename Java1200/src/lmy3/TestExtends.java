package lmy3;
/*
 * 继承性：
 * 1、避免繁琐的同一类型的调用
 * 2、通过“class A extend B ”来继承
 * 3、必须类之间有关系，不能乱继承
 * 4、子类继承父类，父类中声明的属性方法，子类就可以获取
 * 5、当父类中有私有属性和方法时候，子类同样可以获取到，只是由于封装性的设计使得子类不可以直接调用。
 * 6、Java只能单继承，一个子类只能继承一个父类，一个父类可以有多个子类。
 * 
 * 重写    修饰符  返回值类型   方法名（参数类表）
 * 1、有子类继承父类
 * 2、子类继承父类以后，若父类的方法对子类不适用，那么，子类可以对父类的方法进行重写
 * 3、重写规则：
 * 	   要求子类的方法    与父类的一致
 * 	  子类方法修饰符不能笑语父类的修饰符
 * 	  若父类方法抛异常，那么子类方法抛异常类型不能大于父类的
 * 	  子父类的方法名必须同为static或同为非static
 * */


public class TestExtends {
	public static void main(String[] args) {
		Kids  someKid = new Kids();
		
		
		
		someKid.setSalary(0);
		someKid.setSex(1);
		someKid.setYearsOld(13);

		someKid.employees();
		someKid.manorWoman();
		someKid.printAge();
	}

}

