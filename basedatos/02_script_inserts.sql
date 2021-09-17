INSERT INTO perfiles(nombre_perfil)VALUES('Administrador');
INSERT INTO perfiles(nombre_perfil)VALUES('Contador');
INSERT INTO perfiles(nombre_perfil)VALUES('Cliente');
INSERT INTO perfiles(nombre_perfil)VALUES('Vendedor');

INSERT INTO usuarios(cod_perfil,nombre_usuario,clave_usuario,estado_usuario)
VALUES(1,'Admin','1234',1);
INSERT INTO usuarios(cod_perfil,nombre_usuario,clave_usuario,estado_usuario)
VALUES(2,'john','12345',1);
INSERT INTO usuarios(cod_perfil,nombre_usuario,clave_usuario,estado_usuario)
VALUES(3,'elPepe','0000',1);
