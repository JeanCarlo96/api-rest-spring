# api-rest-spring
Pasos Para Convertir en microservicio
1. En el pom.xml, al final del build, colocamos: <finalName>spring-boot-docker</finalName>
2. Creación del archivo DockerFile
3. Recompilación del proyecto para generar el jar con el nuevo nombre: mvn clean package
4. Ejecutar docker: docker build -t springservice .
5. Ejecutar el microservicio: docker run -it --rm -p 3001:8080 --name myspringservice springservice
	Nota: el API se levantará en el puerto 3001 => http://localhost:3001/personas
	
Pasos para uso de Docker Compose:
1. Una vez elaborado el archivo de docker-compose.yml debemo volver a empaquetar el proyecto con: mvn clean package -DskipTests
	Nota: Debemos saltarnos las pruebas por que la configuración va a fallar.
2. Construimos con un comando de Docker Compose indicando únicamente nuestro servicio: docker-compose build java_app
3. Consultamos que exista nuestra imagen con: docker images
	Nota: El nombre de la imagen está definida en el docker-compose.yml -> uce-java-app
4. Descargamos todas las imágenes que tengamos en el docker-compose.yml y levanta los contenedores con el orden especificado con: docker-compose up
	Nota: Si queremos que el log esté en segundo plano: docker-compose up -d
		  Si queremos eliminar todos los contenedores levantados: docker-compose down
		  Si queremos revisar que contenedores tenemos, podemos usar: docker ps
		  Si queremos ver que imágenes tenemos descargadas hacemos: docker images
		  Para eliminar las imágenes usamos el comando: docker image rm IMAGE_ID