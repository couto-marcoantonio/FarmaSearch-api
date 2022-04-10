package br.com.ceub.FarmaSearchapi.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuario")
@Data
@Builder
public class ProdutoDto {

    @Id
    @Column(name = "id")
    private BigDecimal id;

    //TODO rever relacionamento
    @OneToOne
    @Column(name = "medicamento")
    private MedicamentoDto medicamento;

    //TODO rever relacionamento
    @OneToMany
    @Column(name = "farmacia_id")
    private FarmaciaDto farmacia;

    @Column(name = "dosagem")
    private Integer dosagem;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "medida_quantidade")
    private Integer medidaQuantidade;

    @Column(name = "valor")
    private Integer valor;

    @Column(name = "data_publicacao")
    private LocalDateTime dataPublicacao;

    @Column(name = "inicio_desconto")
    private LocalDateTime inicioDesconto;

    @Column(name = "fim_desconto")
    private LocalDateTime fimDesconto;



}
