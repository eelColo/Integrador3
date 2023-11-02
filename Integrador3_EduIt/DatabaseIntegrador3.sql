#Integrador 3

create database proyectogc;
use proyectogc;
create table consultaUsuario(
id int auto_increment primary key,
pnombre varchar(30),
snombre varchar(30),
email varchar(30),
telefono int,
tipoconsulta varchar(30),
comentario varchar(200)
);

select *from consultaUsuario;

