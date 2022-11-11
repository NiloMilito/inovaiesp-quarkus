package br.edu.iesp.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.iesp.model.Aluno;

@Path("/aluno")
public class AlunoResouce {
	
	
	
	@GET
	public String nomeAluno() {
		return "Danilo Pereira";
	}
	
	@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Aluno incluir(Aluno aluno) {
        return produtoService.salvar(produto);
    }

}
