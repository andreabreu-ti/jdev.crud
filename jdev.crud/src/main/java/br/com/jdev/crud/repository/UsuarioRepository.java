package br.com.jdev.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.jdev.crud.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	/**
	 * Consulta JPQL customizada
	 * @param name
	 * @return
	 */
	@Query(value = "select u from Usuario u where trim(u.nome) like %?1%")
	List<Usuario> buscarPorNome(String name);
	
}
