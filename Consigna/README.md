📋 Consigna del Ejercicio - API REST para Gestión de Juegos 🎮

🎯 Objetivo Principal
Crear una API REST en Spring Boot para gestionar los juegos de un servicio de librerías digitales, utilizando DTOs para exponer solo los datos necesarios al cliente, y un mapper para la conversión entre capas. Se aconseja la utilización de un DTO para cargar nuevos juegos con toda su información correspondiente, y otro DTO que permita al usuario obtener solo la información necesaria de los juegos.

🛠️ Requerimientos Técnicos

🏗️ Estructura de Paquetes Sugerida
com.example/
├── Controller/
├── Service/
├── Repository/
├── Entity/
├── DTO/
└── Mapper/

📦 Dependencias de Spring Boot
- spring-boot-starter-web (API REST)
- spring-boot-starter-data-jpa (Persistencia)
- Base de datos H2 (para desarrollo)

📦 Patrón DTO (Data Transfer Object)
- Crear DTOs específicos para diferentes operaciones
- Exponer solo los datos necesarios en cada endpoint
- Separar el modelo interno de la API pública
- Se aconseja un DTO para recibir datos para crear un nuevo juego, y un DTO para enviar datos de respuesta al cliente (solo con la información que pueda ser importante para el cliente)

🔄 Patrón Mapper
- Implementar conversiones entre Entity y DTO
- Centralizar la lógica de mapeo
- Mantener código limpio y reutilizable

🌐 Endpoints Requeridos

| Método HTTP | Endpoint     | Descripción                   |
|-------------|--------------|-------------------------------|
| GET         | /games       | Obtener todos los juegos      |
| GET         | /games/{id}  | Obtener juego por ID          |
| POST        | /games       | Crear nuevo juego             |

🧪 Pruebas Esperadas
El proyecto debe permitir:
- Crear juego via POST con todos los datos
- Listar juegos via GET con información resumida
- Consultar juego específico via GET por ID
- Persistencia en base de datos H2
- Conversión automática JSON ↔ DTO

💡 Consejos para la Implementación
- Empezar por la entidad y configurar JPA correctamente
- Crear los DTOs antes que el mapper
- Implementar el mapper con métodos estáticos simples
- Repository simple heredando de JpaRepository
- Service delgado enfocado en lógica de negocio
- Controller limpio enfocado solo en HTTP

🎓 Conceptos de Aprendizaje
Al completar este ejercicio, habrás aplicado:
- API REST con Spring Boot
- Patrón DTO para transferencia de datos
- Patrón Mapper para conversión entre capas
- Spring Data JPA para persistencia
- Inyección de dependencias con Spring
- Arquitectura en capas bien definida

⏱️ Tiempo estimado: 4-6 horas  
🎯 Dificultad: Intermedio  
📘 Prerequisitos: Conocimientos básicos de Spring Boot, JPA y API REST