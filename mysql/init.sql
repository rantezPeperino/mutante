-- Asegurar que la base de datos existe
CREATE DATABASE mutante;


-- Asegurarse de que el usuario existe y tiene los permisos correctos
CREATE USER IF NOT EXISTS 'mutante'@'%' IDENTIFIED BY 'Admin321';
GRANT ALL PRIVILEGES ON mutante.* TO 'mutante'@'%';

USE mutante;

