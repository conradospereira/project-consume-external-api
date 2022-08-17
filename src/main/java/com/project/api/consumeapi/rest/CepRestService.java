package com.project.api.consumeapi.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.api.consumeapi.interfaces.CepService;
import com.project.api.consumeapi.model.Address;

public class CepRestService {
    
    private CepService cepService;

    public ResponseEntity<Address> getCep(@PathVariable String cep) {

        Address address = cepService.searchAddressByCep(cep);
        return address != null ? ResponseEntity.ok().body(address) : ResponseEntity.notFound().build();
    }

}
