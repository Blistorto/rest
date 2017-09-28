/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.ProdutoDAO;
import com.genericrest.model.Produto;
import java.util.List;
import javax.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author BliStorto
 */
public class ProdutoDAOImpl extends GenericDAO<Produto, Long> implements ProdutoDAO{
    
    private static final Logger LOG =  LoggerFactory.getLogger(ProdutoDAOImpl.class);

    public ProdutoDAOImpl() {
        super(Produto.class);
    }

    @Override
    public List<Produto> findByName(String name) {
        Query query = getEntityManager().createNamedQuery("Produto.findByName", Produto.class);
        query.setParameter("name", name);

        List<Produto> produtos = query.getResultList();
        if (produtos== null || produtos.isEmpty()) {
            return null;
        } else {
            return (List<Produto>) produtos;
        }
    }

    @Override
    public org.slf4j.Logger getLogger() {
        return (org.slf4j.Logger) LOG;
    }
    
}
