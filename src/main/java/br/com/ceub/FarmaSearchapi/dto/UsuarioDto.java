package br.com.ceub.FarmaSearchapi.dto;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "usuario")
@Data
public class UsuarioDto {

    @Id
    @Column(name = "id")
    private BigDecimal id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @Enumerated(EnumType.STRING)
    @Column(name = "perfil")
    private String statusPerfil;

    @Column(name = "email")
    private String email;

    @Column(name = "telefone")
    private String telefone;

}
