/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.PagamentoDAO;
import com.genericrest.model.Pagamento;
import java.util.List;
import javax.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author BliStorto
 */
public class PagamentoDAOImpl extends GenericDAO<Pagamento, Long> implements PagamentoDAO{
    
    private static final Logger LOG =  LoggerFactory.getLogger(PagamentoDAOImpl.class);

    public PagamentoDAOImpl() {
        super(Pagamento.class);
    }

    @Override
    public List<Pagamento> findByName(String name) {
        Query query = getEntityManager().createNamedQuery("Pagamento.findByName", Pagamento.class);
        query.setParameter("name", name);

        List<Pagamento> pagamentos = query.getResultList();
        if (pagamentos== null || pagamentos.isEmpty()) {
            return null;
        } else {
            return (List<Pagamento>) pagamentos;
        }
    }

    @Override
    public org.slf4j.Logger getLogger() {
        return (org.slf4j.Logger) LOG;
    }
    
}
