package fiap.vacinacao.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="tb_paciente")

public class Paciente {
	
	public Paciente(int id, Vacina vacina, PontosVacinacao pontoVacinacao, String nome, Date dataNascimento,
			String endereco, int dose, Date dataVacinacao, String telefone, String nomePai, String nomeMae,
			String genero, String cpf, boolean isGrupoPrioritario) {
		this.id = id;
		this.vacina = vacina;
		this.pontoVacinacao = pontoVacinacao;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.dose = dose;
		this.dataVacinacao = dataVacinacao;
		this.telefone = telefone;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.genero = genero;
		this.cpf = cpf;
		this.isGrupoPrioritario = isGrupoPrioritario;
	}

	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name="id_paciente")
	@SequenceGenerator(name="codpac", sequenceName="sq_tb_codpac", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="codpac")
	private int id;
	
	@OneToOne
	@JoinColumn(name="id_vacina")
	private Vacina vacina;
	
	@ManyToOne
	@JoinColumn(name="id_ponto_vacinacao", nullable=true)
	private PontosVacinacao pontoVacinacao;
	
	@Column(name="nome_paciente", nullable=true)
	private String nome;
	
	@Column(name="dt_nascimento_paciente", nullable=true)
	private Date dataNascimento;
	
	@Column(name="endereco_paciente")
	private String endereco;
	
	@Column(name="qtd_dose")
	private int dose;
	
	@Column(name="dt_vacinacao")
	private Date dataVacinacao;
	
	@Column(name="telefone_paciente")
	private String telefone;
	
	@Column(name="nome_pai")
	private String nomePai;
	
	@Column(name="nome_mae")
	private String nomeMae;
	
	@Column(name="genero_paciente")
	private String genero;
	
	@Column(name="cpf_paciente")
	private String cpf;
	
	@Column(name="grupo_prioritario")
	private boolean isGrupoPrioritario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vacina getVacina() {
		return vacina;
	}

	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}

	public PontosVacinacao getPontoVacinacao() {
		return pontoVacinacao;
	}

	public void setPontoVacinacao(PontosVacinacao pontoVacinacao) {
		this.pontoVacinacao = pontoVacinacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getDose() {
		return dose;
	}

	public void setDose(int dose) {
		this.dose = dose;
	}

	public Date getDataVacinacao() {
		return dataVacinacao;
	}

	public void setDataVacinacao(Date dataVacinacao) {
		this.dataVacinacao = dataVacinacao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isGrupoPrioritario() {
		return isGrupoPrioritario;
	}

	public void setGrupoPrioritario(boolean isGrupoPrioritario) {
		this.isGrupoPrioritario = isGrupoPrioritario;
	}

	
	

}
