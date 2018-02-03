package student;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Entrance {
	public static void main(String[] args){
		Map<String,Student> stuList=new HashMap<String, Student>();
		Scanner s=new Scanner(System.in);
		Student stu=new Student(s,stuList);
		boolean flag=true;
		while(flag) {
			System.out.println("/\\/\\/\\/\\/\\/\\学生管理系统/\\/\\/\\/\\/\\/\\/\\/\\");
			System.out.println("*-*-*-*-*-*-*1、新增学生信息*-*-*-*-*-*-*");
			System.out.println("*-*-*-*-*-*-*2、查询学生信息*-*-*-*-*-*-*");
			System.out.println("*-*-*-*-*-*-*3、修改学生信息*-*-*-*-*-*-*");
			System.out.println("*-*-*-*-*-*-*4、删除学生信息*-*-*-*-*-*-*");
			System.out.println("*-*-*-*-*-*-*0、退出系统*-*-**-*-*-*-*-*-*");
			System.out.print("——请输入您的选择——：");
			//选择操作
			String choise = s.nextLine();
			if(choise.equals("0")) {
				System.out.println("您走好！");
				break;
			}
			switch(choise) {
				case "1":
					//新增
					Student student=new Student(s,stuList);
					student = stu.addStu(student);
					stuList.put(student.getStuNumber(), student);
					break;
				case "2":
					//查询
					stu.showStudent();
					break;
				case "3":
					//修改
					stu.changeStu();
					break;
				case "4":
					//删除
					String removeStuNumber = stu.removeStu();
					if(removeStuNumber!="") {
						stuList.remove(removeStuNumber);
					}
					break;
				default :
					System.out.println("您输入的指令不正确！");
			}					
		}
	}
}
