package class_test05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端（无多线程）
public class LiuClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket=new Socket("10.25.130.161", 9999);//创建socket，参数为服务器端的地址和端口号
		OutputStream os=socket.getOutputStream();//获取socket中的输出流
		PrintStream ps=new PrintStream(os);//把输出流套用一个PrintStream，调用println()方法按行输出
		InputStreamReader isr=new InputStreamReader(System.in);//从控制台获取输入流
		BufferedReader br=new BufferedReader(isr);//把从控制台获取的输入流套用BufferedReader，按行读取
		String rl = br.readLine();
		while(rl!=null) {//循环读取控制台输入，并把输入内容按行写入输出流
			ps.println(rl);
			rl=br.readLine();
		}
		br.close();
		isr.close();
		ps.close();
		os.close();
		socket.close();		
	}
}
