package com.genericrest.service.impl;

import com.genericrest.dao.ClienteDAO;
import com.genericrest.dao.DAO;
import com.genericrest.model.Cliente;
import com.genericrest.service.ClienteService;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author BliStorto
 */
@ManagedBean
@Path("/clientes")
public class ClienteServiceImpl extends GenericCRUDRestService<Cliente> implements ClienteService {

    private static final Logger LOG = LoggerFactory.getLogger(ClienteServiceImpl.class);
    
    @Inject
    private ClienteDAO clienteDAO;
    
    public ClienteServiceImpl() {
        super(Cliente.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Cliente> list) {
        return new GenericEntity<List<Cliente>>(list){};
    }

    @Override
    public DAO getDao() {
        return clienteDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

    @Override
    public Response getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
