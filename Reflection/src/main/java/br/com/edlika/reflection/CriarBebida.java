package br.com.edlika.reflection;

import java.io.File;
import java.util.Scanner;

public class CriarBebida {
	@SuppressWarnings("unused")
	public static void main(String [] args) throws Exception{
		//read file
		String className=null;
		try( Scanner sc= new Scanner(new File("ManipularBebidas.txt"))){
		 className=sc.nextLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		@SuppressWarnings("unchecked")
		Class<Bebida>bebidaclass=(Class<Bebida>) Class.forName(className);
		Bebida bebida=bebidaclass.getConstructor().newInstance();
		bebida.prepararBebida();
		
	 
		
	}
}
