# qa-final-project-java
Proiect integrator QA – test, build, push Docker image via CI/CD pipeline
 

1.Ce face proiectul?
Proiectul realizează un flux complet de integrare și livrare continuă (CI/CD) pentru o aplicație Java de testare automată. Acesta rulează testele definite în Maven, construiește automat imaginea Docker a aplicației și o publică în Docker Hub. Scopul proiectului este de a demonstra utilizarea combinată a instrumentelor Maven, Docker și GitHub Actions pentru testare, containerizare și automatizare a livrării codului.

2.Cum se ruleaza testele local? 
Pentru a rula testele local, se folosește următoarea comandă executată în terminal din directorul proiectului:

"mvn test"

Aceasta comandă rulează testele definite în fișierele sursă și generează rezultatele în folderul „target”.

3.Cum se construiește și se rulează imaginea Docker?
Pentru a construi și a rula imaginea Docker, am executat următoarele comenzi:

** docker build -t qa-final-project-java . **
** docker run -d --name qa-test qa-final-project-java:latest tail -f /dev/null **

Prima comandă creează imaginea Docker pe baza fișierului Dockerfile aflat în proiect, iar a doua comandă pornește un container nou folosind imaginea generată.

 # Status Badge
[![CI Pipeline - QA Final Project](https://github.com/sasha17todd/qa-final-project-java/actions/workflows/ci.yml/badge.svg)](https://github.com/sasha17todd/qa-final-project-java/actions/workflows/ci.yml)

