create database tecnoimportsa;

use tecnoimportsa;

create table Direccion(
    idDireccion int not null auto_increment primary key,
    direccion1 varchar(150),
    direccion2 varchar(150),
    telefono1 varchar(10),
    telefono2 varchar(10)    
);

create table Cliente(
	idCliente varchar(10) primary key,
    idDireccion int not null,
    Nombre varchar(25),
    Apellido varchar(45),
    Mail varchar(150)    
);

create table Empleado(
	idEmpleado varchar(10) primary key,
    Nombre varchar(25),
    Apellido varchar(45),
    Cargo varchar(15),
    Sueldo int,
    username varchar(50) not null,
    password varchar(50) not null,
    sexo varchar(1)
);

create table Producto(
	idProducto int not null auto_increment primary key,
    Nombre varchar(70),
    Precio double,
    categoria varchar(55),
    descripcion varchar(150)
);

create table Tecnoimport(
	idTecnoimport int not null auto_increment primary key,
	Nombre varchar(25),
    idDireccion int not null,
    idGerente int not null,
    tipo varchar(10)
);

create table Cotizacion(
	idCotizacion int not null auto_increment primary key,
    id_prod_cot int not null,/*fk*/
    idEmpleado varchar(10),/*fk*/
    idCliente varchar(10),/*fk*/
    fecha date
);

create table Cotizacion_producto(
	idCotizacion_producto int not null auto_increment primary key,
	idCotizacion int not null, /*fk*/
    idProducto int not null /*fk*/
);

create table Factura(
	idFactura int not null auto_increment primary key,
    idCliente varchar(10),
    idEmpleado varchar(10),
    fecha Date,
    idTipo_pago int not null
);

create table Factura_detalle(
	idFacturaDetalle int not null auto_increment primary key,
    idProducto int not null, /*fk*/
    cantidad int default 1,
    idFactura int not null
);

create table Tipo_pago(
	idTipo_pago int not null auto_increment primary key,
    Pago varchar(20)
);

create table Pedido(
	idPedido int not null auto_increment primary key,
    idDetalle_pedido int not null,
    idEntrega int not null,
    fecha date
);

create table Pedido_abastecimiento(
	idPedido_abastecimiento int not null auto_increment primary key,
    idSucursal int not null,
    total decimal,
    idDireccion int not null,
    idPedido int not null
);

create table Detalle_pedido(
	idDetalle_pedido int not null auto_increment primary key,
    idProducto int not null,
    cantidad int
);

create table Ruta_Entrega(
	idRuta_entrega int not null auto_increment primary key,
    estado boolean,
    idEmpleado varchar(10)
);

create table Ventas_Local(
	idVentas int not null auto_increment primary key,
    idFactura int not null,
    idEmpleado varchar(10)
);

create table Ventas_Domicilio(
	idVentasDomicilio int not null auto_increment primary key,
    idFactura int not null,
    idPedido int not null,
    idDireccion int not null
);

create table Inventario(
	idInventario int not null auto_increment primary key,
    idTecnoimport int not null,
    idProducto int not null,
    Stock int
);

alter table Cliente
add foreign key fk_direccion(idDireccion)
references Direccion(idDireccion);

alter table Cotizacion
add foreign key fk_Cotizacion_empl(idEmpleado)
references Empleado(idEmpleado);

alter table Cotizacion
add foreign key fk_Cotizacion_cliente(idCliente)
references Cliente(idCliente);

alter table Cotizacion
add foreign key fk_Cotizacion_cot_prod(id_prod_cot)
references Cotizacion_producto(idCotizacion_producto);

alter table Cotizacion_producto
add foreign key fk_Cotizacion_producto_idCot(idCotizacion)
references Cotizacion(idCotizacion);

alter table Cotizacion_producto
add foreign key fk_producto_idProd(idProducto)
references Producto(idProducto);

alter table Factura
add foreign key fk_Factura_cliente(idCliente)
references Cliente(idCliente);

alter table Factura
add foreign key fk_Factura_empl(idEmpleado)
references Empleado(idEmpleado);

alter table Factura
add foreign key fk_Factura_tipoPago(idTipo_pago)
references Tipo_pago(idTipo_pago);

alter table Factura_detalle
add foreign key fk_Factura_detalle_prod(idProducto)
references Producto(idProducto);

