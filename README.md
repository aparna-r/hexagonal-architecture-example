# hexagonal-architecture-example
Repo contains a sample project to demonstrate concepts of hexagonal architecture

There are 3 main components in hexagonal architecture:

## Domain

Exposes following **ports** for inbound and outbound interactions in form of interfaces

[PaymentService](./src/main/java/com.hexagonal/domain/port/PaymentService.java)

[PaymentRepository](./src/main/java/com.hexagonal/domain/port/PaymentRepository.java) 


## Application 

**inbound adapter**

[PaymentController](./src/main/java/com.hexagonal/application/adapter/PaymentController.java)
 

## Infrastructure 

**outbound adapter**

[PaymentRepositoryImpl](./src/main/java/com.hexagonal/infrastructure/adapter/PaymentRepositoryImpl.java)

![alt text][class_diagram.png]