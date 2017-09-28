/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao;

import com.genericrest.model.Produto;
import java.util.List;

/**
 *
 * @author BliStorto
 */
public interface ProdutoDAO extends DAO<Produto, Long>{
    List<Produto> findByName(String name);
}
