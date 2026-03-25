# 🏥 Hospital Management Backend – Spring Boot + Spring Security + PostgreSQL

## 📌 Overview
This is a **backend-only** Spring Boot project that implements a **role-based access control system** for managing hospital operations.  
It demonstrates **Spring Boot architecture**, **REST API creation**, **Spring Security with role/permission-based authorization**, and **Hibernate + Spring Data JPA integration** with PostgreSQL.

The system manages entities like **Patients, Doctors, Appointments, and Departments**, including their **relationships** and **permissions** for granular access control.

---

## 🛠️ Features Implemented

### **Spring Boot & Core Concepts**
- ✅ **Spring Boot Architecture** & **Internal Flow**
- ✅ **Spring MVC Lifecycle** & `DispatcherServlet` working
- ✅ **REST API creation** with **all HTTP methods** (`GET`, `POST`, `PUT`, `DELETE`)
- ✅ Exception handling using `@ControllerAdvice` and custom exception classes

### **Data Layer (Hibernate + JPA)**
- ✅ **Hibernate ORM** + **Spring Data JPA** integration
- ✅ Using **EntityManager** for advanced ORM operations
- ✅ Writing **Derived Queries**, **Custom JPQL Queries**, and **Native SQL Queries**
- ✅ Implemented **DTO Projection** for performance optimization
- ✅ **Pagination** and **Sorting** for large datasets
- ✅ **Performance tuning** & N+1 query resolution using `@EntityGraph` and `fetch join`

### **Entity Relationships**
- ✅ **One-to-One** (e.g., User ↔ Patient / User ↔ Doctor)
- ✅ **One-to-Many** (e.g., Doctor ↔ Appointments)
- ✅ **Many-to-Many** (e.g., Doctors ↔ Departments)
- ✅ **Cascading operations** for entity persistence and deletion

### **Security & Role-Based Access Control**
- ✅ Added **Roles** (`ADMIN`, `DOCTOR`, `PATIENT`) to **User Entity**
- ✅ Linked **User** entity with **Doctor** and **Patient**
- ✅ Integrated **Spring Security** with **Role & Permission-based Authorization**
- ✅ **Authorize routes** based on role hierarchy
- ✅ **Onboard Doctor** functionality restricted to **ADMIN** role
- ✅ **Access Denied Exception** handling with custom error messages
- ✅ **Granular Permission Control** at method level using `@PreAuthorize` and `@PostAuthorize`

---

## 🗄️ Database – PostgreSQL
- PostgreSQL is used for **persistent data storage**
- Schema includes:
  - **User**
  - **Role**
  - **Permission**
  - **Doctor**
  - **Patient**
  - **Insurance**
  - **Appointment**
  - **Department**
- Relationships are mapped using **JPA annotations**

📷 **Entity Relationship Diagram (ERD)**  

<p align="left">
  <img src="ER-Model.png" alt="ERD Diagram" width="500"/>
</p>


---



## 🚀 Tech Stack
- **Backend**: Spring Boot, Spring MVC, Spring Security
- **ORM**: Hibernate + Spring Data JPA
- **Database**: PostgreSQL
- **Language**: Java 17+
- **Build Tool**: Maven
- **Security**: Role & Permission based Access Control
---

## 🎯 Learnings from this Project

Through this project, I deepened my understanding of **Spring Boot**, **Spring Security**, **Hibernate**, and **PostgreSQL** by implementing real-world hospital management features.  
Here’s what I learned:

### **Spring Boot & Architecture**
- Understanding **Spring Boot architecture** and **internal flow**
- Working with **Spring MVC lifecycle** and the **DispatcherServlet** request handling process
- Creating **REST APIs** with all HTTP methods (`GET`, `POST`, `PUT`, `DELETE`)
- Structuring a **modular and maintainable** Spring Boot application

### **Hibernate + Spring Data JPA**
- Integrating **Hibernate ORM** with **Spring Data JPA**
- Using **EntityManager** for custom persistence operations
- Writing **derived queries**, **JPQL queries**, and **native SQL queries**
- Implementing **DTO projection** to optimize query results
- Using **Pagination** and **Sorting** for large datasets
- Applying **performance tuning** techniques and resolving **N+1 queries**

### **Entity Relationships**
- Mapping entities with:
  - **One-to-One** relationships (e.g., User ↔ Patient / User ↔ Doctor)
  - **One-to-Many** relationships (e.g., Doctor ↔ Appointments)
  - **Many-to-Many** relationships (e.g., Doctors ↔ Departments)
- Configuring **cascading operations** for save/update/delete
- Designing and maintaining **Entity Relationship Diagrams (ERDs)**

### **Spring Security & Role-Based Access Control**
- Adding **roles** to the User entity (`ADMIN`, `DOCTOR`, `PATIENT`)
- Associating **User** entity with **Doctor** and **Patient**
- Integrating **Spring Security** for authentication & authorization
- Authorizing **routes** based on roles
- Restricting **doctor onboarding** to **ADMIN** role
- Handling **Access Denied Exceptions** with custom error responses
- Implementing **granular permission control** at method level using:
  - `@PreAuthorize`
  - `@PostAuthorize`

### **Database (PostgreSQL)**
- Designing normalized database tables
- Defining entity relationships via **JPA annotations**
- Working with **real-world healthcare data** for doctors, patients, departments, and appointments
- Visualizing relationships using **ERD diagrams**


---

📌 **This project not only improved my backend development skills but also strengthened my understanding of enterprise-grade application design with security and scalability in mind.**


-----

