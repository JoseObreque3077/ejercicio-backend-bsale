package com.example.ejerciciobackendbsale.repository;

import com.example.ejerciciobackendbsale.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repositorio que incluye todos los métodos CRUD, de paginación y ordenamiento desde JPA Repository, para
 * su uso en la tabla "product" de la base de datos.
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {

    /**
     * Método que busca todos los registros en la tabla product, cuyo id de categoría coincida con el parámetro
     * de búsqueda.
     * @param id Identificador único de categoría.
     * @return Lista de registros encontrados en la tabla producto, para la categoría especificada.
     */
    List<Product> findAllByCategory_Id(int id);

    /**
     * Método que busca todos los registros en la tabla product, cuyo nombre contenga la totalidad o parte del
     * texto ingresado como parámetro de búsqueda.
     * @param name Nombre o parte del nombre de un producto.
     * @return Lista de registros encontrados en la tabla producto que coinciden con el parámetro de búsqueda dado.
     */
    List<Product> findAllByNameContainingIgnoreCase(String name);
}