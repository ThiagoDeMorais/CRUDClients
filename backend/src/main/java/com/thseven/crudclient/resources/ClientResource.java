package com.thseven.crudclient.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thseven.crudclient.ClientDTO;
import com.thseven.crudclient.services.ClientService;

@RestController
@RequestMapping(value ="clients")
public class ClientResource {
	ClientService service;
	
	public ResponseEntity<List<ClientDTO>> findAll(){
		List<ClientDTO> list = new ArrayList<>();
		list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
