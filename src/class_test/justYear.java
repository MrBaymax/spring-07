package class_test;
//判断闰年还是平年
public class justYear {
	public static void main(String[] args) {
		int year=2000;
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.println(year+"是闰年");
		}else {
			System.out.println(year+"是平年");
		}
	}
}
