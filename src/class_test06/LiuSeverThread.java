package class_test06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class LiuSeverThread implements Runnable {
	private Socket socket;
	public LiuSeverThread(Socket socket) {
		this.socket=socket;
	}
	public void run(){	
		try {
			InputStream is = socket.getInputStream();//获得通道的输入流（字节流）
			InputStreamReader isr=new InputStreamReader(is);//把字节流转换成字符流
			BufferedReader br=new BufferedReader(isr);//把字节流套用一个BufferedReader，使其可以按行读取；
			String readLine = br.readLine();//readLine返回值为String类型
			while(readLine!=null) {//循环获取按行读取并输出
				System.out.println("客户端传来:"+readLine);
				readLine=br.readLine();
			}
			isr.close();
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
