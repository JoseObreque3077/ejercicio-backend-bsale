# API Desafío Técnico BSALE (backend)

## Descripción
Permite obtener una lista de productos completa, filtrada por categoría o filtrada por nombre (o parte de su nombre).

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