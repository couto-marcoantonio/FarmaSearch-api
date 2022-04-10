package br.com.ceub.FarmaSearchapi.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "usuario_farmacia")
@Builder
public class UsuarioFarmacialDto {
    // TODO rever relacionamentos
    @Id
    @Column(name = "id")
    private BigDecimal id;

    @OneToOne
    @Column(name = "usuario_id")
    private UsuarioDto usuario;

    @ManyToOne
    @Column(name = "farmacia_id")
    private FarmaciaDto farmacia;


}
