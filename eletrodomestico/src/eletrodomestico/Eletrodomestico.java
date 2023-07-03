package eletrodomestico;

public abstract class Eletrodomestico {
	private boolean ligado ;
	private Integer voltagem;
	
	
	public abstract void ligar();
	public abstract void desligar();
	
	
	  public Eletrodomestico(boolean ligado, Integer voltagem) {
	        this.setLigado(ligado);
	        this.setVoltagem (voltagem);
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