alter table Factura_detalle
add foreign key fk_Factura_detalle_idFac(idFactura)
references Factura(idFactura);

alter table Pedido
add foreign key fk_Pedido_detalle(idDetalle_pedido)
references Detalle_pedido(idDetalle_pedido);

alter table Pedido
add foreign key fk_Pedido_entrega(idEntrega)
references Ruta_Entrega(idRuta_entrega);

alter table Pedido_abastecimiento
add foreign key fk_Pedido_abastecimiento_ped(idPedido)
references Pedido(idPedido);

alter table Pedido_abastecimiento
add foreign key fk_Pedido_abastecimiento_sucursal(idSucursal)
references Tecnoimport(idTecnoimport);

alter table Pedido_abastecimiento
add foreign key fk_Pedido_abastecimiento_dir(idDireccion)
references Direccion(idDireccion);

alter table Detalle_pedido
add foreign key fk_detalle_pedido_prod(idProducto)
references Producto(idProducto);

alter table Ruta_Entrega
add foreign key fk_ventas_idEmpl(idEmpleado)
references Empleado(idEmpleado);

alter table Ventas_Local
add foreign key fk_ventas_idFac(idFactura)
references Factura(idFactura);

alter table Ventas_Local
add foreign key fk_ventas_idEmpl(idEmpleado)
references Empleado(idEmpleado);

alter table Ventas_Domicilio
add foreign key fk_ventas_idFac(idFactura)
references Factura(idFactura);

alter table Ventas_Domicilio
add foreign key fk_ventas_pedido(idPedido)
references Pedido(idPedido);

alter table Ventas_Domicilio
add foreign key fk_ventas_dir(idDireccion)
references Direccion(idDireccion);

alter table Inventario
add foreign key fk_inv_bod_pro(idProducto)
references Producto(idProducto);

alter table Inventario
add foreign key fk_inv_tec(idTecnoimport)
references Tecnoimport(idTecnoimport);

insert into Empleado values('097483391','juan','vega','administrador',800,'jvega','jvega','M');
insert into Empleado values('020394615','andrea','martinez','gerente',1000,'amartinez','amartinez','F');
insert into Empleado values('095647334','carla','aguilar','gerente local',900,'caguilar','caguilar','F');
insert into Empleado values('097205243','sebastian','sumba','jefe de bodega',700,'ssumba','ssumba','M');

insert into Empleado values('097865523','elena','lopez','vendedor',500,'elopez','elopez','F');
insert into Empleado values('029109554','diego','pelaez','vendedor',500,'dpelaez','dpelaez','M');
insert into Empleado values('091989230','jose','Carrion','vendedor',500,'jcarrion','jcarrion','M');

insert into Empleado values('091222230','luis','costa','repartidor',200,'lcosta','lcosta','M');
insert into Empleado values('091903021','diego','toral','repartidor',200,'dtoal','dtoal','M');
insert into Empleado values('091999457','adrian','acosta','repartidor',200,'aacosta','aacosta','M');
insert into Empleado values('091983249','kevin','larrea','repartidor',200,'klarrea','klarrea','M');

insert into Direccion(idDireccion, direccion1) values(0,'La Puntilla, El rio');
insert into Direccion(idDireccion, direccion1) values(0,'La Puntilla, Las Riberas');
insert into Direccion(idDireccion, direccion1) values(0,'La Puntilla');
insert into Direccion(idDireccion, direccion1) values(0,'Puerto Santa Ana');
insert into Direccion(idDireccion, direccion1) values(0,'9 de octubre y Escobedo');
insert into Direccion(idDireccion, direccion1) values(0,'Ceibos norte');
insert into Direccion(idDireccion, direccion1) values(0,'P. Icaza y Escobedo');

insert into Cliente values('0919893206',1,'luz','cajiao','lcajiao@gmail.com');
insert into Cliente values('0994883065',2,'carlos','mosquera','cmosquera@gmail.com');
insert into Cliente values('0999475811',3,'mario','mendez','mmendez@gmail.com');
insert into Cliente values('0928334556',4,'maria','camacho','mcamacho@gmail.com');
insert into Cliente values('0960930312',5,'roberto','jimenez','rjimenez@gmail.com');

