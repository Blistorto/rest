/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao;

import com.genericrest.model.Cliente;
import java.util.List;

/**
 *
 * @author BliStorto
 */
public interface ClienteDAO extends DAO<Cliente, Long>{
    List<Cliente> findByName(String name);
}
