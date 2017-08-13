package 引用类型转换instanceof;

public class Initail {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog dog = new Dog();
		//Animal animal = dog;	//自动转换-向上转换
	//  Dog dog2 = (Dog)animal;   //强制转换类型
		dog.sh();
//		if(animal instanceof Cat){		//运用instanceof判断是否可以进行转换
//			Cat cat = (Cat)animal;
//		}else{
//			System.out.println("无法转换");
//			}
		
	}

}
