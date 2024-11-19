
El proyecto usa Mysql como BD, si se desea ejecutar desde un IDE o WebServer local, se debe configurar la BD.

Se crea una imagen local para poder usar la aplicacion.

Crear imagen local de Mysql, desde Dockerfile en la carpeta mysql en el raiz.

Dentro de la carpeta mysql:

docker build -t mysql-mut:1.0 .  


docker run -d --name mysql-mutante -p 3306:3306  --env-file .env -v mysql_data:/var/lib/mysql mysql-mut:1.0

Los valores para application.properties del proyecto springboot.
root/Mutante123
