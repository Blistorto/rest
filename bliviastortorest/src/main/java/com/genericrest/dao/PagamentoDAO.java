/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao;
import java.util.List;
import com.genericrest.model.Pagamento;
/**
 *
 * @author BliStorto
 */
public interface PagamentoDAO extends DAO<Pagamento, Long>{
    List<Pagamento> findByName(String name);
}
