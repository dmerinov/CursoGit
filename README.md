# ¡Vamos a darle a Git! Guía de formación

¡Hola, equipo! Aquí tenéis la guía de ejercicios que usaremos en la sesión para practicar con Git.

## Parte 1: ¡A calentar! (Ejercicios Individuales)

¡Es vuestro turno para practicar los comandos básicos!

### Ejercicio 1: Tu primer `commit`

1.  **Clona el repositorio** que os he indicado.
2.  **Crea un archivo** `tu_nombre.txt` y añade tu nombre y apellidos.
3.  **Sube tu primer cambio** al repositorio remoto.

### Ejercicio 2: Jugando con ramas

1.  **Crea una nueva rama** llamada `feature/mi-comida-favorita`.
2.  **En esa nueva rama**, edita el fichero `tu_nombre.txt` y añade en una nueva línea tu comida favorita.
3.  **Sube los cambios** de tu nueva rama al repositorio remoto.

### Ejercicio 3: Fusionando que es gerundio

1.  **Vuelve a la rama principal** (`main`).
2.  **Fusiona los cambios** de tu rama `feature/mi-comida-favorita` en `main`.
3.  **Sube el resultado** de la fusión a la rama `main` remota.

---

## Parte 2: Ahora, en equipo (Proyecto con Gitflow)

¡Genial! Ya domináis el flujo de trabajo individual. Ahora vamos a usar Gitflow para colaborar en un proyecto.

**¡Importante!** Antes de empezar, todo el equipo debe pasarse a la rama `develop`: `git checkout develop`

El fichero de trabajo será `app/src/main/java/com/example/cursogit/ui/CalculatorScreen.kt`.

### Ejercicios

En grupos, cada uno creará su propia rama `feature` a partir de `develop` y se encargará de una de las siguientes tareas:

*   **Tarea 1 (Grupo 1)**: En la rama `feature/renombrar-boton-ac`, buscad el botón "AC" y cambiadle el texto a "C".
*   **Tarea 2 (Grupo 2)**: En la rama `feature/comentario-igual`, buscad el `onClick` del botón `=` y añadid el comentario `// TODO: Lógica de cálculo`.
*   **Tarea 3 (Grupo 3)**: En la rama `feature/color-operadores`, buscad los botones de los operadores (`/`, `x`, `-`, `+`, `=`) y cambiad su color por `Color.Blue`.

Cuando cada grupo termine, fusionad vuestra rama `feature` de vuelta en `develop`.

## Parte 3 (Opcional): ¡Houston, tenemos un conflicto!

Este es un ejercicio avanzado para simular y resolver un conflicto de `merge`. Para ello, dos personas del equipo (Compañero/a A y Compañero/a B) tendréis que coordinaros:

1.  **Compañero/a A**:
    *   Crea una rama `feature/conflicto-a` desde `develop`.
    *   En `CalculatorScreen.kt`, cambia el texto del botón `.` por `,`.
    *   Sube los cambios y fusiona tu rama en `develop`.
2.  **Compañero/a B** (¡ojo!, sin actualizar `develop` todavía):
    *   Crea una rama `feature/conflicto-b` desde `develop`.
    *   En `CalculatorScreen.kt`, cambia el texto del botón `.` por `PUNTO`.
3.  **El Conflicto**:
    *   El Compañero/a B actualiza `develop` (`git pull`) e intenta fusionar su rama `feature/conflicto-b`. ¡Aparecerá un conflicto!
4.  **La Solución**:
    *   Hablad entre vosotros, abrid el fichero, decidid qué cambio queréis mantener, borrad las marcas de Git (`<<<<<<<`, `=======`, `>>>>>>>`) y finalizad el merge con un nuevo commit.

---

## Anexo: Chuleta de Comandos

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
