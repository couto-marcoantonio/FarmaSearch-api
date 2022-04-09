package br.com.ceub.FarmaSearchapi.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "farmacia")
@Data
public class MedicamentoDto {

    @Id
    @Column(name = "id")
    private BigDecimal id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "bula")
    private String bula;

}
