package lmy5;

public class Student extends Person{
	private String schoolName;

	int id = 1002;

	public Student() {
		super();
	}
	
	public Student(String schoolName){
		//this.schoolName = schoolName;
		super("����" , 23);
		this.schoolName = schoolName;
	}	
	
	

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public void eat(){
		System.out.println("ѧ���Է�");
	}
	
	public void info(){
		this.eat();
		super.eat();
	}
	public void show(){
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(super.id);
	}

}
