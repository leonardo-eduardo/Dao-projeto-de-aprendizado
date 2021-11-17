package Aplication;


import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	
	
	
	public static void main(String[] args) {

		Department s1 = new Department(1, "Books");
		
		Seller s2 = new Seller(1, "João", "joao@gmail.com", new Date(), 2580.00, s1);
		
		System.out.println(s2.toString());
				
	}

}
