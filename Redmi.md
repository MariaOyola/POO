## Actividad de Docker y Ubuntu 
-----------------------------------------------

Aprendiz : María José Rodríguez Oyola

Ficha: 3145555
_____________________________________________________________

## 1. Docker con sus 4 motores de base de datos 

en este punto crearemos el docker compose con los 4 motores  de base de datos que son: 

- Mysql 
- SQL server 
- PosgresSQL
- MongoDB


### 1.1 creamos el Archivo base 

> Creamos una carpeta para este punto: 

![alt text](image.png)

> Dentro de esa carpeta creamos el Archivo que sera nuestro Docker compose.yml: 

![alt text](image-1.png)


> el Archivo Docker compose.yml se vera algo asi:

![alt text](image-2.png)

Explicacion del documento Docker Compose.yml: 

Versión del formato de Docker Compose.

> version: '3.9'

Definimos  los contenedores que vamos a crear.

> services

Expecificamos los 4 motoes de base de datos 

> mysql, postgres, sqlserver, mongo

Nombre con el que podemos  ver y acceder al contenedor.

>container_name

Imagen oficial de cada base de datos desde Docker

> image

Variables de entorno para usuarios, contraseñas y bases por defecto.

>environment

Abre los puertos al sistema host (Windows).

> ports

Guarda los datos en tu disco para que no se borren al reiniciar.

> volumes 

Todos comparten una red llamada backend para comunicarse.

> networks

-------------------------------------------------------------
### 1.2 ejecutar los motores 

despues de crear el archivo Docker compose, lo que se hace es especificar la direccion en la que se guarda el archivo  y así miara como se ejecuta los motores 

> C:\Users\USUARIO\Downloads\Docker - bases> 

> docker-compose up -d

![alt text](image-3.png)

y listo se crean las imagenes de los 4 motores de base de datos

![alt text](image-4.png)

--------------------------------------------------------------
### 1.3 Ahora vamos a probar las conecciones de cada motor (Mysql)

- con el motor de Mysql, se ingresa con el comando 

> docker exec -it mysql_db mysql -u root -p

> contraseña: 12345

Creamos la base de datos que es feria junto con sus esquemas:

![alt text](image-5.png)

Se asignan sus logis, contraseñas y permisos del usuario : 

![alt text](image-6.png)

Verificamos que se creen la base de datos junto son su informacion 

![alt text](image-7.png)

Creamos los SP para sus 1000 inserciones : 

![alt text](image-8.png)
![alt text](image-9.png)
![alt text](image-10.png)

### 1.4 (Opcional) Si se desea ver las tablas en Mysql 

si se quiere ver los diagramas puedes crear una nueva connecion el cual puedes ver las tablas creadas por el CMD
(para esto se debe poner el puerto externo que es 3309)

![alt text](image-11.png)

se muestra los procedimientos

![alt text](image-12.png)


### 1.5  Ahora vamos a probar las conecciones de cada motor (SQL Server)

-  con el motor de SQL server, se ingresa con el comando :  
>  docker exec -it sqlserver_db /opt/mssql-tools18/bin/sqlcmd -S localhost,1433 -U SA -P "12345Abc*" -C

ingresamos como usuario root para poder intalar las herramientas de SQL server.
Esto es con el fin de poder ejecutar las base de datos y poder usar SQL sin problemas.  

>  Conntraseña : 12345Abc

Creamos la base de datos que es feria junto con sus esquemas:

![alt text](image-13.png)

Se asignan sus logis, contraseñas y permisos del usuario :

![alt text](image-14.png)

Verificamos que se creen la base de datos junto son su informacion

![alt text](image-15.png)
![alt text](image-16.png)
![alt text](image-17.png)


 ### 1.6 (Opcional) Si se desea ver las tablas en SQL server 

![alt text](image-18.png)

### 1.7   Ahora vamos a probar las conecciones de cada motor ( db_postgres)

- con el motor de Postgres, se ingresa con el comando

> docker exec -it postgres_db bash

y se ingresa en el usuario que creamos en nuestro postgres

> psql -U maria -d db_postgres

Creamos la base de datos que es feria junto con sus esquemas:

![alt text](image-19.png)

Se asignan sus logis, contraseñas y permisos del usuario:

![alt text](image-20.png)

Verificamos que se creen la base de datos junto son su 
informacion: 

![alt text](image-21.png)
![alt text](image-22.png)
![alt text](image-23.png)



### 1.8   Ahora vamos a probar las conecciones de cada motor ( mongo db)


