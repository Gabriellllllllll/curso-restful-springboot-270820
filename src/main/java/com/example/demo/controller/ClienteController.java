package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    @GetMapping("/clientes")
    public String getClientes(){
        return "Vai algum dia retornar o BD todos os clientes!";
    }
    
    @GetMapping("/clientes/{codigo}")
    public String getCliente(@PathVariable int codigo){
        if(codigo>0)
            return "Vai algum dia retornar um cliente " + codigo;
        else
            return "Numero negativo, cliente nao encontrado " + codigo;
    }
}