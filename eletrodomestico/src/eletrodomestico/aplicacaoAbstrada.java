package eletrodomestico;

public class aplicacaoAbstrada {

	public static void main(String[] args) {
		//Instancia a classe Radio
				Radio radio1 = new Radio(110);

		        /*
		         * chamando os métodos abstratos implementados
		         * dentro de cada classe ( Radio)
		         */
		     
		        radio1.ligar();
		        System.out.print("e o Rádio está ");
		        System.out.println(radio1.isLigado() ? "ligado." : "desligado.");
			
	}

}
