/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.PedidoDAO;
import com.genericrest.model.Pedido;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.PedidoService;
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
public class PedidoServiceImpl extends GenericCRUDRestService<Pedido> implements PedidoService {

    private static final Logger LOG = LoggerFactory.getLogger(PedidoServiceImpl.class);
    
    @Inject
    private PedidoDAO pedidoDAO;
    
    public PedidoServiceImpl() {
        super(Pedido.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Pedido> list) {
        return new GenericEntity<List<Pedido>>(list){};
    }

    @Override
    public DAO getDao() {
        return pedidoDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

    public Response getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  

   
    
}
