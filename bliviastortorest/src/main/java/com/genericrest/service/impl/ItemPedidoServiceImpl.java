/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.ItemPedidoDAO;
import com.genericrest.model.ItemPedido;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.ItemPedidoService;
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
public class ItemPedidoServiceImpl extends GenericCRUDRestService<ItemPedido> implements ItemPedidoService {

    private static final Logger LOG = LoggerFactory.getLogger(ItemPedidoServiceImpl.class);
    
    @Inject
    private ItemPedidoDAO itempedidoDAO;
    
    public ItemPedidoServiceImpl() {
        super(ItemPedido.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<ItemPedido> list) {
        return new GenericEntity<List<ItemPedido>>(list){};
    }

    @Override
    public DAO getDao() {
        return itempedidoDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

    public Response getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  

   
}
