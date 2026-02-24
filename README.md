# ¡Vamos a darle a Git! Guía de formación

¡Hola, equipo! Aquí tenéis la guía de ejercicios que usaremos en la sesión para practicar con Git.

## Parte 1: ¡A calentar! (Ejercicios Individuales)

¡Es vuestro turno para practicar los comandos básicos!

### Ejercicio 1: Tu primer `commit`

1.  **Clona el repositorio**.
2.  **Crea un archivo** `tu_nombre.txt` y añade tu nombre y apellidos.
3.  **Sube tu primer cambio** al repositorio remoto.

### Ejercicio 2: Jugando con ramas

1.  **Crea una nueva rama** llamada `feature/mi-comida-favorita`.
2.  **En esa nueva rama**, edita el fichero `tu_nombre.txt` y añade en una nueva línea tu comida favorita.
3.  **Sube los cambios** de tu nueva rama al repositorio remoto.

### Ejercicio 3: Fusionando que es gerundio

1.  **Vuelve a la rama de desarrollo** (`develop`).
2.  **Fusiona los cambios** de tu rama `feature/mi-comida-favorita` en `develop`.
3.  **Sube el resultado** de la fusión a la rama `develop` remota.

---

## Parte 2: Ahora, en equipo (Proyecto con Gitflow)

¡Genial! Ahora que domináis el flujo individual, vamos a usar Gitflow para colaborar en un proyecto.

**¡Importante!** Antes de empezar, todo el equipo debe pasarse a la rama `develop`: `git checkout develop`

El fichero de trabajo será `app/src/main/java/com/example/cursogit/ui/CalculatorScreen.kt`. El objetivo es hacer pequeños cambios visuales en la interfaz. No necesitáis saber programar, ¡solo buscar y reemplazar texto!

### Ejercicios

En grupos, cada uno creará su propia rama `feature` a partir de `develop` y se encargará de una de las siguientes tareas:

*   **Tarea 1 (Grupo 1)**: En la rama `feature/renombrar-boton`, buscad la línea del botón "AC" y cambiadle el texto a "Limpiar".

*   **Tarea 2 (Grupo 2)**: En la rama `feature/cambiar-color`, buscad los botones de los operadores (`/`, `x`, `-`, `+`, `=`) y cambiad su color. Por ejemplo, a `Color.Red` o `Color.Blue`.

*   **Tarea 3 (Grupo 3)**: En la rama `feature/modificar-display`, buscad el `Text` del display y cambiad el `"0"` inicial por vuestro nombre.

Cuando cada grupo termine, subid vuestra rama y **abrid una Pull Request (PR)** en la plataforma (GitHub, GitLab...). Una Pull Request es una solicitud para integrar vuestros cambios en `develop`. Es el momento donde el resto del equipo puede revisar el código. Asignad a un compañero de otro grupo para que la revise y, una vez aprobada, ¡la podréis fusionar!

## Parte 3 (Opcional): ¡Houston, tenemos un conflicto!

Este es un ejercicio para simular y resolver un conflicto de `merge`. Dos personas del equipo (Compañero/a A y Compañero/a B) haréis el mismo cambio de dos formas distintas.

1.  **Ambos partís de `develop`** y creáis vuestra propia rama (`feature/conflicto-a` y `feature/conflicto-b`).

2.  **Compañero/a A**:
    *   En `CalculatorScreen.kt`, buscad la línea del botón `.` y cambiad el texto por una coma (`,`).
    *   Sube los cambios, abre una Pull Request y fusiónala en `develop`.

3.  **Compañero/a B**:
    *   En `CalculatorScreen.kt`, buscad la línea del botón `.` y cambiad el texto por `PUNTO`.

4.  **El Conflicto**:
    *   El Compañero/a B intenta actualizar su rama con los últimos cambios de `develop` (`git pull origin develop`). ¡Aparecerá un conflicto en esa línea!

5.  **La Solución**:
    *   Hablad entre vosotros, decidid qué cambio queréis conservar, borrad las marcas de Git (`<<<<<<<`, `=======`, `>>>>>>>`) y finalizad el merge.

---

## Anexo: Chuleta de Comandos

*   **`git clone [URL]`**: Clona un repositorio remoto.
*   **`git status`**: Muestra el estado de los archivos.
*   **`git add [archivo]`**: Añade un archivo al "staging".
*   **`git commit -m "[mensaje]"`**: Guarda los cambios en local.
*   **`git push`**: Sube tus commits al remoto.
*   **`git pull`**: Descarga los cambios del remoto.
*   **`git branch [nombre-rama]`**: Crea una nueva rama.
*   **`git checkout [nombre-rama]`**: Cambia a otra rama.
*   **`git merge [nombre-rama]`**: Fusiona una rama con la actual.
*   **`git log`**: Muestra el historial de commits.
