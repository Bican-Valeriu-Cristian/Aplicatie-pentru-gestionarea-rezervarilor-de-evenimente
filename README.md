# Aplicație pentru gestionarea rezervărilor de evenimente

Este o aplicație Spring Boot care permite gestionarea evenimentelor și a rezervărilor pentru acestea. Aplicația oferă un API RESTful care permite utilizatorilor să adauge, vizualizeze, actualizeze și șteargă evenimente, precum și să facă rezervări pentru acestea.

## Funcționalități

- Crearea unui eveniment cu detalii precum nume, locație, dată și capacitate maximă.
- Vizualizarea tuturor evenimentelor.
- Actualizarea unui eveniment existent.
- Ștergerea unui eveniment.
- Crearea unei rezervări pentru un eveniment.
- Vizualizarea tuturor rezervărilor.
- Ștergerea unei rezervări.

## Tehnologii folosite

- **Java 17**
- **Spring Boot 2.x**
- **Spring Web** pentru crearea API-ului RESTful.
- **Spring Data JPA** pentru interacțiunea cu baza de date.
- **H2 Database** (bază de date în memorie, folosită pentru testare).
- **Lombok** pentru a reduce boilerplate-ul de cod (generarea automată a getter-urilor, setter-urilor, toString-ului etc.).

## Cum să rulezi aplicația

### 1. Clonează acest repository:

```bash
git clone https://github.com/username/biki.git