insert into Producto values(0,'Nintendo DS',200,'videojuegos','pantalla led, nintendo');
insert into Producto values(0,'XBOX 360',400,'videojuegos','consola');
insert into Producto values(0,'PlayStation 4',430,'videojuegos','consola');
insert into Producto values(0,'Macbook Pro',1000,'computadora','2018 touch bar 500gb, 4 GB DDR4');
insert into Producto values(0,'Acer Aspire 5',309.99,'computadora','4 GB DDR4');
insert into Producto values(0,'Acer Predator Helios',999.99,'computadora','computador pesonal');
insert into Producto values(0,'Apple iPad',249.99,'tablet','version 3, HD');
insert into Producto values(0,'Jumper EZpad Go',319.90,'tablet','pantalla tactil full hd');
insert into Producto values(0,'Chuwi HI10 AIR Tablet',169,'tablet','2K Resolución Pantalla');
insert into Producto values(0,'Panasonic LUMIX Cámara digital',297.99,'camara','Panasonic LUMIX');

insert into Tipo_pago values(0,'efectivo');
insert into Tipo_pago values(0,'visa');
insert into Tipo_pago values(0,'paypal');

insert Factura values(0,'0919893206','091989230','2019-5-04',1);
insert Factura values(0,'0960930312','097865523','2019-5-05',2);
insert Factura values(0,'0928334556','029109554','2019-5-06',3);
insert Factura values(0,'0919893206','029109554','2019-5-07',1);
insert Factura values(0,'0994883065','029109554','2019-5-08',1);

insert Ventas_Local values(0,1,'097865523');
insert Ventas_Local values(0,2,'029109554');
insert Ventas_Local values(0,3,'029109554');

insert Detalle_pedido values (0,1,4);
insert Detalle_pedido values (0,2,3);
insert Detalle_pedido values (0,3,2);
insert Detalle_pedido values (0,5,6);
insert Detalle_pedido values (0,6,4);

insert Ruta_Entrega values(0,0,'091983249');
insert Ruta_Entrega values(0,0,'091999457');
insert Ruta_Entrega values(0,0,'091903021');

insert Pedido values (0,1,1,'2019-6-22');
insert Pedido values (0,2,1,'2019-6-22');
insert Pedido values (0,3,2,'2019-6-22');
insert Pedido values (0,4,3,'2019-6-22');
insert Pedido values (0,3,2,'2019-6-22');
insert Pedido values (0,4,3,'2019-6-22');

insert Ventas_Domicilio values(0,4,3,2);
insert Ventas_Domicilio values(0,5,4,3);


insert Factura_detalle values(0,1,4,1);
insert Factura_detalle values(0,2,9,2);
insert Factura_detalle values(0,3,2,3);
insert Factura_detalle values(0,5,1,4);
insert Factura_detalle values(0,5,1,5);
insert Factura_detalle values(0,1,1,5);

insert Tecnoimport values(0,'tecnoBodega',1,'097205243','bodega');
insert Tecnoimport values(0,'Sucursal Norte',3,'095647334','sucursal');
insert Tecnoimport values(0,'Matriz Norte',5,'020394615','matriz');

insert Inventario values(0,1,1,70);
insert Inventario values(0,1,2,70);
insert Inventario values(0,1,3,70);
insert Inventario values(0,1,4,70);
insert Inventario values(0,1,5,70);

insert Inventario values(0,2,1,40);
insert Inventario values(0,2,2,40);
insert Inventario values(0,2,3,40);
insert Inventario values(0,2,4,40);
insert Inventario values(0,2,5,40);

insert Inventario values(0,3,1,40);
insert Inventario values(0,3,2,40);
insert Inventario values(0,3,3,40);
insert Inventario values(0,3,4,40);
insert Inventario values(0,3,5,40);

create view Inventariobodega as
SELECT Nombre, descripcion,categoria,Stock FROM Inventario
join Producto where Inventario.idProducto = Producto.idProducto and idTecnoimport=1;

create view InventarioMatriz as
SELECT Nombre, descripcion,categoria,Stock FROM Inventario
join Producto where Inventario.idProducto = Producto.idProducto and idTecnoimport=3;

create view InventarioSucursal as
SELECT Nombre, descripcion,categoria,Stock FROM Inventario
join Producto where Inventario.idProducto = Producto.idProducto and idTecnoimport=2;





