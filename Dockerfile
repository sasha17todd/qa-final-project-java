# Etapa 1 – Build (folosim Maven + JDK 21)
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# Copiem fișierul pom.xml pentru cache-ul de dependențe
COPY pom.xml .
RUN mvn -q -e -DskipTests dependency:go-offline || true

# Copiem restul proiectului
COPY . .

# Rulăm testele (nu avem teste reale, dar verificăm build-ul)
RUN mvn -q -e test

# Etapa 2 – Runtime (folosim doar JRE 21 pentru o imagine mai mică)
FROM eclipse-temurin:21-jre
WORKDIR /app

# (Dacă am avea un .jar de rulat, l-am copia aici din etapa anterioară)
# Exemplu: COPY --from=build /app/target/app.jar /app/app.jar
# CMD ["java", "-jar", "app.jar"]

# Pentru acest proiect doar verificăm că imaginea s-a construit corect
CMD ["bash", "-lc", "echo 'Image built for QA Final Project; tests ran in build stage.'"]
