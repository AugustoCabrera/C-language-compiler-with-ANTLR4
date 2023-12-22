# Compilador para C Reducido

Este repositorio contiene el código fuente y la documentación asociada al desarrollo de un compilador para un subconjunto del lenguaje C, conocido como C Reducido. El compilador tiene como objetivo principal generar un reporte de errores léxicos, gramaticales y semánticos a partir de un archivo de código fuente en C, así como generar una salida de código intermedio de tres direcciones.

## Características

- Análisis léxico y sintáctico del código fuente en C utilizando ANTLR4.
- Verificación de la correcta delimitación de bloques de código, balance de llaves, corchetes y paréntesis.
- Verificación de la estructura de las operaciones aritmético/lógicas y las variables o números afectadas.
- Generación de código intermedio de tres direcciones.

## Estructura del Repositorio

- `src/`: Contiene el código fuente del compilador.
- `docs/`: Documentación asociada al desarrollo del compilador.
- `examples/`: Ejemplos de código fuente en C para probar el compilador.
- `tests/`: Casos de prueba para verificar el funcionamiento del compilador.

## Uso

Para utilizar el compilador, se debe clonar este repositorio y seguir las instrucciones detalladas en la documentación para compilar y ejecutar el software.


## Autores

Este proyecto fue desarrollado por **Augusto Gabriel Cabrera (@AugustoCabrera)** y **Federico Ignacio Villar (@all5one-sudo)**



## Agradecimientos

Agradecemos al profesor Ing. Maximiliano A. Eschoyez por su apoyo en el desarrollo de este proyecto.

---