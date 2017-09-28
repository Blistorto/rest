/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author BliStorto
 */
@Entity
@Table(name = "produto")
public class Produto extends AbstractEntity{

    @Column(name = "name")
    private String name;
    
      
    @Column(name = "valor")
    private BigDecimal valor;
    
    @Override
    public void updateParameters(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Produto() {
    }

    public Produto(String name, BigDecimal valor) {
        this.name = name;
        this.valor = valor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
    
}
