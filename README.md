# CarrenoRangel-post2-u10

Pruebas E2E con Selenium (Page Object Model), Postman/Newman y GitHub Actions.

## Requisitos
- Java 17
- Maven 3.9+
- Google Chrome estable
- Node.js 18+ con npm
- Postman Desktop o Web

## Ejecutar Selenium (headless)
mvn -Dtest=TareasE2ETest test

## Ejecutar Postman con Newman
newman run postman/ColeccionToDo.json --environment postman/env-local.json

## CI con Newman
Workflow en .github/workflows/api-tests.yml.

## Evidencias
Coloca las capturas en img/:
- img/checkpoint1-selenium.png
- img/checkpoint2-postman.png
- img/checkpoint3-actions.png
