package bank;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Entrance {
	public static void main(String[] args){
		Map<String,Card> cardList=new HashMap<String, Card>();
		Scanner s=new Scanner(System.in);
		Card card=new Card(s,cardList);
		boolean flag=true;
		while(flag) {
			System.out.println("/\\/\\/\\我家银行管理系统/\\/\\/\\/\\/\\");
			System.out.println("*-*-*-*-*-*-*1、开户*-*-*-*-*-*-*");
			System.out.println("*-*-*-*-*-*-*2、存款*-*-*-*-*-*-*");
			System.out.println("*-*-*-*-*-*-*3、取款*-*-*-*-*-*-*");
			System.out.println("*-*-*-*-*-*-*4、转账*-*-*-*-*-*-*");
			System.out.println("*-*-*-*-*-*-*0、退出*-*-**-*-*-*-*");
			System.out.print("——请输入您的选择——：");
			//选择操作
			String choise = s.nextLine();
			if(choise.equals("0")) {
				System.out.println("您走好！");
				break;
			}
			switch(choise) {
				case "1":
					//开户
					Card ca=new Card(s,cardList);
					ca = card.addCard(ca);
					cardList.put(ca.getCardNum(),ca);
					break;
				case "2":
					//存款
					card.saveMoney();
					break;
				case "3":
					//取款
					card.drawMoney();
					break;
				case "4":
					//转账
					card.trasfer();
					break;
				default :
					System.out.println("您输入的指令不正确！");
			}					
		}
	}
}
