package com.project.api.consumeapi.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.api.consumeapi.model.Address;

@FeignClient(url = "https://viacep.com.br/ws/" , name = "viacep")
public interface CepService {

    @GetMapping("/{cep}/json")

    Address searchAddressByCep(@PathVariable("cep") String cep);
    
}
