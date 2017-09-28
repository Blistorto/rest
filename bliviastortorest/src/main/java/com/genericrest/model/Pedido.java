/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author BliStorto
 */
@Entity
@Table(name = "pedido")
public class Pedido extends AbstractEntity{
    @Column(name = "data", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    
    @Column(name = "valor")
    private BigDecimal valor;
    
    
    @OneToMany 
    private List<ItemPedido> itens;
    
    
    @ManyToOne
    private Cliente cliente;
    private Pagamento pagamento;
    
    @Override
    public void updateParameters(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pedido() {
    }

    public Pedido(List<ItemPedido> itens, Cliente cliente, Pagamento pagamento) {
        this.itens = itens;
        this.cliente = cliente;
        this.pagamento = pagamento;
    }        

    public List<ItemPedido> getItens() {
        return itens;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }    
}
