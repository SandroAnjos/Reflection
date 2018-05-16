package br.com.edlika.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class PricipalCar {

	public static void main(String[] args) {

		Class<Car> mycar = Car.class;
		Field[] fields = mycar.getDeclaredFields();

		for (Field field : fields) {

			System.out.println("Atributos ==>" + field.getType() + " " + field.getName());

		}

		Method[] metodos = mycar.getDeclaredMethods();

		for (Method method : metodos) {
			System.out.println("metodos==>" + method.getName() + " " + method.getGenericReturnType()
					+ Arrays.toString(method.getParameters()));

		}
		System.out.println();
		Car carro = new Car();
	

		Method criarCar = null;
		try {
			criarCar = mycar.getDeclaredMethod("pintarCor", String.class);
		} catch (NoSuchMethodException e1) {

			e1.printStackTrace();
		} catch (SecurityException e1) {

			e1.printStackTrace();
		}
		try {
			criarCar.invoke(carro, "Azul");
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (IllegalArgumentException e) {

			e.printStackTrace();
		} catch (InvocationTargetException e) {

			e.printStackTrace();
		}

		@SuppressWarnings("unused")
		Method criarCarro1 = null;

		try {
			criarCarro1 = mycar.getDeclaredMethod("chassisRegistrar", int.class);
			try {
	
				criarCarro1.invoke(carro,0);

			} catch (IllegalAccessException e) {

				e.printStackTrace();
			} catch (IllegalArgumentException e) {

				e.printStackTrace();
			} catch (InvocationTargetException e) {

				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {

			e.printStackTrace();
		} catch (SecurityException e) {

			e.printStackTrace();
		}

	}

}
