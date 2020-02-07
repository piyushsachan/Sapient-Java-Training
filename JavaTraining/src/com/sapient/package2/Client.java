package com.sapient.package2;
import com.sapient.package1.PublicClass;

public class Client extends PublicClass {
	public static void main(String[] args){
		Client client = new Client();
		client.publicMethod();
		client.protectedMethod();
	}

}
