package com.edson.springboot.backend.apirest.models.services;

import java.util.List;

import com.edson.springboot.backend.apirest.models.dao.IClienteDao;
import com.edson.springboot.backend.apirest.models.entity.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClienteServiceInpl
 */
@Service
public class ClienteServiceInpl implements IClienteService {

    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    
}