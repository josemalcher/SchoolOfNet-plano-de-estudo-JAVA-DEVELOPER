package com.schoolofnet.javaNative;

import java.io.File;
import java.io.FileOutputStream;
//import java.io.IOException;

//import com.schoolofnet.javaNative.default_code.DefaultCode;
//import com.schoolofnet.javaNative.private_code.PrivateCode;
//import com.schoolofnet.javaNative.protected_code.ProtectedCode
//import com.schoolofnet.javaNative.public_code.PublicCode;
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Annotation;

public class App {
	public static void main(String[] args) {

		//new PublicCode();
		//new PrivateCode();
		//New ProtectedCode();
		//new DefaultCode();
		
//		Object obj = new Object();
//		PublicCode pub = new PublicCode();
//		
//		System.out.println(obj.toString());
//		System.out.println(pub.toString());
		
		/*Integer one = 0;
		int two = 0;
		
		Double d1 = 0.0;
		String str = d1.toString();
		*/
		/*
		Class<PublicCode> obj = PublicCode.class;
		if(obj.isAnnotationPresent(Info.class)) {
			Info annotation = obj.getAnnotation(Info.class);
			Info info = (Info) annotation;
			System.out.println(info.createBy());
		}
		*/
		/*
		try {
			File arquvio = new File("teste.txt");
			if(arquvio.createNewFile()) {
				System.out.println("Arquivo Criado");
			}else {
				System.out.println("Arquivo já existe!");
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		File file;
		FileOutputStream fop = null;
		try {
			file = new File("Teste.txt");
			if(file.createNewFile()) {
				System.out.println("Arquivo Criado");
			}else {
				System.out.println("Arquivo já existe");
			}
			fop = new FileOutputStream(file);
			
			if(!file.exists()) {
				file.createNewFile();
			}
			
			String text = "Olá, Meu nome é José Stélio Malcher Jr. ";
			
			byte[] textBytes = text.getBytes();

			fop.write(textBytes);
			fop.flush();
			fop.close();
					
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

