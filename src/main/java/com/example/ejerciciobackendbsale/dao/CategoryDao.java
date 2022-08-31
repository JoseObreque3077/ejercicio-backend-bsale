package com.example.ejerciciobackendbsale.dao;

import com.example.ejerciciobackendbsale.model.Category;

import java.util.List;

/**
 * Interfaz que define los métodos necesarios para interactuar con la tabla "category" de la base de datos
 */
public interface CategoryDao {

    /**
     * Método que obtiene todos los registros de la tabla category.
     * @return Lista con todos los registros desde la tabla category.
     */
    List<Category> listar();

}
