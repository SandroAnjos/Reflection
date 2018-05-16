package br.com.edlika.reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Car {
	@Executar("T-cor")
	String cor = "Prata";
	@Executar("T-chassis")
	int chassis;

	public Car() {

		this.cor = cor;
		this.chassis = chassis;

	}

	@Executar("Pinta cor veiculo ")
	public String pintarCor(String cor) {

		String receberCor = cor;
		this.cor = receberCor;
		return receberCor;
	}

	@Executar("numero de Chassis")
	@SuppressWarnings("resource")
	public int chassisRegistrar(int numeroChassis) throws IOException {
		int reg ;
		Scanner sc = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entre com o valor");
		try {
			reg =sc.nextInt();
			numeroChassis=reg;
			chassis = reg;
			chassis = getmostraChassis(chassis);
			

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

		

		return 	chassis;// chassisRegistrar(chassis);
	}

	int getmostraChassis(int c) {
		int ver=0;
		ver=c;
	
		System.out.println("numero chassis "+ver );
	
		
			return ver;
	}
	
}
