# Desafío Técnico Backend: Postulación BSALE

## Descripción

El ejercicio corresponde a la primera parte del desafío técnico de postulación a la oferta laboral de Software Developer en BSALE. Se solicita la implementación de una API REST para una tienda online, tomando los siguientes puntos en consideración:

* Se deben poder mostrar los productos de acuerdo a la categoría a la cual pertenecen.
* Se debe implementar un buscador de productos.

## Desarrollo de la Aplicación

Para la implementación de esta API REST se utilizó lenguaje de programación Java junto con Spring Framework. Los modelos de *producto* y *categoría* fueron creados a partir de las tablas existentes en la base de datos entregada por BSALE. Se crearon 4 endpoints para la interacción con la base de datos: tres de ellos para interactuar con la tabla de productos y uno para la interacción con la tabla de categorías.

## Estructura JSON

A continuación se presentan y describen las estructuras JSON obtenidas como respuesta desde los endpoints de la API REST implementada.

### Categoría

La estructura JSON de un registro de la tabla de categorías es la siguiente:

```
{
"id": 1,
"name": "bebida energetica"
}
```

Donde:
* id: Identificador único de la categoría.
* name: Nombre de la categoría.

### Producto
La estructura JSON de un registro de la tabla de productos es la siguiente:

```
{
    "id": 8,
    "name": "PISCO ALTO DEL CARMEN 35º",
    "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/alto8532.jpg",
    "price": 7990.0,
    "discount": 10,
    "category": {
        "id": 2,
        "name": "pisco"
    }
}
```

Donde:
* id: Identificador único del producto.
* name: Nombre del producto.
* urlImage: URL de la imagen del producto.
* price: Precio unitario del producto.
* discount: Porcentaje de descuento del producto.
* category: Categoría a la que pertenece el producto.

## Endpoints
### GET: Listar categorías

`/api/categorías/todas`

Retorna un arreglo con todas las categorías disponibles en la base de datos, mediante una petición GET.

Ejemplo de uso: *https://bsale-store-test-backend.herokuapp.com/api/categorias/todas*

### GET: Listar productos

`/api/productos/todos`

Retorna un arreglo con todos los productos disponibles en la base de datos, mediante una petición GET.

Ejemplo de uso: *https://bsale-store-test-backend.herokuapp.com/api/productos/todos*

### GET: Listar productos por categoría

`/api/productos/categoria/{id}`

Retorna un arreglo con todos los productos disponibles en la base de datos, para un *id de categoría* específico, mediante una petición GET.

Ejemplo de uso: *https://bsale-store-test-backend.herokuapp.com/api/productos/categoria/1*

### GET: Listar productos por nombre

`/api/productos/{nombre}`

Retorna un arreglo con todos los productos disponibles en la base de datos, para un *nombre de producto (o parte de él)*, mediante una petición GET.

Ejemplo de uso: *https://bsale-store-test-backend.herokuapp.com/api/productos/big*

## Despliegue de la implementación
La código de la aplicación resultante se encuentra alojado en un repositorio público en la plataforma [Github](https://github.com/JoseObreque3077/ejercicio-backend-bsale). Su despliegue fue realizado en la plataforma [Heroku](https://bsale-store-test-backend.herokuapp.com).
