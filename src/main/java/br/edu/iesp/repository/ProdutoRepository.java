package br.edu.iesp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.iesp.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	List<Produto> findByNomeLikeIgnoreCase(String nome);

}
