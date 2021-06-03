package com.br.naia.csvreadertodb.entrypoint;

import com.br.naia.csvreadertodb.dto.PageDto;
import com.br.naia.csvreadertodb.dto.PessoaDto;
import com.br.naia.csvreadertodb.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoa")
public class PessoaAPI {

    @Autowired
    private PessoaService pessoaService;

    @PutMapping
    public PessoaDto incluir(@RequestBody PessoaDto pessoaDto) {
        return pessoaService.salvar(pessoaDto);
    }

    @PostMapping
    public PessoaDto salvar(@RequestBody PessoaDto pessoaDto) {
        return pessoaService.salvar(pessoaDto);
    }

    @GetMapping(value = "/{id}")
    public PessoaDto buscar(@PathVariable Long id) {
        return pessoaService.buscar(id);
    }

    @GetMapping(value = "/lista", params = { "page", "size" })
    public PageDto<PessoaDto> buscarLista(@RequestParam("page") int page, @RequestParam("size") int size) {
        return pessoaService.buscarLista(PageRequest.of(page, size));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity remover(@PathVariable Long id) {
        pessoaService.remover(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
