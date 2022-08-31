package com.example.ejerciciobackendbsale.dao;

import com.example.ejerciciobackendbsale.model.Product;

import java.util.List;

/**
 * Interfaz que define los métodos necesarios para interactuar con la tabla "product" de la base de datos
 */
public interface ProductDao {

    /**
     * Método que obtiene todos los registros de la tabla product de la base de datos.
     * @return Lista con todos los registros desde la base de datos.
     */
    List<Product> listarTodos();

    /**
     * Método que obtiene todos los registros de la tabla product, para una categoría en específico.
     * @return Lista con los registros encontrados que cumplen con el criterio de búsqueda.
     */
    List<Product> listarPorCategoria(int id);

    /**
     * Método que obtiene todos los registros de la tabla product, cuyo nombre o parte del nombre contengan
     * el texto entregado como parámetro de búsqueda.
     * @return Lista con los registros encontrados que cumplen con el criterio de búsqueda.
     */
    List<Product> listarPorNombre(String name);

}
