package com.br.naia.cadastropessoa.entrypoint;

import com.br.naia.cadastropessoa.dto.PessoaDto;
import com.br.naia.cadastropessoa.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoa")
public class PessoaAPI {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping(value = "/validarcpf/{cpf}")
    public String validarCpf(@PathVariable String cpf) {
//        Método feito para testar a API
        pessoaService.validarCPF(cpf);
        return cpf + " é válido";
    }

    @PostMapping(value = "/salvar")
    public PessoaDto salvar(@RequestBody PessoaDto pessoaDto) {
        return pessoaService.salvar(pessoaDto);

    }

    @GetMapping(value = "/{id}")
    public PessoaDto salvar(@PathVariable Long id) {
        return pessoaService.buscar(id);

    }
}
