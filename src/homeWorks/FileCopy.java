package homeWorks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//文件复制
public class FileCopy {

	public static void main(String[] args) throws IOException {
		File old_file=new File("F:\\迅雷下载\\Neuedu.rar");
		String file_name=old_file.getName();
		File new_file=new File("F:\\Work\\东软睿道培训\\Java12班\\Masterpieces\\"+file_name);
		InputStream is_old=new FileInputStream(old_file);
		byte[] b=new byte[(int)old_file.length()];
		is_old.read(b);
		OutputStream os_new=new FileOutputStream(new_file);
		os_new.write(b);
		is_old.close();
		os_new.close();
		System.out.println("复制成功！！");
	}

}
