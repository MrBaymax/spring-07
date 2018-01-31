package class_test;
import class_test02.Cat;
//不用第三个参数交换两个变量值
public class Test {
	public static void main(String[] args) {
		int a=50;
		int b=87;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		Cat cat=new Cat();
		cat.setName("蜡笔小新");
		cat.outMaoBu();
		int add = cat.add(156, "123");
		System.out.println(cat.getAge());
	}
}
