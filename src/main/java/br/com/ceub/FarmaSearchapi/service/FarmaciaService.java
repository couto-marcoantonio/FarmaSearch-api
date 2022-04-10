package br.com.ceub.FarmaSearchapi.service;

import br.com.ceub.FarmaSearchapi.dto.FarmaciaDto;
import br.com.ceub.FarmaSearchapi.repository.FarmaciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class FarmaciaService {

    @Autowired
    private FarmaciaRepository repository;

    private void validarFarmacia(FarmaciaDto farmacia){
        if(ObjectUtils.isEmpty(farmacia)){
            throw new NullPointerException("Erro ao cadastrar Farmacia");
        }
        //TODO if()
    }

    public FarmaciaDto cadastrar(FarmaciaDto farmacia) throws Exception{

        validarFarmacia(farmacia);

        try{
            return this.repository.save(farmacia);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public List<FarmaciaDto> listarTodos() {
        return this.repository.findAll();
    }

    public FarmaciaDto alterar(FarmaciaDto farmacia) {

        validarFarmacia(farmacia);

        return FarmaciaDto.builder()
                .cep(farmacia.getCep())
                .email(farmacia.getEmail())
                .endereco(farmacia.getEndereco())
                .nome(farmacia.getNome())
                .id(farmacia.getId())
                .telefone(farmacia.getTelefone())
                .build();

    }
}
