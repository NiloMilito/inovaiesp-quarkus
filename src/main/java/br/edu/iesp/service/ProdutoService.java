package br.edu.iesp.service;


import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.edu.iesp.model.Produto;
import br.edu.iesp.repository.ProdutoRepository;

@ApplicationScoped
public class ProdutoService {
	
	@Inject
	private ProdutoRepository produtoRepository;

	@Transactional
    public Produto salvar(Produto produto){
        return produtoRepository.save(produto);
    }
    
    public Produto atualizar(Produto produto) {
    	return produtoRepository.save(produto);
    }
    
    public void remover(Long id) {
    	this.produtoRepository.deleteById(id);
    }
    
    public List<Produto> listar() {
    	return this.produtoRepository.findAll();
    }

    public Produto consultar(Long id) {
    	return this.produtoRepository.findById(id).get();
    }
    
    public List<Produto> consultar(String nome) {
    	return this.produtoRepository.findByNomeLikeIgnoreCase(nome);
    }

}
