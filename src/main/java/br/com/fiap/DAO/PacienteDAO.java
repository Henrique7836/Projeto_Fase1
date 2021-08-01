package fiap.vacinacao.dao;

import javax.persistence.EntityManager;

import fiap.vacinacao.model.Paciente;

public class PacienteDAO extends GenericDAO<Paciente, Integer> {

	public PacienteDAO(EntityManager emp) {
		super(emp);
	}

}
