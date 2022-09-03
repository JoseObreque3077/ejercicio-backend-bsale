# API Desafío Técnico BSALE (backend)

## Descripción
Corresponde a la primera parte de la prueba técnica para la
postulación como Software Developer en BSALE. La actividad consiste en
desarrollar una API REST que permita interactuar con registros de productos de una
base de datos, considerando que estos productos deben poder ser filtrados por categoría y además ser buscados mediante
un buscador dentro del sitio.

## Resolución del Problema
En este caso la API REST fue implementada usando el lenguaje Java y Spring Framework. Esta API permite:
* Obtener todos los productos de la base de datos, por petición GET.
* Obtener todas las categorías disponibles en la base de datos, por petición GET.
* Obtener todos los productos pertenecientes a una categoría, por petición GET, en base a un ID de categoría.
* Obtener todos los productos filtrados por nombre (o parte de este), por petición GET, en base a un string.

El despliegue de la aplicación se realizó en [Heroku](https://bsale-store-test-backend.herokuapp.com).

## Estructura JSON
### Categoría
La estructura de una categoría en formato JSON es la siguiente:

    {
        "id": 1,
        "name": "bebida energetica"
    }

* id: identificador único de la categoría.
* name: nombre de la categoría.

### Producto
La estructura de un producto en formato JSON es la siguiente:

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

* id: identificador único de la categoría.
* name: nombre del producto.
* urlImage: URL de la imagen del producto.
* price: precio de venta del producto.
* discount: porcentaje de descuento del producto.
* category: categoría a la que pertenece el producto.

## Endpoints

### GET : Listar categorías
Permite obtener el listado de todas las categorías disponibles en la base de datos.

https://bsale-store-test-backend.herokuapp.com/api/categorias/todas

### GET : Listar productos
Permite obtener el listado de todos los productos disponibles en la base de datos.

https://bsale-store-test-backend.herokuapp.com/api/productos/todos

### GET : Listar productos por categoría 
Permite obtener el listado de productos disponibles en la base de datos, filtrados por un id de categoría.

https://bsale-store-test-backend.herokuapp.com/api/productos/categoria/{id}

*Ejemplo: https://bsale-store-test-backend.herokuapp.com/api/productos/categoria/1*

### GET: Listar productos por nombre o parte del nombre
Permite obtener el listado de productos disponibles en la base de datos, filtrados por un texto que
representa al nombre (o una parte del nombre) del producto.

https://bsale-store-test-backend.herokuapp.com/api/productos/{texto}

*Ejemplo: https://bsale-store-test-backend.herokuapp.com/api/productos/big*
