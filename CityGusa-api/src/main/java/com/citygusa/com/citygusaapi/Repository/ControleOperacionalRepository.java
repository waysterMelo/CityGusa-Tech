package com.citygusa.com.citygusaapi.Repository;

import com.citygusa.com.citygusaapi.Entity.ControleOperacionalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ControleOperacionalRepository extends JpaRepository<ControleOperacionalEntity, Integer> {

    @Query("select o.cargaHora from ControleOperacionalEntity o where o.createdAt = :createdAt order by o.id desc limit 1")
    Integer findCargaHoraByCreatedAt(LocalDate createdAt);

    @Query("select o.gusaKg from ControleOperacionalEntity o where o.createdAt = :createdAt order by o.id desc limit 1")
    Integer findGusaKgByCreatedAt(LocalDate createdAt);

    @Query("select o.horas from ControleOperacionalEntity o order by o.id desc limit 1")
    String findHoras();

    @Query("SELECT SUM(o.cargaHora) from ControleOperacionalEntity o where o.createdAt = :createdAt")
    Integer findCargaAcumulado(@Param("createdAt") LocalDate createdAt);

    @Query("SELECT SUM(o.cargaSeca) from ControleOperacionalEntity o where o.createdAt = :createdAt")
    Integer findCargaAcumuladoSeca(@Param("createdAt") LocalDate createdAt);

    @Query("select AVG(o.umidade) from ControleOperacionalEntity o where o.createdAt = :createdAt")
    Integer findMediaUmidade(@Param("createdAt") LocalDate createdAt);

    List<ControleOperacionalEntity> findAllByCreatedAt(LocalDate data);
}
