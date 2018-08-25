package com.schoolofnet.javaNative.private_code;

public class PrivateCode {

	public PrivateCode() {
		System.out.println("Public método em PrivateCode");
		metodoPrivado();
	}
	private void metodoPrivado() {
		System.out.println("Privado método (método privado)");
	}

}
