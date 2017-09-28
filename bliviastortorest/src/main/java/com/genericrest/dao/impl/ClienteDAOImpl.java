/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.ClienteDAO;
import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Cliente;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author BliStorto
 */
@ApplicationScoped
public class ClienteDAOImpl extends GenericDAO<Cliente, Long> implements ClienteDAO{
    
    private static final Logger LOG =  LoggerFactory.getLogger(ClienteDAOImpl.class);

    public ClienteDAOImpl() {
        super(Cliente.class);
    }

    @Override
    public List<Cliente> findByName(String name) {
        Query query = getEntityManager().createNamedQuery("Cliente.findByName", Cliente.class);
        query.setParameter("name", name);

        List<Cliente> clientes = query.getResultList();
        if (clientes == null || clientes.isEmpty()) {
            return null;
        } else {
            return (List<Cliente>) clientes;
        }
    }

    @Override
    public org.slf4j.Logger getLogger() {
        return (org.slf4j.Logger) LOG;
    }

 
}
