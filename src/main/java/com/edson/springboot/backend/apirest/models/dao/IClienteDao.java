package com.edson.springboot.backend.apirest.models.dao;

import com.edson.springboot.backend.apirest.models.entity.Cliente;

import org.springframework.data.repository.CrudRepository;

/**
 * IClienteDao
 */
public interface IClienteDao extends CrudRepository<Cliente, Long> {

    
}