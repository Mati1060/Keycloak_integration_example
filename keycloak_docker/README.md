# keycloack docker 
## Setup
- you can change the values in the .env file to your liking 
```env
POSTGRES_DB=keycloak_db
POSTGRES_USER=keycloak_db_user
POSTGRES_PASSWORD=keycloak_db_user_password
KEYCLOAK_ADMIN=admin
KEYCLOAK_ADMIN_PASSWORD=password
```
those are the default values feel free to change them

    you can change the values in the docker-compose file your liking like changing the port


## Run the container
to run the containne simply execute the folowing command
```shell
$ docker-compose up -d
```

## Go to localhost:{choosen_port} to login on to the admin page
