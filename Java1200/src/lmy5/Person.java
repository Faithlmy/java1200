package lmy5;



public class Person {

		protected String name;
		protected int age;
		int id;
		
		public Person(){
			this.name = "AA";
			this.age = 2;
		}
		public Person(String name){
			this();
			this.name = name;
		}
		public Person(String name, int age ){
			this(name);
			this.age = age;
		}
		
		
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name = name;
		}
		
		public int getAge(){
			return age;
		}
		public void setAge( int age){
			this.age = age;
		}
		public void eat(){
			System.out.println("eat");
		}
		public void sleep(){
			System.out.println("sleep");
			
		}
		public int compare(Person p){
			if(this.age > p.age){
				return 1;
			}
			else if(this.age < p.age){
				return -1;
			}else{
				return 0;
			}
		}
	}
	


