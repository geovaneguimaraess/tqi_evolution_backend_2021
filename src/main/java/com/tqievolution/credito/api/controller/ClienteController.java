package com.tqievolution.credito.api.controller;

import com.tqievolution.credito.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Cristiano Oliveira");
        cliente1.setRg("11111111");
        cliente1.setCpf("11111111111");
        cliente1.setEndereco("Rua1");
        cliente1.setEmail("cristianooliveira@tqi.com");
        cliente1.setSenha("@tqievolution22");
        cliente1.setRenda(100000.00);

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Maria Cecília");
        cliente2.setRg("22222222");
        cliente2.setCpf("22222222222");
        cliente2.setEndereco("Rua2");
        cliente2.setEmail("mariacecília@tqi.com");
        cliente2.setSenha("@tqievolution22");
        cliente2.setRenda(100000.00);

        return Arrays.asList(cliente1,cliente2);
    }
}
