package com.tienda.repository;

import com.tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jason
 */
@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long>{
    
}
