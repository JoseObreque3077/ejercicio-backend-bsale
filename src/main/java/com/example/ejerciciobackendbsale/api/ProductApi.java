package com.example.ejerciciobackendbsale.api;

import com.example.ejerciciobackendbsale.dao.CategoryDao;
import com.example.ejerciciobackendbsale.dao.ProductDao;
import com.example.ejerciciobackendbsale.model.Category;
import com.example.ejerciciobackendbsale.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * API REST para interactuar con la tabla "product" de la base de datos.
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ProductApi {

    // Inyección de dependencias
    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private ProductDao productDao;

    /**
     * Retorna todos los registros de la tabla category, ante una petición GET.
     * @return Lista con todos los registros de la tabla category.
     */
    @GetMapping("/categorias/todas")
    public List<Category> listarCategorias() {
        return categoryDao.listar();
    }

    /**
     * Retorna todos los registros de la tabla product, ante una petición GET.
     * @return Lista con todos los registros de la tabla product.
     */
    @GetMapping("/productos/todos")
    public List<Product> listarProductos() {
        return productDao.listarTodos();
    }

    /**
     * Retorna todos los registros de la tabla product, para una categoría en específico, ante una petición GET.
     * @param idCategoria Identificador único de la categoría ingresada como parámetro de búsqueda.
     * @return Lista con todos los registros de la tabla product que cumplen con el criterio específico.
     */
    @GetMapping("/productos/categoria/{idCategoria}")
    public List<Product> listarProductosPorCategoria(@PathVariable int idCategoria) {
        return productDao.listarPorCategoria(idCategoria);
    }

    /**
     * Retorna todos los registros de la tabla product, que tengan un nombre o parte de nombre, que
     * coincida con texto entregado como parámetro, ante una petición GET.
     * @param texto Nombre o parte de nombre de producto.
     * @return Lista con todos los registros de la tabla product que cumplen con el criterio específico.
     */
    @GetMapping("/productos/{texto}")
    public List<Product> listarProductosPorNombre(@PathVariable String texto) {
        return productDao.listarPorNombre(texto);
    }


}
