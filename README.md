# simple-api-service


- В "src/main/resources/application.properties" - прописать значения переменных для подключения к БД.

- Запустить приложение.

# Доступные методы:

- GET {{local_host}}countries
- GET {{local_host}}countries/{id}
- GET {{local_host}}countries/search?prefix={prefix}
- - принимает query param, пример - prefix = "Каз" (чувствителен к регистру)
- POST {{local_host}}countries
- - на вход принимает body, прим.:
  {
  "countryName": "String",
  "capital": "String",
  "population": Int,
  "isNatoMember": Boolean
  }
- PUT {{local_host}}countries/{id}
- - на вход принимает body, прим.:
     {
     "countryName": "String",
     "capital": "String",
     "population": Int,
     "isNatoMember": Boolean
     }
- DELETE {{local_host}}countries/{id}

# Коллекция Postman рядом с файлом README - "learning-local.postman_collection.json"