- con el motor de Postgres, se ingresa con el comando

> docker exec -it mongo_db mongosh "mongodb://maria:12345@mongo:27017/?authSource=admin"


Creamos la base de datos que es feria junto con sus esquemas:

![alt text](image-47.png)

Se asignan sus logis, contraseñas y permisos del usuario:

![alt text](image-48.png)

se realizan los procedimientos almacenados con susu 1000 inserciones: 

![alt text](image-49.png)

se muestra sus 100 inserciones:

![alt text](image-50.png)
![alt text](image-51.png)

## 2 . Contenedor de Ubuntu (cliente intermedio)

Ahora vamos a realizar un docker file en el cual vamos a tener el paso a paso de nuestra intalacion de la  imagen de ubuntu: 

![alt text](image-30.png)

--------------------------------

#### Base 

- Define que la imagen base es Ubuntu 22.04.
- Todo lo que se haga en este Dockerfile s

> FROM ubuntu:22.04

#### Evitar preguntas interactivas

- Esto evita que apt-get muestre prompts interactivos durante la instalación de paquetes.

- Muy útil para que la construcción del contenedor no se detenga pidiendo confirmaciones.

> ENV DEBIAN_FRONTEND=noninteractive

#### Instalar clientes de bases de datos y utilidades

> apt-get update -y → actualiza la lista de paquetes disponibles.

> apt-get install -y → instala paquetes sin pedir confirmación.

#### Paquetes instalados:

> mysql-client → cliente de MySQL/MariaDB.

> postgresql-client → cliente de PostgreSQL.

> mongodb-clients → cliente de MongoDB.

> curl → herramienta para hacer solicitudes HTTP.

> gnupg → para manejar claves GPG, necesario para repositorios seguros.

> apt-transport-https → permite que apt descargue paquetes vía HTTPS.

> lsb-release → obtiene información de la versión de Ubuntu.

