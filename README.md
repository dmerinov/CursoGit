# ¡Vamos a darle a Git! Guía de formación

¡Hola, equipo! Aquí tenéis la guía de ejercicios que usaremos en la sesión para practicar con Git.

## Parte 1: ¡A calentar! (Ejercicios Individuales)

¡Es vuestro turno para practicar los comandos básicos!

### Ejercicio 1: Tu primer `commit`

1.  **Haz un "Fork" de este repositorio**: En la esquina superior derecha de la página (GitHub, GitLab...), haz clic en el botón "Fork". Esto creará una copia personal del proyecto en tu cuenta.
2.  **Clona *tu* fork**: Una vez en la página de tu fork, clona ese repositorio a tu ordenador. ¡No el original!
3.  **Crea un archivo** `tu_nombre.txt` y añade tu nombre y apellidos.
4.  **Sube tu primer cambio** a tu repositorio remoto.

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

¡Genial! Ya habéis practicado en vuestro propio fork. Ahora, para colaborar de verdad, necesitamos un repositorio compartido.

### Preparando el repositorio del equipo

1.  **Elegid un "Repositorio de Equipo"**: Uno de vosotros ofrecerá su fork para que sea el repositorio central del equipo. El resto puede borrar su fork para no liarse (en `Settings` de vuestro fork, al final del todo, `Delete this repository`).
2.  **El líder del repo añade colaboradores**: El dueño del "Repositorio de Equipo" irá a la sección `Settings > Collaborators` de su fork y añadirá al resto del equipo.
3.  **Todo el equipo clona el Repositorio de Equipo**: Ahora, todos (incluido el líder) borrarán su carpeta local y clonarán de nuevo, pero esta vez, el "Repositorio de Equipo".

A partir de ahora, **todos trabajáis sobre la misma copia del proyecto**.

**¡Importante!** Antes de empezar, aseguraos de que estáis en la rama `develop`: `git checkout develop`

### Ejercicios en Grupo

El fichero de trabajo será `app/src/main/java/com/example/cursogit/ui/CalculatorScreen.kt`.

*   **Tarea 1 (Grupo 1)**: En la rama `feature/renombrar-boton`, buscad la línea del botón "AC" y cambiadle el texto a "Limpiar".

*   **Tarea 2 (Grupo 2)**: En la rama `feature/cambiar-color`, buscad los botones de los operadores (`/`, `x`, `-`, `+`, `=`) y cambiad su color. Por ejemplo, a `Color.Red` o `Color.Blue`.

*   **Tarea 3 (Grupo 3)**: En la rama `feature/modificar-display`, buscad el `Text` del display y cambiad el `"0"` inicial por vuestro nombre.

Cuando cada grupo termine, subid vuestra rama y **abrid una Pull Request (PR)** a la rama `develop` del repositorio de vuestro equipo. Asignad a un compañero para que la revise y, una vez aprobada, ¡la podréis fusionar!

## Parte 3 (Opcional): ¡Houston, tenemos un conflicto!

Este ejercicio es para simular un conflicto. Dos personas (Compañero/a A y B) haréis el mismo cambio de dos formas distintas.

1.  **Ambos partís de `develop`** y creáis vuestra propia rama (`feature/conflicto-a` y `feature/conflicto-b`).

2.  **Compañero/a A**:
    *   En `CalculatorScreen.kt`, buscad la línea del botón `.` y cambiad el texto por una coma (`,`).
    *   Sube los cambios, abre una Pull Request y fusiónala en `develop`.

3.  **Compañero/a B**:
    *   En `CalculatorScreen.kt`, buscad la línea del botón `.` y cambiad el texto por `PUNTO`.

4.  **El Conflicto**:
    *   El Compañero/a B intenta actualizar su rama con los últimos cambios de `develop` (`git pull origin develop`). ¡Aparecerá un conflicto!

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
