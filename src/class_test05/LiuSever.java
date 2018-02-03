package class_test05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
//服务器端（无多线程），遵循TCP协议
public class LiuSever {
	public static void main(String[] args) throws IOException {
		ServerSocket sever=new ServerSocket(9999);//创建服务，9999为端口号
		Socket socket = sever.accept();//等待客户端的链接（如果没有接到连接，则线程阻塞），连接成功返回与客户端对应的socket
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
		sever.close();
	}
}
