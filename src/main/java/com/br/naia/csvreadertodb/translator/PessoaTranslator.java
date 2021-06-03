package com.br.naia.csvreadertodb.translator;

import com.br.naia.csvreadertodb.dto.PessoaDto;
import com.br.naia.csvreadertodb.entity.PessoaEntity;
import com.br.naia.csvreadertodb.exception.DataInvalidaException;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
@Setter
public class PessoaTranslator {

    @Autowired
    private ContatoTranslator contatoTranslator;

    public PessoaDto toDto(PessoaEntity pessoaEntity) {
        if(Objects.isNull(pessoaEntity)) {
            return null;
        }
        PessoaDto pessoaDto = new PessoaDto();
        pessoaDto.setId(pessoaEntity.getId());
        pessoaDto.setNome(pessoaEntity.getNome());
        pessoaDto.setCpf(pessoaEntity.getCpf());
        pessoaDto.setNascimento(pessoaEntity.getNascimento().toString());
        pessoaDto.setContatos(contatoTranslator.toDtoList(pessoaEntity.getContatos()));
        return pessoaDto;
    }

    public PessoaEntity fromDto(PessoaDto pessoaDto) {
        if(Objects.isNull(pessoaDto)) {
            return null;
        }
        PessoaEntity pessoaEntity = new PessoaEntity();
        pessoaEntity.setId(pessoaDto.getId());
        pessoaEntity.setNome(pessoaDto.getNome());
        pessoaEntity.setCpf(pessoaDto.getCpf());
        pessoaEntity.setContatos(contatoTranslator.fromDtoList(pessoaDto.getContatos()));

        try {
            pessoaEntity.setNascimento(LocalDateTime.parse(pessoaDto.getNascimento()));
        } catch (DateTimeParseException e) {
            throw new DataInvalidaException();
        }

        return pessoaEntity;
    }

    public List<PessoaDto> toDtoList(List<PessoaEntity> pessoaEntityList) {
        if(Objects.isNull(pessoaEntityList)) {
            return null;
        }
        return pessoaEntityList.stream().map(this::toDto).collect(Collectors.toList());
    }

    public List<PessoaEntity> fromDtoList(List<PessoaDto> pessoaDtoList) {
        if(Objects.isNull(pessoaDtoList)) {
            return null;
        }
        return pessoaDtoList.stream().map(this::fromDto).collect(Collectors.toList());
    }
}
