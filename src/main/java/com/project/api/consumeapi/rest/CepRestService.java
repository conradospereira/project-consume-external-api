package com.project.api.consumeapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.consumeapi.interfaces.CepService;
import com.project.api.consumeapi.model.Address;

@RestController
public class CepRestService {
    
    @Autowired
    private CepService cepService;

    @GetMapping("/{cep}")
    public ResponseEntity<Address> getCep(@PathVariable String cep) {

        Address address = cepService.searchAddressByCep(cep);
        return address != null ? ResponseEntity.ok().body(address) : ResponseEntity.notFound().build();
    }

}
