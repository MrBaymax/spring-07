package bank;
import java.util.Map;
import java.util.Scanner;
public class Card {
	private String cardNum;
	private String name;
	private Double balance;
	private Map<String,Card> cardList;
	private Scanner s;
	private Integer count=1;
	public Card() {
		
	}
	public Card(Scanner s,Map<String,Card> cardList) {
		this.s=s;
		this.cardList=cardList;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	//开户
	public Card addCard(Card card) {
	System.out.print("——请输入姓名——：");
	card.setName(s.nextLine());
	String cardNumber="621700260022000"+count++;
	card.setCardNum(cardNumber);
	System.out.println("——您的卡号是——："+cardNumber);
	System.out.println("——您的账户余额是——：￥0.0元");
	card.setBalance(0.0);
	System.out.println("账户创建成功！");
	return card;
}
//存款
public void saveMoney() {
	System.out.print("——请输入您的银行卡号——：");
	String cardNumber = s.nextLine();
	while(!cardList.containsKey(cardNumber)) {
		System.out.print("——您输入的银行卡号不存在,请重新输入——：");
		cardNumber = s.nextLine();
	}
	System.out.print("——请输入您存入的金额——：");
	double save = Double.parseDouble(s.nextLine());
	double newBalance=cardList.get(cardNumber).getBalance()+save;
	cardList.get(cardNumber).setBalance(newBalance);
	System.out.println("—操作成功！—");
	System.out.println("——您当前账户余额为：￥"+cardList.get(cardNumber).getBalance()+"元");
}
//取款
public void drawMoney() {
	System.out.print("——请输入您的银行卡号——：");
	String cardNumber = s.nextLine();
	while(!cardList.containsKey(cardNumber)) {
		System.out.print("——您输入的银行卡号不存在,请重新输入——：");
		cardNumber = s.nextLine();
	}
	System.out.println("——您当前账户余额为：￥"+cardList.get(cardNumber).getBalance()+"元");
	System.out.print("——请输入您取出的金额——：");
	double draw = Double.parseDouble(s.nextLine());
	while(draw>cardList.get(cardNumber).getBalance()) {
		System.out.print("——您输入的金额超过您的账户余额,请重新输入取款金额——：");
		draw = Double.parseDouble(s.nextLine());
	}
		double newBalance=cardList.get(cardNumber).getBalance()-draw;
		cardList.get(cardNumber).setBalance(newBalance);
		System.out.println("—操作成功！—");
		System.out.println("——您当前账户余额为：￥"+cardList.get(cardNumber).getBalance()+"元");
}
	//转账
	public void trasfer() {
		System.out.print("——请输入*_*您的*_*银行卡号——：");
		String mycardNumber = s.nextLine();
		while(!cardList.containsKey(mycardNumber)) {
			System.out.print("——您输入的银行卡号不存在,请重新输入——：");
			mycardNumber = s.nextLine();
		}
		System.out.print("——请输入*_*对方的*_*银行卡号——：");
		String hiscardNumber = s.nextLine();
		while(!cardList.containsKey(hiscardNumber)) {
			System.out.print("——您输入的银行卡号不存在,请重新输入——：");
			hiscardNumber = s.nextLine();
		}
		System.out.println("——您当前账户余额为：￥"+cardList.get(mycardNumber).getBalance()+"元");
		System.out.print("——请输入您的转账金额——：");
		double transfer = Double.parseDouble(s.nextLine());
		while(transfer>cardList.get(mycardNumber).getBalance()) {
			System.out.print("——您输入的金额超过您的账户余额,请重新输入转账金额——：");
			transfer = Double.parseDouble(s.nextLine());
		}
		while(transfer<0) {
			System.out.print("——您输入的金额格式不正确（小样，我想到这个bug了！）,请重新输入转账金额——：");
			transfer = Double.parseDouble(s.nextLine());
			while(transfer>cardList.get(mycardNumber).getBalance()) {
				System.out.print("——您输入的金额超过您的账户余额,请重新输入转账金额——：");
				transfer = Double.parseDouble(s.nextLine());
			}
		}
		double mynewBalance=cardList.get(mycardNumber).getBalance()-transfer;
		cardList.get(mycardNumber).setBalance(mynewBalance);
		double hisnewBalance=cardList.get(hiscardNumber).getBalance()+transfer;
		cardList.get(hiscardNumber).setBalance(hisnewBalance);
		System.out.println("—操作成功！—");
		System.out.println("——您当前账户余额为：￥"+cardList.get(mycardNumber).getBalance()+"元");
	}
}
