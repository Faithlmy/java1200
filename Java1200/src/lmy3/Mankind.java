package lmy3;



public class Mankind {
	private int sex;
	private int salary;
	
	public void manorWoman(){
		if (sex==1){
			System.out.println("man");
		}else  if (sex==0){
			System.out.println("woman");
		}else {
			System.out.println("�������");
		}
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public void employees(){
		if(salary == 0)
			System.out.println("no job");
		else if(salary > 0 )
			System.out.println("job");
	}

}

