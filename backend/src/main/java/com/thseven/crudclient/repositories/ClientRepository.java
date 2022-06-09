package com.thseven.crudclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thseven.crudclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long>  {

}
