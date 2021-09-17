CREATE TABLE perfiles(
cod_perfil int AUTO_INCREMENT,
nombre_perfil varchar(150) not null,
primary key(cod_perfil)
);

create unique index indice_nomPerfil on perfiles(nombre_perfil);

CREATE TABLE usuarios(
cod_usuario int AUTO_INCREMENT,
cod_perfil int not null,
nombre_usuario varchar(150) not null,
clave_usuario varchar(150) not null,
estado_usuario varchar(150) not null,
primary key(cod_usuario)
);
create unique index indice_nomUsu on usuarios(nombre_usuario);

ALTER TABLE usuarios ADD CONSTRAINT FK_usuarios_ref_perfiles FOREIGN key (cod_perfil)
references perfiles(cod_perfil)  
ON DELETE RESTRICT 
ON UPDATE CASCADE;