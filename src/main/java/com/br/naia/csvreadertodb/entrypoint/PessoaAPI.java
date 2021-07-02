package com.br.naia.csvreadertodb.entrypoint;

import com.br.naia.csvreadertodb.entity.*;
import com.br.naia.csvreadertodb.repository.*;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

@RestController
@RequestMapping("/ler")
public class PessoaAPI {

    @Autowired
    private CassacaoRepository cassacaoRepository;

    @Autowired
    private BemRepository bemRepository;

    @Autowired
    private CandidatoRepository candidatoRepository;

    @Autowired
    private ColigacaoRepository coligacaoRepository;

    @Autowired
    private VagaRepository vagaRepository;

    private static final String ARQUIVO_BEM = "src/main/resources/bem_candidato_2020_MS.csv";
    private static final String ARQUIVO_CANDIDATO = "src/main/resources/consulta_cand_2020_MS.csv";
    private static final String ARQUIVO_COLIGACAO = "src/main/resources/consulta_coligacao_2020_MS.csv";
    private static final String ARQUIVO_VAGA = "src/main/resources/consulta_vagas_2020_MS.csv";
    private static final String ARQUIVO_CASSACAO = "src/main/resources/motivo_cassacao_2020_MS.csv";

    @GetMapping
    public String incluir() throws IOException {

        List<Bem> bems = new CsvToBeanBuilder<Bem>(new FileReader(ARQUIVO_BEM, Charset.forName("windows-1252")))
                .withSeparator(';')
                .withQuoteChar('\"')
                .withType(Bem.class)
                .build().parse();

        bemRepository.saveAll(bems);

        List<Candidato> candidatoes = new CsvToBeanBuilder<Candidato>(new FileReader(ARQUIVO_CANDIDATO, Charset.forName("windows-1252")))
                .withSeparator(';')
                .withQuoteChar('\"')
                .withType(Candidato.class)
                .build().parse();

        candidatoRepository.saveAll(candidatoes);

        List<Cassacao> cassacaos = new CsvToBeanBuilder<Cassacao>(new FileReader(ARQUIVO_CASSACAO, Charset.forName("windows-1252")))
                .withSeparator(';')
                .withQuoteChar('\"')
                .withType(Cassacao.class)
                .build().parse();

        cassacaoRepository.saveAll(cassacaos);

        List<Coligacao> coligacaos = new CsvToBeanBuilder<Coligacao>(new FileReader(ARQUIVO_COLIGACAO, Charset.forName("windows-1252")))
                .withSeparator(';')
                .withQuoteChar('\"')
                .withType(Coligacao.class)
                .build().parse();

        coligacaoRepository.saveAll(coligacaos);

        List<Vaga> vagas = new CsvToBeanBuilder<Vaga>(new FileReader(ARQUIVO_VAGA, Charset.forName("windows-1252")))
                .withSeparator(';')
                .withQuoteChar('\"')
                .withType(Vaga.class)
                .build().parse();

        vagaRepository.saveAll(vagas);






        return "Olá mundo";
    }

}
