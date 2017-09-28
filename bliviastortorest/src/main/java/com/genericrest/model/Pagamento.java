/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author BliStorto
 */
@Entity
@Table(name = "pagamento")
public class Pagamento extends AbstractEntity{

    @Column(length = 255, nullable = false)
    private String descricao;
    
    @Column(length = 255, nullable = false)
    private String estado;
    
    @Override
    public void updateParameters(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pagamento() {
    }

    public Pagamento(String descricao, String estado) {
        this.descricao = descricao;
        this.estado = estado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

           
}
