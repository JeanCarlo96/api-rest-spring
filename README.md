# api-rest-spring
Pasos Para Convertir en microservicio
1. En el pom.xml, al final del build, colocamos: <finalName>spring-boot-docker</finalName>
2. Creación del archivo DockerFile
3. Recompilación del proyecto para generar el jar con el nuevo nombre: mvn clean package
4. Ejecutar docker: docker build -t springservice .
5. Ejecutar el microservicio: docker run -it --rm -p 3001:8080 --name myspringservice springservice
	Nota: el API se levantará en el puerto 3001 => http://localhost:3001/personas