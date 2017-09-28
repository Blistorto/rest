/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.ProdutoDAO;
import com.genericrest.model.Produto;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.ProdutoService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Blistorto
 */
public class ProdutoServiceImpl extends GenericCRUDRestService<Produto> implements ProdutoService {

    private static final Logger LOG = LoggerFactory.getLogger(ProdutoServiceImpl.class);
    
    @Inject
    private ProdutoDAO produtoDAO;
    
    public ProdutoServiceImpl() {
        super(Produto.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Produto> list) {
        return new GenericEntity<List<Produto>>(list){};
    }

    /**
     *
     * @return
     */
    @Override
    public DAO getDao() {
        return produtoDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

    public Response getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  

    
    
}
