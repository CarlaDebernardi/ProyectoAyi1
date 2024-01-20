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
@Table(name="producto")
public class Producto implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    private Integer idProducto;
    private Integer codigoEan;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer stock;
}
