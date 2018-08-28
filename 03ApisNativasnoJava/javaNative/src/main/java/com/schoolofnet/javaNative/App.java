package com.schoolofnet.javaNative;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;*/
//import java.io.IOException;
//import com.schoolofnet.javaNative.default_code.DefaultCode;
//import com.schoolofnet.javaNative.private_code.PrivateCode;
//import com.schoolofnet.javaNative.protected_code.ProtectedCode
//import com.schoolofnet.javaNative.public_code.PublicCode;
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Annotation;

public class App {
	public static void main(String[] args) {

		// new PublicCode();
		// new PrivateCode();
		// New ProtectedCode();
		// new DefaultCode();

		// Object obj = new Object();
		// PublicCode pub = new PublicCode();
		//
		// System.out.println(obj.toString());
		// System.out.println(pub.toString());

		/*
		 * Integer one = 0; int two = 0;
		 * 
		 * Double d1 = 0.0; String str = d1.toString();
		 */
		/*
		 * Class<PublicCode> obj = PublicCode.class;
		 * if(obj.isAnnotationPresent(Info.class)) { Info annotation =
		 * obj.getAnnotation(Info.class); Info info = (Info) annotation;
		 * System.out.println(info.createBy()); }
		 */
		/*
		 * try { File arquvio = new File("teste.txt"); if(arquvio.createNewFile()) {
		 * System.out.println("Arquivo Criado"); }else {
		 * System.out.println("Arquivo já existe!"); } } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
/*
		File file;
		FileOutputStream fop = null;
		
		BufferedReader br = null;
		FileInputStream fis = null;
		BufferedInputStream bis = null;

		try {
			file = new File("Teste.txt");
			if (file.createNewFile()) {
				System.out.println("Arquivo Criado");
			} else {
				System.out.println("Arquivo já existe");
			}
			fop = new FileOutputStream(file);

			if (!file.exists()) {
				file.createNewFile();
			}

			String text = "Olá, Meu nome é José Stélio Malcher Jr. ";

			byte[] textBytes = text.getBytes();

			fop.write(textBytes);
			fop.flush();
			fop.close();

			System.out.println("FEITO!");
			
			// Leitura do arquivo
			System.out.println("Preparando para Ler");
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			
			while(dis.available() != 0) {
				System.out.println(dis.readLine());
			}
			fis.close();
			bis.close();
			dis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
*/
		/*try {
			String currentLine;
			br = new BufferedReader(new FileReader("Teste.txt"));
			while ((currentLine = br.readLine()) != null) {
				System.out.println(currentLine);
			}
			if (br != null) {
				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}*/

		/*List<String> list = new ArrayList<String>();
		list.add(0,"Jose");
		list.add(1,"Malcher");
		list.add(2,"Jr.");
		*/
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "José");
		map.put(1, "malcher");
		map.put(2, "Jr.");
		System.out.println(map.toString());
		System.out.println(map.values());
		
	}
}
