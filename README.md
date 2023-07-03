# exemplo_Pratico_da_Classe_-Abstrada_Java
- ABSTRAÇÃO(JAVA)........implementado em Java, a classe abstrata Eletrodoméstico a qual será instanciada por outra classe filha (classe estendida):

- // estou com erro no codigo ate momento nao conseguir entender .

- codigo com erro!

- package eletrodomestico;

public abstract class Eletrodomestico {
	private boolean ligado ;
	private Integer voltagem;
	
	
	public abstract void ligar();
	public abstract void desligar();
	
	
	  public Eletrodomestico(boolean ligado, Integer voltagem) {
	        this.setLigado(ligado);
	        this.setVoltagem (voltagem); // essa linha no esta retonando erro
	 }
	
	 public int getDesligado() {
	        return this.voltagem ;
	}
	 public void setLigado(boolean ligado) {
	        this.ligado = ligado;
	}
	
	public boolean isLigado() {
        return ligado;
    }
	
}

