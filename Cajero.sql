/*drop table transaccion;*/




create table usuario(
	idUsuario int(10) not null auto_increment,
	cedula int (10) not null,
	contrasenia varchar (200) not null,
	saldo float not null,
	apellido varchar (200) not null,
	nombre varchar (200) not null,
	direccion varchar (500) not null,
	ruc int (15) not null,
	primary key(idUsuario)
);

insert into usuario(cedula, apellido, nombre, direccion, ruc) values(1104453319, 'miguelito', 'cabrera', 'somec', 00000);
insert into usuario(cedula, apellido, nombre, direccion, ruc) values(1104453318, 'monica', 'coronel', 'la salle', 00001);
insert into usuario(cedula, apellido, nombre, direccion, ruc) values(1111111111, 'fabricio', 'sisalima', 'parque lineal', 00002);	
insert into usuario(cedula, apellido, nombre, direccion, ruc) values(2222222222, 'elvis', 'freire', 'argelia', 00003);
insert into usuario(cedula, apellido, nombre, direccion, ruc) values(3333333333, 'dennys', 'ibarra', 'calle manuel zambrano', 00004);
insert into usuario(cedula, apellido, nombre, direccion, ruc) values(4444444444, 'eduardo', 'cabrera', 'somec', 00005);
insert into usuario(cedula, apellido, nombre, direccion, ruc) values(5555555555, 'ronald', 'anchundia', 'gasolinera valdivieso', 00006);


create table cuenta(
	idCuenta int(10) not null auto_increment,
	numero_cuenta int (15) not null,	
	tipo varchar (50) not null,
	saldo float(20) not null,
	idUsuario int(10) not null,
	primary key(idCuenta),
	foreign key(idUsuario) references usuario(idUsuario)
);

insert into cuenta(numero_cuenta,tipo, saldo, idUsuario) values(00000000002, 'ahorro', 125.00, 1);
insert into cuenta(numero_cuenta,tipo, saldo, idUsuario) values(00000000001, 'ahorro', 25.00, 2);
insert into cuenta(numero_cuenta,tipo, saldo, idUsuario) values(00000000020, 'ahorro', 00.00, 3);
insert into cuenta(numero_cuenta,tipo, saldo, idUsuario) values(00000000021, 'corriente', 1.00, 4);
insert into cuenta(numero_cuenta,tipo, saldo, idUsuario) values(0000000003, 'ahorro', 5.00, 5);
insert into cuenta(numero_cuenta,tipo, saldo, idUsuario) values(0000000050, 'ahorro', 12.00, 6);
/*
create table transaccion(
	idTransaccion int(10) not null auto_increment,
	operacion varchar(150) not null,
	fecha varchar (200) not null,	
	hora varchar (200) not null,
	cantidad float (200) not null,
	idCuenta int(10) not null,
	primary key(idTransaccion),
	foreign key(idTransaccion) references cuenta(idCuenta)
);
insert into transaccion(operacion, fecha, hora, cantidad,idCuenta) values('deposito', '10/12/2013','10:30',100,1);
insert into transaccion(operacion, fecha, hora, cantidad,idCuenta) values('retiro', '10/12/2013','10:30',165,2);*/



