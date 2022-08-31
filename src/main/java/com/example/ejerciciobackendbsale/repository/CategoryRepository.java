package com.example.ejerciciobackendbsale.repository;

import com.example.ejerciciobackendbsale.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Repositorio que incluye todos los métodos CRUD, de paginación y ordenamiento desde JPA Repository, para
 * su uso en la tabla "category" de la base de datos.
 */
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}