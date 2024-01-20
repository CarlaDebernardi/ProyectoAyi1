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
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Integer codigoInternoServicio;
    private Integer codigoEanServicio;
    private String nombre;
    private String descripción;
    private Double precio;
    private Integer duración;

}
