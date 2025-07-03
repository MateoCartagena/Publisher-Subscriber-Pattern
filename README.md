# [Informe](./Publisher-Subscriber-Pattern/blob/main/Taller%20Patrón%20Publish%20and%20Suscriber%20Channel.pdf)

# 📨 camel-pubsub-lab

Simulación de un sistema de notificaciones basado en el **patrón Publish/Subscribe** utilizando **Apache Camel** y **RabbitMQ**. Este proyecto demuestra cómo desacoplar productores y consumidores en una arquitectura robusta y tolerante a fallos, permitiendo incluso pausar y reanudar consumidores dinámicamente.

---

## 🚀 Tecnologías utilizadas

| Herramienta           | Propósito                                                |
|------------------------|----------------------------------------------------------|
| 🐪 Apache Camel        | Integración de sistemas, definición de rutas de mensajes |
| 🐇 RabbitMQ            | Broker de mensajería tipo pub/sub                        |
| ☕ Java 11+             | Lenguaje de desarrollo                                   |
| 🧪 Spring Boot         | Framework para facilitar configuración y ejecución       |
| 🐳 Docker + RabbitMQ   | Contenedor para el broker de mensajes                    |
| 🛠 Maven               | Gestión del proyecto y dependencias                      |

---

## 📚 Resumen del proyecto

Este laboratorio simula un sistema de alerta en el que:

- Un **publisher** genera un mensaje cada 15 segundos.
- Dos **consumidores**, de forma **independiente y desacoplada**, reciben el mismo mensaje desde RabbitMQ.
- Cada consumidor está conectado a su **propia cola durable**.
- Los consumidores pueden ser **activados o pausados dinámicamente** mediante endpoints REST.
- Los mensajes son **persistentes**, y si un consumidor está pausado, los mensajes se almacenan hasta que se reanude.

---
