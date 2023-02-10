package entities;

public class Aluno {

	private Integer id;
	private String name;
	private Double notaProva1;
	private Double notaProva2;
	private Double notaTrabalho;

	public Aluno() {

	}

	public Aluno(Integer id, String name, Double notaProva1, Double notaProva2, Double notaTrabalho) {
		this.id = id;
		this.name = name;
		this.notaProva1 = notaProva1;
		this.notaProva2 = notaProva2;
		this.notaTrabalho = notaTrabalho;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getNotaProva1() {
		return notaProva1;
	}

	public void setNotaProva1(Double notaProva1) {
		this.notaProva1 = notaProva1;
	}

	public Double getNotaProva2() {
		return notaProva2;
	}

	public void setNotaProva2(Double notaProva2) {
		this.notaProva2 = notaProva2;
	}

	public Double getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNotaTrabalho(Double notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}

	public void mediaAluno() {
		double mediaAluno = ((this.notaProva1 * 2.5) + (this.notaProva2 * 2.5) + (this.notaTrabalho * 2) + (0)) / (2.5 + 2.5 + 2 + 2.5);
		System.out.println(mediaAluno);
	}
	

}
