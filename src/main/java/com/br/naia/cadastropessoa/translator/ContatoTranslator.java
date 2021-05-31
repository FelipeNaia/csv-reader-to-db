package com.br.naia.cadastropessoa.translator;

import com.br.naia.cadastropessoa.dto.ContatoDto;
import com.br.naia.cadastropessoa.entity.ContatoEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class ContatoTranslator {

    public ContatoDto toDto(ContatoEntity contatoEntity) {
        if(Objects.isNull(contatoEntity)) {
            return null;
        }
        ContatoDto contatoDto = new ContatoDto();
        contatoDto.setId(contatoEntity.getId());
        contatoDto.setNome(contatoEntity.getNome());
        contatoDto.setTelefone(contatoEntity.getTelefone());
        contatoDto.setEmail(contatoEntity.getEmail());
        return contatoDto;
    }

    public ContatoEntity fromDto(ContatoDto contatoDto) {
        if(Objects.isNull(contatoDto)) {
            return null;
        }
        ContatoEntity contatoEntity = new ContatoEntity();
        contatoEntity.setId(contatoDto.getId());
        contatoEntity.setNome(contatoDto.getNome());
        contatoEntity.setTelefone(contatoDto.getTelefone());
        contatoEntity.setEmail(contatoDto.getEmail());
        return contatoEntity;
    }

    public List<ContatoDto> toDtoList(List<ContatoEntity> contatoEntityList) {
        if(Objects.isNull(contatoEntityList)) {
            return null;
        }
        return contatoEntityList.stream().map(this::toDto).collect(Collectors.toList());
    }

    public List<ContatoEntity> fromDtoList(List<ContatoDto> contatoDtoList) {
        if(Objects.isNull(contatoDtoList)) {
            return null;
        }
        return contatoDtoList.stream().map(this::fromDto).collect(Collectors.toList());
    }
}
