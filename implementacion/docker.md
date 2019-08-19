# Base de datos en Docker

## Comandos utilizados
(Correr dentro de carpeta raíz del repo)
```
**verifica contenedores abiertos de Docker**
docker ps

**verifica versión de Node** 
node -v

**verifica versión de npm**
npm -v

**crea contenedor basado en la imagen más reciente de MySQL**
docker run --name test-mysql-2 -p 3306 -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql:latest

**Agregar datos desde archivo**
docker exec -i test-mysql-2 mysql -pmy-secret-pw mysql < ./implementacion/tecnoimportsa.sql 

**Ejecuta contenedor (contraseña es "my-secret-pw")**
docker exec -it test-mysql-2 mysql -uroot -p








```


## Fuentes útiles
* [How to deploy and use a MySQL Docker container](https://www.techrepublic.com/article/how-to-deploy-and-use-a-mysql-docker-container/)
* [Handy MySQL Commands] (http://g2pc1.bu.edu/~qzpeng/manual/MySQL%20Commands.htm)
* [Running Java Application with MySQL in Linked Docker Containers Environment](https://www.linkedin.com/pulse/running-java-application-mysql-linked-docker-deepak-sureshkumar)
* [How to put your Java application into Docker container](https://medium.com/@wkrzywiec/how-to-put-your-java-application-into-docker-container-5e0a02acdd6b)
