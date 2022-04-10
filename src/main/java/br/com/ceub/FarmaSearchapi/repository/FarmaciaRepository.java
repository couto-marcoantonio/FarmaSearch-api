package br.com.ceub.FarmaSearchapi.repository;

import br.com.ceub.FarmaSearchapi.dto.FarmaciaDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface FarmaciaRepository extends JpaRepository<FarmaciaDto, BigDecimal> {

}
