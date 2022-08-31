package com.example.ejerciciobackendbsale.service;

import com.example.ejerciciobackendbsale.dao.CategoryDao;
import com.example.ejerciciobackendbsale.model.Category;
import com.example.ejerciciobackendbsale.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Clase servicio para la entidad Category, que contiene las implementaciones de los métodos
 * necesarios para la interacción con la base de datos.
 */
@Service
public class CategoryService implements CategoryDao {

    @Autowired
    private CategoryRepository repo;


    @Override
    public List<Category> listar() {
        return repo.findAll();
    }
}
