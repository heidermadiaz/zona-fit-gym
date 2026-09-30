🏋️ Zona Fit — Sistema de Gestión de Clientes

Aplicación web para la gestión de clientes de un gimnasio, desarrollada con tecnologías del ecosistema Java. El proyecto permite administrar la información de los clientes mediante operaciones CRUD y proporciona una interfaz web para consultar, registrar, actualizar y eliminar información.

Este proyecto forma parte de mi portafolio profesional como Ingeniero de Sistemas, con enfoque en desarrollo de software y backend Java.

📌 Descripción

Zona Fit es un sistema de gestión orientado a gimnasios que permite administrar los clientes registrados en la plataforma.

El proyecto fue desarrollado aplicando conceptos de:

Programación orientada a objetos.
Arquitectura por capas.
Inyección de dependencias.
Persistencia de datos.
Operaciones CRUD.
Acceso a bases de datos.
Desarrollo de interfaces web.
Separación entre presentación, lógica de negocio y acceso a datos.
🚀 Funcionalidades
Gestión de clientes
✅ Listar clientes.
✅ Registrar nuevos clientes.
✅ Editar información de clientes.
✅ Eliminar clientes.
✅ Consultar información almacenada.
✅ Validar operaciones antes de modificar los datos.
✅ Actualizar dinámicamente la tabla de clientes.
Interfaz
🖥️ Interfaz web con JSF.
🎨 Componentes visuales con PrimeFaces.
📊 Tabla dinámica para visualizar clientes.
📝 Formularios para registrar y editar información.
⚠️ Confirmación antes de eliminar registros.
🔄 Actualización AJAX de componentes.
🛠️ Tecnologías utilizadas
Tecnología	Uso
☕ Java	Lenguaje principal
🌱 Spring Boot	Framework de desarrollo
🌐 JSF	Desarrollo de interfaz web
🎨 PrimeFaces	Componentes de interfaz
🗃️ JPA / Hibernate	Persistencia de datos
🐬 MySQL	Base de datos
📦 Maven	Gestión de dependencias
🔀 Git	Control de versiones
🐙 GitHub	Repositorio del proyecto
💻 NetBeans	IDE utilizado durante el desarrollo
🏗️ Arquitectura

El proyecto utiliza una estructura organizada por responsabilidades:

src
└── main
    ├── java
    │   └── gm.zona_fit
    │       ├── controlador
    │       ├── modelo
    │       ├── repositorio
    │       └── servicio
    │
    └── resources
        └── ...
Capas principales

Controlador

Gestiona las interacciones entre la interfaz y la lógica de negocio.

IndexControlador

Modelo

Representa las entidades utilizadas por la aplicación.

Cliente

Servicio

Contiene la lógica relacionada con las operaciones de negocio.

IClienteServicio

Repositorio

Gestiona la persistencia y comunicación con la base de datos.

🔄 Flujo de funcionamiento
Usuario
   │
   ▼
Interfaz JSF / PrimeFaces
   │
   ▼
Controlador
   │
   ▼
Capa de Servicio
   │
   ▼
Repositorio / JPA
   │
   ▼
Base de datos MySQL
📋 Operaciones CRUD

El sistema implementa las operaciones principales de gestión de clientes:

CREATE  → Registrar cliente
READ    → Consultar clientes
UPDATE  → Actualizar cliente
DELETE  → Eliminar cliente
