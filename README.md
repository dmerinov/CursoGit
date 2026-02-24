# Proyecto de Formación en Git para Becarios

¡Bienvenidos al proyecto de formación en Git! El objetivo de este proyecto es que os familiaricéis con los comandos básicos de Git y aprendáis a trabajar en equipo utilizando un flujo de trabajo estándar como Gitflow.

## 1. Conceptos Básicos de Git

Git es un sistema de control de versiones distribuido. Esto significa que cada desarrollador tiene una copia completa del repositorio, incluyendo todo su historial.

### Comandos Esenciales

*   **`git clone [URL]`**: Clona un repositorio remoto a tu máquina local.
*   **`git status`**: Muestra el estado de los archivos en tu directorio de trabajo.
*   **`git add [archivo]`**: Añade un archivo al área de "staging" (preparación).
*   **`git commit -m "[mensaje]"`**: Guarda los cambios preparados en el repositorio local.
*   **`git push`**: Sube tus commits al repositorio remoto.
*   **`git pull`**: Descarga los cambios del repositorio remoto.
*   **`git branch [nombre-rama]`**: Crea una nueva rama.
*   **`git checkout [nombre-rama]`**: Cambia a otra rama.
*   **`git merge [nombre-rama]`**: Fusiona una rama con tu rama actual.
*   **`git log`**: Muestra el historial de commits.

## 2. Ejercicios Prácticos Individuales

### Ejercicio 1: Tu Primer Commit

1.  **Clona el repositorio**.
2.  **Crea un archivo** `tu_nombre.txt` y añade tu nombre.
3.  **Haz tu primer commit**: `git add tu_nombre.txt` y `git commit -m "Añadido mi archivo de presentación"`
4.  **Sube los cambios**: `git push`

### Ejercicio 2: Ramas (Branches)

1.  **Crea una rama**: `git branch mi-rama-de-trabajo`
2.  **Cambia a tu nueva rama**: `git checkout mi-rama-de-trabajo`
3.  **Haz un cambio**: Edita `tu_nombre.txt` y añade tu comida favorita.
4.  **Commit en la nueva rama**: `git add tu_nombre.txt` y `git commit -m "Añadida mi comida favorita"`
5.  **Sube tu rama**: `git push origin mi-rama-de-trabajo`

### Ejercicio 3: Fusionar (Merge)

1.  **Vuelve a la rama principal**: `git checkout main`
2.  **Fusiona tu rama**: `git merge mi-rama-de-trabajo`
3.  **Sube la rama principal**: `git push`

## 3. Proyecto en Grupo: Calculadora con Gitflow

Para practicar el trabajo en equipo, usaremos la aplicación de calculadora que se encuentra en el proyecto. **No necesitáis saber Android**, solo tendréis que hacer pequeños cambios en el código para practicar el flujo de Git.

El fichero principal de trabajo será `app/src/main/java/com/example/cursogit/ui/CalculatorScreen.kt`.

### Flujo de Trabajo: Gitflow

*   **`main`**: Código de producción.
*   **`develop`**: Rama de desarrollo principal.
*   **`feature/[nombre-feature]`**: Ramas para nuevas funcionalidades.

### Ejercicios para la Calculadora

Dividíos en grupos. Cada grupo realizará una pequeña modificación en `CalculatorScreen.kt`.

1.  **Grupo 1: Modificar un Botón**
    *   Crea una rama `feature/renombrar-boton-ac` a partir de `develop`.
    *   En `CalculatorScreen.kt`, busca el botón "AC" y cambia el texto a "C".
    *   Haz un commit con tu cambio y fusiona la rama de vuelta a `develop`.

2.  **Grupo 2: Añadir un Comentario**
    *   Crea una rama `feature/comentario-igual` a partir de `develop`.
    *   En `CalculatorScreen.kt`, busca el `onClick` del botón `=` y añade un comentario que diga `// TODO: Lógica de cálculo`.
    *   Haz un commit con tu cambio y fusiona la rama de vuelta a `develop`.

3.  **Grupo 3: Cambiar un Color**
    *   Crea una rama `feature/color-operadores` a partir de `develop`.
    *   En `CalculatorScreen.kt`, busca los botones de los operadores (`/`, `x`, `-`, `+`, `=`) y cambia su color por uno diferente (ej. `Color.Blue`).
    *   Haz un commit con tu cambio y fusiona la rama de vuelta a `develop`.

Una vez que todas las `feature` estén en `develop`, uno de vosotros creará una rama `release/v1.0` para simular el lanzamiento de la primera versión.

## 4. Ejercicios Avanzados (Opcional)

### Ejercicio 4: Resolución de Conflictos

Los conflictos de `merge` ocurren cuando dos personas modifican la misma línea de un fichero en ramas diferentes. ¡Es algo normal y aprender a resolverlos es una habilidad clave!

Vamos a simular un conflicto. Para ello, dos de vosotros (Becario A y Becario B) debéis coordinaros:

1.  Ambos partís de la rama `develop` actualizada (`git checkout develop` y `git pull`).

2.  **Becario A**:
    *   Crea una rama: `git checkout -b feature/conflicto-a`
    *   En `CalculatorScreen.kt`, cambia el texto del botón `.` (punto decimal) por `,` (coma decimal).
    *   Haz commit y sube la rama: `git add .`, `git commit -m "Cambio a coma decimal"`, `git push origin feature/conflicto-a`
    *   Fusiona tu rama en `develop`: `git checkout develop`, `git merge feature/conflicto-a`, `git push`.

3.  **Becario B (¡Importante! No actualices `develop` todavía)**:
    *   Crea una rama: `git checkout -b feature/conflicto-b`
    *   En `CalculatorScreen.kt`, cambia el texto del botón `.` (punto decimal) por `PUNTO`.
    *   Haz commit: `git add .`, `git commit -m "Cambio a punto decimal textual"`.

4.  **El Momento del Conflicto**:
    *   El Becario B ahora intentará fusionar su cambio en `develop`. Primero, se trae la última versión de `develop`, donde el Becario A ya ha subido su cambio: `git checkout develop`, `git pull`.
    *   Ahora, intenta fusionar su propia rama: `git merge feature/conflicto-b`.
    *   **¡BOOM!** Git os avisará de un `MERGE CONFLICT`.

5.  **Resolución**:
    *   Abrid el fichero `CalculatorScreen.kt`. Veréis unas marcas especiales:
        ```
        <<<<<<< HEAD
        CalculatorButton(symbol = ",", modifier = Modifier.weight(1f))
        =======
        CalculatorButton(symbol = "PUNTO", modifier = Modifier.weight(1f))
        >>>>>>> feature/conflicto-b
        ```
    *   Hablad entre vosotros y decidid qué cambio queréis conservar. Borrad las líneas que no queráis y también las marcas de Git (`<<<<<<<`, `=======`, `>>>>>>>`). Por ejemplo, si decidís dejar la coma, el resultado final debería ser:
        ```
        CalculatorButton(symbol = ",", modifier = Modifier.weight(1f))
        ```
    *   Guarda el archivo, añádelo al staging (`git add .`) y finaliza el merge con un commit (`git commit`). Git os propondrá un mensaje de commit por defecto, que podéis usar.
    *   ¡Conflicto resuelto! Ya podéis hacer `git push` para subir el resultado a `develop`.
