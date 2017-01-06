package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.Before;
import org.junit.Test;

import qrcode.QRCodeUtil;

public class QRCodeUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEncode() throws FileNotFoundException, Exception {
		String dir = "C:/Users/Rex/Desktop/1.jpg";
		String content = "https://www.baidu.com";
		String logoImgPath = "C:/Users/Rex/Desktop/logo.jpg";
		File file = new File(dir);
	
//		QRCodeUtil.encode(content, new FileOutputStream(file));
		
//		QRCodeUtil.encode(content, dir);
		
//		QRCodeUtil.encode(content, logoImgPath, dir, false);
//		QRCodeUtil.encode(content, logoImgPath, dir, true);
		
//		QRCodeUtil.encode(content, logoImgPath, new FileOutputStream(file), false);
		QRCodeUtil.encode(content, logoImgPath, new FileOutputStream(file), true);
	}

}
