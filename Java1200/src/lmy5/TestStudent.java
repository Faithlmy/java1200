package lmy5;

/*
 * ������͸�������ͬ����ʱ������ͨ��super.���������ø���������������
 * 
 * super���ι�������ͨ����������ʹ��super.���� �����ø�����ָ���Ĺ�������
 * 		�������ڲ�����super���������������������ף�
 * 		�������ڲ���this ��  super ֻ�ܳ���һ��
 * 		�������в���ʽ�ĵ�������һ����Ĭ�ϵ��Ǹ���ղ�
 * 
 * �����ʱ���������һ���ղι�����
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
