/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Jason
 */
@Entity
@Table(name="producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_producto;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "ruta_imagen", nullable = false)
    private String ruta_imagen;
    
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    
    @Column(name = "precio", nullable = false)
    private double precio;
    
    @Column(name = "stock", nullable = false)
    private int stock;

    public Producto() {
    }

    public Producto(long id_producto, String nombre, String ruta_imagen, String descripcion, double precio, int stock) {
        super();
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.ruta_imagen = ruta_imagen;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }
    
    public Producto(String nombre, String ruta_imagen, String descripcion, double precio, int stock) {
        super();
        this.nombre = nombre;
        this.ruta_imagen = ruta_imagen;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public long getId_producto() {
        return id_producto;
    }

    public void setId_producto(long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta_imagen() {
        return ruta_imagen;
    }

    public void setRuta_imagen(String ruta_imagen) {
        this.ruta_imagen = ruta_imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", nombre=" + nombre + ", ruta_imagen=" + ruta_imagen + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
    
}
