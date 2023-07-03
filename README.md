//exemplo_Pratico_da_Classe_-Abstrada_Java
 //ABSTRAÇÃO(JAVA)......
 // estou com erro no codigo ate momento nao conseguir entender .

// codigo com erro!

 package eletrodomestico;

public abstract class Eletrodomestico {
	private boolean ligado ;
	private Integer voltagem;
	
	
	public abstract void ligar();
	public abstract void desligar();
	
	
	  public Eletrodomestico(boolean ligado, Integer voltagem) {
	        this.setLigado(ligado);
	        this.setVoltagem(voltagem); // essa linha no código retonando erro
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




// codigo completo


package eletrodomestico;

public class aplicacaoAbstrada {

	public static void main(String[] args) {
		//Instancia a classe Radio
				Radio radio1 = new Radio(110);

		       //*
		        //* chamando os métodos abstratos implementados
		        //* dentro de cada classe ( Radio)
		        
		     
		        radio1.ligar();
		        System.out.print("e o Rádio está ");
		        System.out.println(radio1.isLigado() ? "ligado." : "desligado.");
			
	}

}
	

package eletrodomestico;

public class  Radio extends Eletrodomestico {
	//sub-classe (classe estendida):

		//atributos...
		public static final short AM = 1;
	    public static final short FM = 2;
	    private int banda;
	    private float sintonia;
	    private int volume;

	    //metodos do classe Radio...
	    //metodo construtor...
	    public Radio(int voltagem) {
	        super(true, voltagem);
	        setBanda(Radio.FM);
	        setSintonia(0);
	        setVolume(0);
	    }

	    //@return the banda
		public int getBanda() {
			return banda;
		}

		//@param banda the banda to set
		public void setBanda(int banda) {
			this.banda = banda;
		}

		//@return the sintonia
		public float getSintonia() {
			return sintonia;
		}

		//@param sintonia the sintonia to set
		public void setSintonia(float sintonia) {
			this.sintonia = sintonia;
		}

		//@return the volume
		public int getVolume() {
			return volume;
		}

		//@param volume the volume to set
		public void setVolume(int volume) {
			this.volume = volume;
		}


		//implementação dos métodos abstratos
	    public void desligar() {
	        super.setLigado(false);
	        setSintonia(0);
	        setVolume(0);
	    }

	    public void ligar() {
	        super.setLigado(true);
	        setSintonia(88.1f);
	        setVolume(25);
	    }

	    //abaixo teríamos todos os métodos construtores (get e set)...
	    
	}
}

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





