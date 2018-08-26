package com.schoolofnet.javaNative.public_code;

import com.schoolofnet.javaNative.Info;

//@Info(createBy = "Malcher Jr.")
@Info
public class PublicCode {

	public PublicCode() {
		System.out.println("Publico");
	}
	public void publicoMetodo() {
		System.out.println("Método publicio");
	}
	
	@Override
	public String toString() {
		return "Public_code class to String";
	}

}
