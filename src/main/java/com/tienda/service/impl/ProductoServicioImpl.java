package com.tienda.service.impl;

import com.tienda.domain.Producto;
import com.tienda.repository.ProductoRepositorio;
import com.tienda.service.ProductoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jason
 */
@Service
public class ProductoServicioImpl implements ProductoServicio{
    
    @Autowired
    private ProductoRepositorio repositorio;
    
    @Override
    public List<Producto> listarProductos() {
        return repositorio.findAll();
    }
    
}
