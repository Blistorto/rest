/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.PedidoDAO;
import com.genericrest.model.Pedido;
import java.util.List;
import javax.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author BliStorto
 */
public class PedidoDAOImpl extends GenericDAO<Pedido, Long> implements PedidoDAO{
    
    private static final Logger LOG =  LoggerFactory.getLogger(PedidoDAOImpl.class);

    public PedidoDAOImpl() {
        super(Pedido.class);
    }

    public List<Pedido> findByName(String name) {
        Query query = getEntityManager().createNamedQuery("Pedido.findByName", Pedido.class);
        query.setParameter("name", name);

        List<Pedido> pedidos = query.getResultList();
        if (pedidos== null || pedidos.isEmpty()) {
            return null;
        } else {
            return (List<Pedido>) pedidos;
        }
    }

    @Override
    public org.slf4j.Logger getLogger() {
        return (org.slf4j.Logger) LOG;
    }
    
}
