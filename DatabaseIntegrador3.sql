#Integrador 3

create database proyectogc;
use proyectogc;
create table consultaUsuario(
id int auto_increment primary key,
nombre varchar(30),
nombrealumno varchar(30),
email varchar(30),
telefono int,
turno varchar(30),
mensaje varchar(200)
);

select *from consultaUsuario;

drop table consultaUsuario;

