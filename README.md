# Aplicación de Búsqueda de Libros
Esta aplicación Android permite buscar libros por su título y visualizar información detallada sobre cada uno. Está desarrollada siguiendo el patrón de arquitectura **MVVM (Model - View - ViewModel)**, separando la lógica de negocio de la interfaz de usuario para lograr un código más limpio, mantenible y escalable.

El usuario puede ingresar el nombre de un libro en un campo de búsqueda. Si el libro existe en la colección, se navega a una pantalla de detalle donde se muestra información como título, autor, cantidad de páginas, año de publicación, géneros y una imagen representativa de la portada. En caso de no encontrarse, se muestra un mensaje informativo.

## Funcionalidades
* Búsqueda de libros por título
* Visualización de detalles del libro
* Imagen de portada
* Mensaje de error si el libro no existe
* Uso de arquitectura MVVM

## Arquitectura
La app está estructurada en tres capas principales:

* **Model**: Clases como `Libro` y `DetalleLibro`, que representan los datos.
* **View**: Activities (`MainActivity`, `DetalleLibroActivity`) que manejan la interfaz de usuario.
* **ViewModel**: Encargados de la lógica (`MainActivityViewModel`, `DetalleLibroViewModel`) y comunicación con la vista mediante `LiveData`.

##Tecnologías utilizadas
* Java
* Android SDK
* ViewModel
* LiveData
* ConstraintLayout / LinearLayout
* ScrollView


## Notas
* Los datos de los libros están cargados de forma local (hardcodeados en el ViewModel).
* La comunicación entre pantallas se realiza mediante `Intent` y `Serializable`.

