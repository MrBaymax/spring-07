package student;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Student {
	private String name;
	private String stuNumber;
	private String sex;
	private Scanner s;
	private Map<String,Student> list;
	public Student() {	
	}
	public Student(Scanner s,Map<String,Student> list) {
		this.s=s;
		this.list=list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStuNumber() {
		return stuNumber;
	}
	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Student addStu(Student student) {
		System.out.print("——请输入姓名——：");
		student.setName(s.nextLine());
		System.out.print("——请输入学号——：");
		student.setStuNumber(s.nextLine());
		while(list.containsKey(student.getStuNumber())) {
			System.out.print("——您输入的学号已存在请重新输入——：");
			student.setStuNumber(s.nextLine());
		}	
		System.out.print("——请输入性别——：");
		student.setSex(s.nextLine());
		System.out.println("录入成功！");
		return student;
	}
	public String removeStu() {
		System.out.print("——请输入您要删除学生的学号——：");
		String ikey = s.nextLine();
		if(!list.containsKey(ikey)) {
			System.out.println("您输入的学号不存在！");
			return "";
		}		
		System.out.println("删除成功！");
		return ikey; 	
	}
	public void showStudent() {
		if(list.size()==0) {
			System.out.println("学生信息为空，请新增学生信息！");
		}else {
			System.out.print("——请输入您要查询学生的学号(输入All查询全部学生)——：");
			String key = s.nextLine();
			if(list.containsKey(key)){
				Student student = list.get(key);
				System.out.println("姓名:"+student.getName()+"     "+"学号:"+student.getStuNumber()+"     "+"性别:"+student.getSex());
				//return;
			}else if(key.equals("All")){				
					Set<String> keySet = list.keySet();
					for(String key2:keySet) {
						Student student = list.get(key2);
						System.out.println("姓名:"+student.getName()+"     "+"学号:"+student.getStuNumber()+"     "+"性别:"+student.getSex());
					}
				//return;
			}else{
				System.out.println("您输入的学号不存在！");
				//return;
			}
		}
	}
	public void changeStu() {
		System.out.print("——请输入您要修改学生的学号——：");
		String key = s.nextLine();
		if(list.containsKey(key)) {
			System.out.print("——请输入新姓名——：");
			list.get(key).setName(s.nextLine());
			System.out.print("——请输入新学号——：");
			list.get(key).setStuNumber(s.nextLine());
			while(list.containsKey(list.get(key).getStuNumber())) {
				System.out.print("——您输入的学号已存在请重新输入——：");
				list.get(key).setStuNumber(s.nextLine());
			}	
			System.out.print("——请输入性别——：");
			list.get(key).setSex(s.nextLine());
			System.out.println("修改成功");
		}else {
			System.out.println("您输入的学号不存在！");
		}
	}
	
}
