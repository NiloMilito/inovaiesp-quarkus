package br.edu.iesp.resource;

import br.edu.iesp.model.Produto;
import br.edu.iesp.service.ProdutoService;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/produto")
public class ProdutoResource {

    @Inject
    private ProdutoService produtoService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Produto> listar() {
        return produtoService.listar();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response incluir(Produto produto) {
        return Response.ok(produtoService.salvar(produto)).build();
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response atualizar(Produto produto) {
    	return Response.ok(produtoService.atualizar(produto)).build();
    }
        
    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response delete(@PathParam("id") Long id) {
    	produtoService.remover(id);
    	return Response.ok().build();
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response consultar(@PathParam("id") Long id) {
        return Response.ok(this.produtoService.consultar(id)).build();
    }
    
    @GET
    @Path("/nome/{nome}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response consultar(@PathParam("nome") String nome) {
        return Response.ok(this.produtoService.consultar(nome)).build();
    }
    
    
}