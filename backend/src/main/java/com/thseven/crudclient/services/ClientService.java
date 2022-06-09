package com.thseven.crudclient.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thseven.crudclient.ClientDTO;
import com.thseven.crudclient.entities.Client;
import com.thseven.crudclient.repositories.ClientRepository;

@Service
public class ClientService {
	ClientRepository repository;
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {
		List<Client> list = repository.findAll();
		list.stream().map(client -> new ClientDTO(client));
		return null;
	}

}
