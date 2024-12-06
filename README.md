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
Pentru a începe să lucrezi cu proiectul, clonează-l pe mașina ta locală folosind comanda:
#### git clone https://github.com/Bican-Valeriu-Cristian/biki.git
### 2. Intră în directorul proiectului:
După ce ai clonat repository-ul, navighează în directorul proiectului:
#### cd biki
### 3. Rulează aplicația:
Pentru a rula aplicația, poți folosi comanda Maven:
#### ./mvnw spring-boot:run
Dacă ai deja Maven instalat, poți să construiești și să rulezi aplicația folosind comanda:
#### ./mvnw clean install
#### java -jar target/biki-0.0.1-SNAPSHOT.jar

### 4. Testează API-ul
Poți testa API-ul folosind Postman, cURL sau orice alt instrument pentru interacțiunea cu API-urile RESTful. Iată câteva exemple de endpoint-uri pentru a interacționa cu aplicația:

GET toate evenimentele:
Endpoint: GET http://localhost:8080/api/evenimente

POST pentru a crea un eveniment:
Endpoint: POST http://localhost:8080/api/evenimente

#### Corpul JSON:
{
  "nume": "Concert Rock",
  "locatie": "Sala Palatului",
  "data": "2024-12-25T20:00:00",
  "capacitateMaxima": 500
}

GET toate rezervările:
Endpoint: GET http://localhost:8080/api/rezervari

POST pentru a crea o rezervare:
Endpoint: POST http://localhost:8080/api/rezervari

#### Corpul JSON:
{
  "numeClient": "Ion Popescu",
  "emailClient": "ion.popescu@example.com",
  "eveniment": {"id": 1},
  "numarLocuriRezervate": 2
}


## License

Pentru detalii despre licență, consultați fișierul LICENSE din acest director.
