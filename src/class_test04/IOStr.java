package class_test04;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
//IO流
public class IOStr {
	public static void main(String[] args) throws IOException {
		File file=new File("F:\\Work\\东软睿道培训\\Java12班\\Masterpieces\\Neuedu\\123.html");
		/*boolean exists = file.exists();
		boolean is = file.isFile();
		String fName = file.getName();
		String parent = file.getParent();	
		System.out.println(fName);
		String absolutePath = file.getAbsolutePath();
		boolean createNewFile = file.createNewFile();
		System.out.println(createNewFile);
		boolean mkdir = file.mkdir();
		System.out.println(mkdir);*/
	/*	InputStream iss=new FileInputStream(file);
		byte[] b=new byte[(int) file.length()];
		iss.read(b);
		System.out.println(new String(b));*/
		/*Reader reader=new FileReader(file);
		char[] c=new char[(int) file.length()];
		reader.read(c);
		reader.close();
		System.out.println(new String(c));*/
	/*	OutputStream os=new FileOutputStream(file,true);
		String abc="12348548945454564654555555555";
		byte[] b = abc.getBytes();
		os.write(b);
		os.close();*/
		/*Writer wr=new FileWriter(file,true);
		wr.write("111111111111");
		wr.close();*/
		/*InputStream in = new FileInputStream(file);
		InputStreamReader isr=new InputStreamReader(in);	*/
		
	}
}
