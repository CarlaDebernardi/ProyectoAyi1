package com.ayi.EjercicioEvaluativo1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="producto")
public class Producto {
    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer codigoInternoProducto;
    private Integer codigoEanProducto;
    private String nombre;
    private String descripción;
    private Double precio;
    private Integer stock;
}
