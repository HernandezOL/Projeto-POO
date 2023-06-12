package com.AppRh.AppRh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.AppRh.AppRh.models.Dependente;
import com.AppRh.AppRh.models.Funcionario;

public interface DependenteRepository extends CrudRepository<Dependente, Long> {

	Iterable<Dependente> findByFuncionario(Funcionario funcionario);

	// pensando no método delete
	Dependente findByCpf(String cpf);

	Dependente findById(long id);

	// criado para implementar
	List<Dependente> findByNome(String nome);

	// para a busca
	@Query(value = "select u from Dependente u where u.nome like %?1%")
	List<Dependente> findByNomesDependentes(String nome);

}
