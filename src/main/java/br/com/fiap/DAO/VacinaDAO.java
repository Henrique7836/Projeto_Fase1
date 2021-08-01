package fiap.vacinacao.dao;
import javax.persistence.EntityManager;

import fiap.vacinacao.model.Vacina;

public class VacinaDAO extends GenericDAO<Vacina, Integer> {

	public VacinaDAO(EntityManager emp) {
		super(emp);
		// TODO Auto-generated constructor stub
	}

}
