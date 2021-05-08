package com.lucascoutinho.rest;

import model.Endereco;
import servicocep.ServicoCep;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cep")
public class CepResource {
    @Inject
    ServicoCep service;

    @GET
    @Path("{cep}")
    @Produces(MediaType.APPLICATION_JSON)
    public Endereco getEndereco(@PathParam("cep") String cep) {
        return service.buscarEndereco(cep);

    }
}