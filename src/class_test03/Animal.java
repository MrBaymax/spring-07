package class_test03;

public class Animal {
	private Integer age;
	private String name;
	private Character sex;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Character getSex() {
		return sex;
	}
	public void setSex(Character sex) {
		this.sex = sex;
	}
	public void aWalk() {
		System.out.println("动物会走路");
	}
}
