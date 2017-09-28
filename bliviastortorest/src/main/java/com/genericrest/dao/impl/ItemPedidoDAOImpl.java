/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.ItemPedidoDAO;
import com.genericrest.model.ItemPedido;
import java.util.List;
import javax.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author BliStorto
 */
public class ItemPedidoDAOImpl extends GenericDAO<ItemPedido, Long> implements ItemPedidoDAO{
    
    private static final Logger LOG =  LoggerFactory.getLogger(ItemPedidoDAOImpl.class);

    public ItemPedidoDAOImpl() {
        super(ItemPedido.class);
    }

    public List<ItemPedido> findByName(String name) {
        Query query = getEntityManager().createNamedQuery("ItemPedido.findByName", ItemPedido.class);
        query.setParameter("name", name);

        List<ItemPedido> itenspedido = query.getResultList();
        if (itenspedido== null || itenspedido.isEmpty()) {
            return null;
        } else {
            return (List<ItemPedido>) itenspedido;
        }
    }

    @Override
    public org.slf4j.Logger getLogger() {
        return (org.slf4j.Logger) LOG;
    }
    
}
