package fiap.vacinacao.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_vacina")

public class Vacina {
	
	public Vacina(int id, List<PontosVacinacao> pontos, String nome, Date vencimento, String lote) {
		super();
		this.id = id;
		this.pontos = pontos;
		this.nome = nome;
		this.vencimento = vencimento;
		this.lote = lote;
	}

	public Vacina() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name="id_vacina")
	@SequenceGenerator(name="codvac", sequenceName="sq_tb_codvac", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="codvac")
	private int id;
	
	@ManyToMany
	@JoinTable(joinColumns=@JoinColumn(name="id_vacina"), inverseJoinColumns=@JoinColumn(name="id_ponto_vacinacao"), name="tb_vacina_ponto")
	private List<PontosVacinacao> pontos;
	
	@Column(name="nome_vacina")
	private String nome;
	
	@Column(name="vencimento_vacina")
	private Date vencimento;
	
	@Column(name="lote_vacina")
	private String lote;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<PontosVacinacao> getPontos() {
		return pontos;
	}

	public void setPontos(List<PontosVacinacao> pontos) {
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

}
