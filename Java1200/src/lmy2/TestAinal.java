package lmy2;



/*�������һ����װ������
 * 1����������֮�󣬵��ö��� �� ������ʱ�����ֲ�����ʵ�������״�������ǿ����ö�����ֱ���������ԣ�
 * ����ͨ�������󷽷� ������ʽ�����ƶ������� �ķ��ʣ�ʵ������У������� ��Ҫ��Ϳ���ͨ�����������֡�
 * 
 * ����Ȩ�����η��� public   protected    ȱʡ     private              
 * */

public class TestAinal {
	public static void main(String[] args) {
		Animal a1 = new Animal();
//		a1.name = "����";
//		a1.legs = 4;
//		a1.setLegs(4);
//		a1.info();
		a1.eat();
	}

}

class Animal{
	//������˽�л�֮��ֻ���ڱ������п��Ա����ã����˱��࣬�Ͳ��ܱ�����
		private String name;
		private int legs;
		
		public void eat(){
			System.out.println("�����ʳ");
		}
		public void sleep(){
			System.out.println("����˯��");
		}
		public void info(){
			System.out.println("name:  " + name +"   "+ "legs:  " + legs);
		}
		public void setLegs(int l){
			if(l > 0 && l%2 ==0){
				legs = 1;
			}else{
				System.out.println("����������");
			}
		}
		public int getLegs(){
			return legs;
		}
		public String getName(){
			return name; 
		}
}
