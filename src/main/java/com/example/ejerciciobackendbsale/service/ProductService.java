package com.example.ejerciciobackendbsale.service;

import com.example.ejerciciobackendbsale.dao.ProductDao;
import com.example.ejerciciobackendbsale.model.Product;
import com.example.ejerciciobackendbsale.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Clase servicio para la entidad Product, que contiene las implementaciones de los métodos
 * necesarios para la interacción con la base de datos.
 */
@Service
public class ProductService implements ProductDao {

    @Autowired
    private ProductRepository repo;


    @Override
    public List<Product> listarTodos() {
        return repo.findAll();
    }

    @Override
    public List<Product> listarPorCategoria(int id) {
        return repo.findAllByCategory_Id(id);
    }

    @Override
    public List<Product> listarPorNombre(String name) {
        return repo.findAllByNameContainingIgnoreCase(name);
    }
}
