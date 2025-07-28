# 🎮 API REST de Juegos

API REST desarrollada en **Spring Boot** para la gestión de **videojuegos** en un servicio de librerías digitales.  
Implementa operaciones básicas de consulta y creación de juegos, utiliza **DTOs** para exponer solo los datos necesarios al cliente, y **mappers** para la conversión entre capas.

Este proyecto fue desarrollado por Thomas Muñoz, estudiante de la **Tecnicatura Universitaria en Programación** de la **Universidad Tecnológica Nacional (UTN)**.

---

## 📚 Tecnologías Utilizadas

- Java 17  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- H2 Database (en memoria)  
- Gradle  
- Lombok  
- MapStruct (opcional para el mapeo entre DTO y entidad)

---

## 🎯 Objetivos del Ejercicio

- Implementar una API REST con Spring Boot  
- Aplicar el patrón DTO para la transferencia de datos  
- Utilizar mappers para la conversión entre capas  
- Demostrar el uso de Spring Data JPA  
- Crear una estructura de proyecto clara y organizada

---

## ✨ Funcionalidades

- Consultar todos los juegos disponibles  
- Consultar juego por ID específico  
- Crear nuevos juegos en el sistema  
- Transferencia de datos optimizada con DTOs  
- Mapeo automático entre entidades y DTOs

---

## 🛠️ Tecnologías y Propósitos

| Tecnología       | Propósito                               |
|------------------|------------------------------------------|
| Spring Boot      | Framework principal                      |
| Spring Data JPA  | Persistencia de datos                    |
| Spring Web       | Exposición de la API REST               |
| JPA/Hibernate    | ORM y mapeo objeto-relacional            |
| Java             | Lenguaje de programación                 |
| H2 Database      | Base de datos en memoria para pruebas    |
| Gradle           | Sistema de construcción y dependencias   |

---

## 🎓 Conceptos Aplicados

### 🏛️ Arquitectura en Capas

- **Controller**: Manejo de peticiones HTTP y definición de endpoints REST  
- **Service**: Lógica de negocio y procesamiento de datos  
- **Repository**: Acceso a datos mediante Spring Data JPA  
- **Entity**: Modelo de dominio con anotaciones JPA  

---

### 📦 Patrón DTO (Data Transfer Object)

Separación de responsabilidades: los DTO encapsulan solo los datos necesarios para cada operación.  
Se implementan dos tipos:

- Un DTO para **crear** un juego (todos los campos)
- Un DTO para **mostrar** un juego (solo los datos necesarios para el cliente)

---

### 🔄 Mapper Pattern

- Conversión limpia entre capas (entidad ↔ DTO)  
- Lógica de conversión centralizada en una clase `Mapper`  
- Mejora la reutilización de código y la mantenibilidad  

---

### 🗃️ Spring Data JPA

- Uso de `JpaRepository` para acceder a los datos  
- Implementación automática de operaciones CRUD  
- Configuración simple con anotaciones estándar (`@Entity`, `@Id`, etc.)  

---

### 🌐 API REST

- Uso correcto de métodos HTTP (`GET`, `POST`, etc.)  
- Serialización/deserialización automática de JSON  
- Inyección de dependencias con `@Autowired` o constructor  

---

## 📬 Ejemplos de Uso

### 📌 Crear un juego  
**POST** `http://localhost:8080/api/games`

**Body (JSON):**
```json
{
	"title": "Hollow Knight",
	"gender": "Metroidvania",
	"description": "Juego de plataformas y exploración",
	"releaseYear": 2017,
	"price": 14.99,
	"developer": "Team Cherry"
}
```

#### 🧪 Probar con curl:
```bash
curl -X POST http://localhost:8080/api/games 	-H "Content-Type: application/json" 	-d '{
		"title": "Hollow Knight",
		"gender": "Metroidvania",
		"description": "Juego de plataformas y exploración",
		"releaseYear": 2017,
		"price": 14.99,
		"developer": "Team Cherry"
	}'
```

---

### 📌 Obtener todos los juegos  
**GET** `http://localhost:8080/api/games`

**Respuesta esperada:**
```json
[
	{
		"title": "Hollow Knight",
		"gender": "Metroidvania",
		"price": 14.99
	}
]
```

---

### 📌 Obtener juego por ID  
**GET** `http://localhost:8080/api/games/1`

**Respuesta esperada:**
```json
{
	"title": "Hollow Knight",
	"gender": "Metroidvania",
	"price": 14.99
}
```

---

## 👨‍💻 Autores

> Thomas Nicolas Muñoz, estudiante de la **Tecnicatura Universitaria en Programación**  
> **Universidad Tecnológica Nacional (UTN)**