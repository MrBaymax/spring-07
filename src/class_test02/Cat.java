package class_test02;

public class Cat {
	public Cat() {}
	private String name;
	private String type;
	private char sex;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void outMaoBu() {
		System.out.print(name+"在走猫步");
	}
	public int add(int a,String b) {
		return a;	
	}
	public int add(String c,int d) {
		return d;
	}
	public float add(float b) {
		return b;
	}
	public float add(float b,float c) {
		return c;
	}
}
