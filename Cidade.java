package attAlgo;

public class Cidade implements Comparable <Cidade>{

	private String nome;
	private int temp;
	
	public Cidade ( String nome, int tmp) {
		this.nome = nome;
		this.temp = tmp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	public int compareTo(Cidade c) {
		return this.nome.compareTo(c.getNome());
	}
}
