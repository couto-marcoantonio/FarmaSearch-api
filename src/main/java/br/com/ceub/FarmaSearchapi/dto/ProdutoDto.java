package br.com.ceub.FarmaSearchapi.dto;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "usuario")
@Data
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
    private Integer dataPublicacao;

    @Column(name = "inicio_desconto")
    private String inicioDesconto;

    @Column(name = "fim_desconto")
    private String fimDesconto;



}
