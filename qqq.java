package ��������ת��instanceof;

public class qqq {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Dog dog = new Dog();
		Animal animal = dog;
		Dog dog2 = (Dog)animal;
		if(animal instanceof Cat){
			Cat cat=(Cat)animal;
		}else{
			System.out.println("�޷�ת��");
		}
	}

}