> rm -rf /var/lib/apt/lists/* → limpia la cache de paquetes para reducir el tamaño de la


### 2.1 Inicialisamos el docker file que creamos para la imagen de ubuntu 

Lee el archivo docker-compose.yml, busca cada servicio que tenga una sección build: (por ejemplo, con un Dockerfile).
Ejecuta las instrucciones del Dockerfile para construir la imagen (como FROM, RUN, COPY, etc.).
Etiqueta la imagen con el nombre definido en el Compose
guardando  las imágenes en mi sistema local para poder usarlas después.

![alt text](image-32.png)
![alt text](image-33.png)
-----------------------------------------------------------------------------------------

### 2.2 Iniciamos los contenedores definidos en el archivo docker-compose.yml. 

insertamos este comando, con el fin de levantar los contenedores
> docker-compose up -d

![alt text](image-34.png)

### 2.3 Probar la conexión a cada motor de base de datos usando los clientes instalados:

#### - Mysql 

Probamos la conexion del motor Mysql, pero antes de eso debo ir a mi contenedor Mysql y otorgar permisos para que me pueda salir la la base de datos feria_1 en el cliente Ubuntu. 

![alt text](image-35.png)

luego si ejecutamos el comando: 

> mysql -h mysql -u maria -p

y  miramos que se muestre en la base de datos feria_1; 

![alt text](image-37.png)
![alt text](image-38.png)



#### - PostgresSQL 

Probamos la conexion del motor PostgresSQL, ejecutamos el comando: 

> psql -h postgres -U maria -d db_postgres

![alt text](image-39.png)

y  miramos que se muestre la base de datos feria_1; 

![alt text](image-40.png)

y miramos que se muestre en la base de datos feria_1;

![alt text](image-41.png)
![alt text](image-42.png)
![alt text](image-43.png)


#### - SQL Server; 

Probamos la conexion del motor SQL Server, ejecutamos el comando: 


> /opt/mssql-tools18/bin/sqlcmd -S sqlserver -U SA -P "12345Abc*" -C

![alt text](image-44.png)

y miramos que se muestre en la base de datos feria_1;

![alt text](image-45.png)
![alt text](image-46.png)


#### - Mongo 
Probamos la conexion del motor Mongo, ejecutamos el comando:

> mongosh "mongodb://maria:12345@mongo:27017/db_mongo?authSource=admin"

![alt text](image-52.png)

y miramos que se muestre en la base de datos feria_1;

![alt text](image-53.png)


-----------------------------------------------------------


## 3  .  Docker dentro de Ubuntu (Docker in Docker)

Crea un archivo nuevo llamado

> Dockerfile.ubuntu-client-dind

Y dentro poner  esto: 

![alt text](image-55.png) 

que nos funciona para lo siguiente : 

> FROM ubuntu_client:latest → Esto usa la imagen que ya funciona, con todos tus clientes instalados (MySQL, PostgreSQL, mongosh, SQL Server tools).

Instalamos Docker dentro de esa imagen, sin tocar nada más.

> usermod -aG docker root permite que dentro del contenedor puedas usar Docker sin (sudo).

### 3.1 Accede al contenedor DinD


Accede al contenedor DinD y miramos su version 

![alt text](image-56.png)

Ahora vamos a realizar otro doker compose para ede docker   DinD : 

El Archivo se llama :  
> docker-compose-nivel4.yml


![alt text](image-59.png)

Ahora vamos al archivo para levantar los comandos 
ejecutamos 

> C:\Users\USUARIO\Descargas\Docker - bases --- Este es para saber donde se encuantra nuestro Archivo compose.yml

> docker-compose-nivel4.yml --------- este para expecificar el archivo 

![alt text](image-60.png)

y listooooooooo ya tenemos: 

- Dcker intalado dentro de ubuntu. 
- ya temenos los 4 motores de base de datos.
- y los puertos definidos de cada  motor ( se ven en la imagen que se llama docker-compose-nivel4.yml).

---------------------------------

## 4  Proxy / manejadores

Primero verificamos que todo los contenedores enten corriendo
- Para ver los puertos del Docker con sus 4 motores de base de datos se ejecuta 

> cd "C:\Users\USUARIO\Downloads\Docker - bases"

> docker-compose up -d 

![alt text](image-62.png)

- Para ver los puertos del Doker dentro del Ubuntu con sus 4 motores de base de datos se ejecuta 

> cd "C:\Users\USUARIO\Downloads\Docker - bases"

> docker-compose -f docker-compose-nivel4.yml up -d   

![alt text](image-63.png)

Docker y Docker dentro de Ubuntu ( puertos)

![alt text](image-61.png)
------------------------------------------------------------------------------

### 4.1 Descarga de DBeaver

En mi caso voy a intalar un DBeaver para conectar los puertos

![alt text](image-64.png)
--------------------------------------------------------------------------

## MYSQL 

despues de descargarlo, ingreso a una nueva coneccion y ingreso Mysql : 

![alt text](image-65.png)

Se conecta los puertos del Docker que esta dentro de Ubuntu que es el 3307:3306:  

![alt text](image-70.png)

 y efectivamente se ve la base de datos feria con sus tablas creadas ( la base de datos funcional ) y sus 1000 inserciones: 

![alt text](image-66.png)



## Postgres SQL 
Ingresamsos los puertos que que asignamos en nuestro docker dentro de ubuntu 

![alt text](image-69.png)

y se muestra que si se se conectaron la base de datos feria con exito: puerto 
5433:5432 : 

![alt text](image-68.png)

----------------------------

## SQL SERVER
-------------------------
Se conecta los puertos del Docker que esta dentro de Ubuntu que es el 1440:1433 ( esta ves lo realizare  por Visual Studio) :

Primero intalo una extension en mi caso intale 
![alt text](image-75.png)

despues le damos a conectar e insertamos el host y el puerto de nuestra base de datos : 

![alt text](image-76.png)
Y automaticamente sale nuestra base de datos feria, con sus tablas y sus 1000 inserciones : 

![alt text](image-77.png)

---------------------------------------

## Mongo 
--------------------------------------------------------
Se conecta los puertos del Docker que esta dentro de Ubuntu que es el 27018:27017 ( esta ves lo realizare  por Visual Studio) : 

Primero se inicializa una coneccion en la extension que instalamos en mongo DB 

![alt text](image-71.png)

Luego se inserta el la siguiente cadena

> mongodb://maria:12345@localhost:27018

esta cadena nos expesifica el puerto en el cual nos queremos conectar y asi asegurar  que el puerto de Docker dentro de ubuntu  sea totalmente funcionable

![alt text](image-72.png)

y se conecta donde dice connect, esto sirve para conectarte directamente a una base de datos MongoDB. 

![alt text](image-73.png)

y efectivamente nos conectamos a la base de datos feria creada. 

![alt text](image-74.png)

Esto significa que VS Code está conectado al contenedor mongo_dind de Docker que corre en el puerto 27018.

----------------------------------------------


y ya eso es es todo    

: ) 













