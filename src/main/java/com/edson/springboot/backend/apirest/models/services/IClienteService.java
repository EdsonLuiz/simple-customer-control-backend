package com.edson.springboot.backend.apirest.models.services;

import java.util.List;

import com.edson.springboot.backend.apirest.models.entity.Cliente;

/**
 * IClienteService
 */
public interface IClienteService {

    public List<Cliente> findAll();
    
}