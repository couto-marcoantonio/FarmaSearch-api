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
public class FarmaciaDto {

    @Id
    @Column(name = "id")
    private BigDecimal id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "cep")
    private String cep;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "email")
    private String email;

}
