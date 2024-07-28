package com.citygusa.com.citygusaapi.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "controle_de_corridas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ControleCorridas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String horaInicio;

    private String horaFim;

    private Integer minutos;

    private Integer conchas;

    private Integer silicio_visual;

    private Integer silicio_real;

    private String fosforo;

    private String manganes;

    private String silica;

    private String escoria_inicio;

    private String escoria_fim;

    private String tipo_escoria;

    private Integer carga_fundida_de;

    private Integer carga_fundida_ate;

    private Integer quantidade;

    private Integer fe_gusa_kg;

    @Column(precision = 10, scale = 2, nullable = true)
    private BigDecimal ferro;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal realTn;

    private BigDecimal tempo_corrida;

    private BigDecimal gusa_minuto;

    private Integer carvao_kg;

    private BigDecimal carvao_metros;

    private Integer sopradores_1;

    private Integer sopradores_2;

    private Integer sopradores_3;

    private Integer sopradores_4;

    private Integer sopradores_5;

    @Column
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}