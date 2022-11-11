package br.edu.iesp.service;

import javax.enterprise.context.ApplicationScoped;

import br.edu.iesp.model.Aluno;

@ApplicationScoped
public class AlunoService {
	
	 public AlunoService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno salvar(Aluno aluno){	      
	      return aluno;
	 }

}
