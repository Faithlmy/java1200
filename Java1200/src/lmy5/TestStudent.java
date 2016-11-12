package lmy5;

/*
 * 当子类和父类中有同名的时，可以通过super.属性来调用父类中声明的属性
 * 
 * super修饰构造器：通过在子类中使用super.属性 来调用父类中指定的构造器；
 * 		构造器内部，“super（）；”必须声明在行首，
 * 		构造器内部，this 和  super 只能出现一个
 * 		构造器中部显式的调用其中一个，默认的是父类空参
 * 
 * 设计类时，尽量设计一个空参构造器
 * */

public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		s.info();
		Student s1 = new Student("beijing");
		System.out.println(s1.getName() + ":" + s1.getAge() + "," + s1.getSchoolName());
	}

}
