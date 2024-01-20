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
//@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codigo_interno_producto")
    private Integer codigoInternoProducto;
    @Column(name = "codigo_ean_producto")
    private Integer codigoEanProducto;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio")
    private Double precio;
    @Column(name = "stock")
    private Integer stock;
}
