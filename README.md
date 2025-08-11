# API-Weapon-V2

## API RESTful

API REST de demostración desarrollada en **Spring Boot** con todas las operaciones CRUD.  
Funciona correctamente, excepto que, al estar desplegada en la versión gratuita, el servidor puede tardar varios minutos en iniciar, y todos los cambios realizados son temporales.

**Deploy del proyecto en Render utilizando Docker:**  
🔗 [https://api-weapon-v2.onrender.com/weapons](https://api-weapon-v2.onrender.com/weapons)

También cuenta con una interfaz en **React** para probar los endpoints de forma más visual:  
🔗 [https://weapon-api-ui.netlify.app/](https://weapon-api-ui.netlify.app/)
📂 **Repositorio UI:**  
[https://github.com/GustaAltF4/React-Practicas/tree/main/7-%20Weapon%20ui/weapon-ui](https://github.com/GustaAltF4/React-Practicas/tree/main/7-%20Weapon%20ui/weapon-ui)


---

## API Reference 🛠
Ejemplos de algunos endpoints implementados:

- **Get weapon by id or name**

```http
  GET /weapons/id/{id}
  GET /weapons/name/{name}
```


- **Post weapon**

```http
  POST /weapons/add
```

- **Update weapon**

```http
  PUT /weapons/update/{id}
```

- **Delete weapon**

```http
  DELETE /weapons/del/id/{id}
```



