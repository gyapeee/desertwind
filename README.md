# Desert Wind

Facelifting of old DesertWind game

# Backend

- run mvn compile to have the backend built
- run mvn typescript-generator:generate to have the DTO-s generated at the frontend side
- (optional) An alternative way to generate api dto-s both for backend and frontend(previous step shall be skipped)
    - Paste Jelenet_TEMPLATE.json into the https://app.quicktype.io/
        - Select language Java for backend and get the generated code from the site
            - Paste it into DTO files on the backend: src/main/java/com/koden/igaz/desertwind/dto
        - Select language TypeScript for backend and get the generated code from the site
            - Paste it into DTO files on the frontend: frontend/src/app/api

# Frontend

- run frontend/npm run open to have a dev env on localhost:4200