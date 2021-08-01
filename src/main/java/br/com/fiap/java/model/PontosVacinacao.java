package fiap.vacinacao.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_pontos_vacinacao")

public class PontosVacinacao {
	
	public PontosVacinacao(int id, List<Vacina> vacinas, List<Paciente> pacientes, String endereco, String local) {
		this.id = id;
		this.vacinas = vacinas;
		this.pacientes = pacientes;
		this.endereco = endereco;
		this.local = local;
	}

	public PontosVacinacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name="id_ponto_vacinacao")
	@SequenceGenerator(name="codpontos", sequenceName="sq_tb_pontos_vacinacao", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="codpontos")
	private int id;
	
	
	@ManyToMany(mappedBy="pontos")
	private List<Vacina> vacinas;
	
	@OneToMany(mappedBy="pontoVacinacao")
	private List<Paciente> pacientes;
	
	@Column(name="endereco_ponto_vacinacao")
	private String endereco;
	
	@Column(name="tipo_ponto_vacinacao")
	private String local;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Vacina> getVacinas() {
		return vacinas;
	}

	public void setVacinas(List<Vacina> vacinas) {
		this.vacinas = vacinas;
	}

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	

}
