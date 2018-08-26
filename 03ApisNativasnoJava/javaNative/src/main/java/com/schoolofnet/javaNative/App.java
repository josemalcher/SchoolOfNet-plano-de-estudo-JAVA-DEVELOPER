package com.schoolofnet.javaNative;

//import com.schoolofnet.javaNative.default_code.DefaultCode;
import com.schoolofnet.javaNative.private_code.PrivateCode;
import com.schoolofnet.javaNative.protected_code.ProtectedCode;
import com.schoolofnet.javaNative.public_code.PublicCode;

public class App {
	public static void main(String[] args) {

		new PublicCode();
		new PrivateCode();
		
		new ProtectedCode();
		//new DefaultCode();

	}
}
