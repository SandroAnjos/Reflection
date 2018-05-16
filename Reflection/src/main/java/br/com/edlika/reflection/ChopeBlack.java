package br.com.edlika.reflection;

public class ChopeBlack implements Bebida {

	float ml = (float) 500, medida;
	boolean vazio;

	public void prepararBebida() {
		System.out.println("Chope Black preparado");

	}

	public void setCop(float cp, int tipo) {

	}

	@SuppressWarnings("unused")
	public float getCopo(float copo, int ml) {
		medida = this.ml;
		boolean checklist;
		checklist = isVazio(ml);
		boolean verifica = true;
		if (checklist == true) {
			medida = manipular(medida, checklist);
			System.out.println("chope de 500 ml");

		} else {

			medida = manipular(medida, checklist);
			System.out.println("chope de 300 ml" + medida);
		}

		return medida;
	}

	private float manipular(float ml, boolean ch) {
		float soma;
		if (ch == true) {
			soma = ml * (float) 6.90;
			ml = soma;
			return ml;
		}
		soma = ml * (float) 4.90;
		ml = soma;
		return ml;

	}

	boolean isVazio(int ml) {
		if (ml >= 1) {
			return true;
		}
		return false;
	}

}
