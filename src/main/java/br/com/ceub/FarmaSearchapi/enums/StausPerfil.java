package br.com.ceub.FarmaSearchapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StausPerfil {

    //TODO rever status
    CLIENTE(1, "Cliente"),
    ATENDENTE(2, "Atendente");


    private Integer id;
    private String descricao;

}
