package com.br.naia.cadastropessoa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PageDto<T> {
    private List<T> content;
    private Long totalElements;
    private Integer totalPages;
}
