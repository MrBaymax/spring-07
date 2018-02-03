package class_test06;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
//服务器端（多线程），遵循TCP协议
public class LiuSever {
	public static void main(String[] args) throws IOException {
		ServerSocket sever=new ServerSocket(9999);//创建服务，9999为服务的端口号
		while(true) {//请求轮询
			Socket socket = sever.accept();//在等待连接时线程阻塞，不会无休止的循环，接到连接请求才会执行下面的代码
			Runnable r= new LiuSeverThread(socket);
			Thread t=new Thread(r);
			t.start();
		}
	}
}
