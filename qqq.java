package 引用类型转换instanceof;

public class qqq {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog dog = new Dog();
		Animal animal = dog;
		Dog dog2 = (Dog)animal;
		if(animal instanceof Cat){
			Cat cat=(Cat)animal;
		}else{
			System.out.println("无法转换");
		}
	}

}
