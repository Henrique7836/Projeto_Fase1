package fiap.vacinacao.dao;

import javax.persistence.EntityManager;

import fiap.vacinacao.model.PontosVacinacao;


public class PontosVacinacaoDAO extends GenericDAO<PontosVacinacao, Integer> {

	public PontosVacinacaoDAO(EntityManager emp) {
		super(emp);
	}

}
