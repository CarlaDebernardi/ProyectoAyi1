package com.ayi.EjercicioEvaluativo1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table (name="servicio")
public class Servicio implements Serializable {
    private static final Long serialVersionUID = 1L;
    @Id
//@GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column(name = "codigo_interno_servicio")
    private Integer codigoInternoServicio;
    @Column(name = "codigo_ean_servicio")
    private Integer codigoEanServicio;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio")
    private Double precio;
    @Column(name = "duracion")
    private Integer duración;

}
