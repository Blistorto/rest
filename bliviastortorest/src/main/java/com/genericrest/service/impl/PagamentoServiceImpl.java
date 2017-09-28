/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.PagamentoDAO;
import com.genericrest.model.Pagamento;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.PagamentoService;
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
public class PagamentoServiceImpl extends GenericCRUDRestService<Pagamento> implements PagamentoService {

    private static final Logger LOG = LoggerFactory.getLogger(PagamentoServiceImpl.class);
    
    @Inject
    private PagamentoDAO pagamentoDAO;
    
    public PagamentoServiceImpl() {
        super(Pagamento.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Pagamento> list) {
        return new GenericEntity<List<Pagamento>>(list){};
    }

    @Override
    public DAO getDao() {
        return pagamentoDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

    @Override
    public Response getByName(String descricao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}
