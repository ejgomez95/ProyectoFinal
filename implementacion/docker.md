# Base de datos en Docker 
(Asume que se ha instalado Docker en Linux)

## Comandos utilizados
(Correr dentro de carpeta raíz del repo)

### Verifica contenedores abiertos de Docker
``` docker ps```

### Verifica versión de Node
```node -v```

### Verifica versión de npm
```npm -v```

### Crea contenedor basado en la imagen más reciente de MySQL
```docker run --name proyecto -p 3306 -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql:latest```

### Agregar datos desde archivo
```docker exec -i proyecto mysql -pmy-secret-pw mysql < ./implementacion/tecnoimportsa.sql ```

### Ejecuta contenedor (contraseña es "my-secret-pw")
```docker exec -it proyecto mysql -uroot -p```

### (Dentro de la instancia de MySQL)
```use tecnomiportsa;```

(Para la DB he creado combinaciones de usuario contraseña con primer nombre/primer apellido de los miembros del grupo, sin tildes)
## Para conectar con Intellij IDEA
1. Ir a Settings -> Plugins, descargar el plugin de Docker
2. Correr ```docker inspect proyecto``` en la terminal
3. Apuntar la IPAddress (en mi caso 172.17.0.2, de ley les sale lo mismo)
4. Ahora en el DB Browser de Intellij:
```
Name: tecnoimportsa@IPAddress
Host: IPAddress
Database: tecnoimportsa

User: nombre
Password: apellido
```
Denle click a Test Connection y debería funcionar. ^^


## Fuentes útiles
* [How to deploy and use a MySQL Docker container](https://www.techrepublic.com/article/how-to-deploy-and-use-a-mysql-docker-container/)
* [Handy MySQL Commands](http://g2pc1.bu.edu/~qzpeng/manual/MySQL%20Commands.htm)
* [Running Java Application with MySQL in Linked Docker Containers Environment](https://www.linkedin.com/pulse/running-java-application-mysql-linked-docker-deepak-sureshkumar)
* [How to put your Java application into Docker container](https://medium.com/@wkrzywiec/how-to-put-your-java-application-into-docker-container-5e0a02acdd6b)
* [Create a database in a Docker container for local development](https://developer.ibm.com/tutorials/docker-dev-db/)
