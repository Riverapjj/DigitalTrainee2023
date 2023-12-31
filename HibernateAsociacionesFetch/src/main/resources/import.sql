INSERT INTO cliente (id, nombre, apellido, forma_pago, creado_en, editado_en) VALUES (1,'Andres','Guzman','debito',NULL,NULL);
INSERT INTO cliente (id, nombre, apellido, forma_pago, creado_en, editado_en) VALUES (2,'John','Doe','credito',NULL,NULL);
INSERT INTO cliente (id, nombre, apellido, forma_pago, creado_en, editado_en) VALUES (4,'Pepa','Doe','debito',NULL,NULL);
INSERT INTO cliente (id, nombre, apellido, forma_pago, creado_en, editado_en) VALUES (5,'Luci','Martinez','credito',NULL,NULL);
INSERT INTO cliente (id, nombre, apellido, forma_pago, creado_en, editado_en) VALUES (6,'Luna','Garcia','debito',NULL,NULL);
INSERT INTO cliente (id, nombre, apellido, forma_pago, creado_en, editado_en) VALUES (9,'John','Roe','paypal',NULL,NULL);
INSERT INTO cliente (id, nombre, apellido, forma_pago, creado_en, editado_en) VALUES (10,'Lou','Loe','paypal',NULL,NULL);
INSERT INTO cliente (id, nombre, apellido, forma_pago, creado_en, editado_en) VALUES (11,'Lalo','Mena','webpay','2021-10-01 10:45:45','2021-10-01 10:47:13');
INSERT INTO cliente (id, nombre, apellido, forma_pago, creado_en, editado_en) VALUES (12,'Pia','Perez','paypal plus','2021-10-01 11:48:30','2021-10-01 11:49:35');


INSERT INTO alumnos (id, nombre, apellido) VALUES(1, 'Johana', 'Doe');
INSERT INTO alumnos (id, nombre, apellido) VALUES(2, 'Pepe', 'Gon');

INSERT INTO cursos (id, titulo, profesor) VALUES(1, 'Curso Spring', 'Andres');
INSERT INTO cursos (id, titulo, profesor) VALUES(2, 'Curso Java EE 9', 'Andres');

INSERT INTO direcciones (calle, numero) VALUES ("Vaticano", 123);
INSERT INTO direcciones (calle, numero) VALUES ("Colon", 456);

INSERT INTO tbl_clientes_direcciones (id_cliente, id_direccion) VALUES (1, 1);
INSERT INTO tbl_clientes_direcciones (id_cliente, id_direccion) VALUES (1, 2);

INSERT INTO cliente_detalles (prime, puntos_acumulados, cliente_detalle_id) VALUES (1, 8000, 1);

INSERT INTO tbl_alumnos_cursos (alumno_id, curso_id) VALUES (1, 1);
INSERT INTO tbl_alumnos_cursos (alumno_id, curso_id) VALUES (1, 2);