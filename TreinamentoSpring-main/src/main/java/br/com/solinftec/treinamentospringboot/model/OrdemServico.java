package br.com.solinftec.treinamentospringboot.model;

import lombok.Data;

import java.time.LocalDateTime;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ORDEM_SERVICO")
public class OrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_COOPERATIVA")
    private Cooperativa cooperativa;

    @ManyToOne
    @JoinColumn(name = "ID_FAZENDA")
    private Fazenda idFazenda;

    @ManyToOne
    @JoinColumn(name = "ID_EQUIPAMENTO")
    private Equipamento idEquipamento;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUTO")
    private Produto idProduto;

    @ManyToOne
    @JoinColumn(name = "ID_SERVICO")
    private TipoServico idServico;
    
    @Column(name = "DATA_EXECUCAO")
    private LocalDateTime dataExecucao;

    @Column(name = "RATE_APLICACAO")
    private Float rateAplicacao;

    @Column(name = "TOTAL_APLICACAO")
    private Float totalAplicacao;
}
