#Integrador 3

create database proyectogc;
use proyectogc;

create table consultaUsuario(
id int auto_increment primary key,
nombre varchar(30),
nombre_alumno varchar(30),
email varchar(30),
telefono int,
turno varchar(30),
mensaje varchar(200)
);

insert into consultaUsuario values (1 ,"Fabian", "Federico", "falsoemail@gmail.com", 1234567, "mañana", "Prueba!");
insert into consultaUsuario values (2 ,"Federico", "Carlos", "falsoemail@gmail.com", 1234567, "Tarde", "Prueba!");
select *from consultaUsuario;








