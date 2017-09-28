/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author BliStorto
 */
@Entity
@Table(name = "itempedido")
public class ItemPedido extends AbstractEntity{

    @Column(name = "quantidade")
    private Integer quantidade;
    
    @Column(name = "valor_unitario")
    private BigDecimal valorUnitario;
        
    @Column(name = "valor_total")
    private BigDecimal valortotal;
    
    @ManyToOne
    private Produto produto;
    
    @Override
    public void updateParameters(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ItemPedido() {
    }

    public ItemPedido(Integer quantidade, BigDecimal valorUnitario,BigDecimal valortotal, Produto produto) {
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valortotal = valortotal;
        this.produto = produto;
    }   

    public BigDecimal getValortotal() {
        return valortotal;
    }

    public void setValortotal(BigDecimal valortotal) {
        this.valortotal = valortotal;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }    

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }      
}
